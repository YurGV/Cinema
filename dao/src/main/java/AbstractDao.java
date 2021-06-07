import dao.GenericDao;


import java.util.ArrayList;
import java.util.List;


public class AbstractDao<T> implements GenericDao<T> {

    public  List<T> repository = new ArrayList<>() ;

    public void save(T entity) {
        repository.add(entity);
    }

    @Override
    public T getById(Long id) {
        return null;
    }

    public List<T> getAll() {
        return new ArrayList<>(repository);
    }

    public T update(T entity) {
        return null;
    }

    public void delete(T entity) {
        repository.remove(entity);
    }

}
