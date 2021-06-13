import dao.GenericDao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.ArrayList;
import java.util.List;


public class AbstractDao<T> implements GenericDao<T> {

//    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
//    private EntityManager entityManager;

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
