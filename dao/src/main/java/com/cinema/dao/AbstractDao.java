package com.cinema.dao;

import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


//Опять про зависимости мавена забыл, у тебя интерфейсы лежат в другом пакете
public abstract class AbstractDao<T> implements GenericDao<T> {

    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    @Getter
    protected EntityManager entityManager; //основной интерфейс ORM, служит для управления персистентными(неизменными) сущностями

    @Override
    public abstract Class<T> getEntityClass();

    @Override
    public void save(T entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public abstract T getById(Long id);

    @Override
    public List<T> getAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(getEntityClass());
        return entityManager.createQuery(query).getResultList();
    }

//    public List<T> getByName(String fName, String lName) {
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<T> query = criteriaBuilder.createQuery(getEntityClass());
//        Root<T> c = query.from(getEntityClass());
//        query.select(c)
//            .distinct(true)
//            .where(criteriaBuilder.like());
//        return entityManager.createQuery(query).getResultList();
//    }

    @Override
    public T update(T entity) {
        return getEntityManager().merge(entity);
    }

    @Override
    public void delete(T entity) {
        entityManager.remove(entity);
    }


}
