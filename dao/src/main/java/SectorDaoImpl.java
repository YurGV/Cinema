import dao.SectorDao;
import model.Sector;


public class SectorDaoImpl extends AbstractDao<Sector> implements SectorDao {


    @Override
    public Sector getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Sector update(Sector entity){

        Sector updSector = getById(entity.getId());

        updSector.setName(entity.getName());
        updSector.setPrice(entity.getPrice());
        updSector.setPlaces(entity.getPlaces());
        updSector.setHall(entity.getHall());

        return updSector;
    }
}
