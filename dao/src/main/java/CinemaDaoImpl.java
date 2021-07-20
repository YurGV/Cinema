
import dao.CinemaDao;
import model.Cinema;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


@Repository
public class CinemaDaoImpl extends AbstractDao<Cinema> implements CinemaDao {


    @Override
    public Class<Cinema> getEntityClass() {
        return Cinema.class;
    }

    @Override
    public Cinema getById(Long id) {
//используем entityManager
        return getEntityManager().find(getEntityClass(), id);
    }

    @Override
    public List<Cinema> getAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cinema> query = criteriaBuilder.createQuery(Cinema.class);
        return entityManager.createQuery(query).getResultList();
    }

    //и вообще в абстрактДао этот метод реализуем
//    @Override
//    public Cinema update(Cinema entity) {
//
//        //вот про это писал уже, зачем нам плодить сущности?
//        Cinema updCinema = getById(entity.getId());
//
//        updCinema.setId(entity.getId());
//        updCinema.setName(entity.getName());
//        updCinema.setEmail(entity.getEmail());
//        updCinema.setAddress(entity.getAddress());
//        updCinema.setNumberOfCinemaHall(entity.getNumberOfCinemaHall());
//        updCinema.setFilms(entity.getFilms());
//        updCinema.setSeances(entity.getSeances());
//        updCinema.setHalls(entity.getHalls());
//        return updCinema;
//
//    }

}
