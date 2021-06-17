package com.cinema.dao;

import java.util.List;

public interface GenericDao<T> {
    //класс нужен для параметризации в энтити менеджере
    Class<T> getEntityClass();

    void save(T entity);
    T getById(Long id);
    List<T> getAll();
    T update(T entity);
    void delete(T entity);

}
