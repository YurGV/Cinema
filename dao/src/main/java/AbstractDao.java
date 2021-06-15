import dao.GenericDao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

//Опять про зависимости мавена забыл, у тебя интерфейсы лежат в другом пакете
//класс обозвал абстракт, а модификатор не добавил
public abstract class AbstractDao<T> implements GenericDao<T> {

    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    @Getter
    protected EntityManager entityManager;

    @Override
    public abstract Class<T> getEntityClass();

    public void save(T entity) {
        getEntityManager().persist(entity);
    }

    public abstract T getById(Long id);

    public abstract List<T> getAll();

    public T update(T entity) {
        return getEntityManager().merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

}
