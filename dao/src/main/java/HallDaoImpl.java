import dao.HallDao;
import model.Hall;
import org.springframework.stereotype.Repository;

@Repository
public class HallDaoImpl extends AbstractDao<Hall> implements HallDao {


    @Override
    public Hall getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Hall update(Hall entity){

        Hall updHall = getById(entity.getId());

        updHall.setName(entity.getName());
        updHall.setCapacity(entity.getCapacity());
        updHall.setCinema(entity.getCinema());
        updHall.setSectors(entity.getSectors());
        updHall.setSeances(entity.getSeances());

        return updHall;
    }
}
