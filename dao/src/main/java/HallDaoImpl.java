import model.Hall;

public class HallDaoImpl extends AbstractDao<Hall> implements dao.HallDao {


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
        updHall.setSectorList(entity.getSectorList());
        updHall.setSeanceList(entity.getSeanceList());

        return updHall;
    }
}
