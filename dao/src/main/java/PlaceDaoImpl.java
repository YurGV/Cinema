import dao.PlaceDao;
import model.Place;

public class PlaceDaoImpl extends AbstractDao<Place> implements PlaceDao {


    @Override
    public Place getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Place update(Place entity){

        Place updPlace = getById(entity.getId());

        updPlace.setNumber(entity.getNumber());
        updPlace.setRow(entity.getRow());
        updPlace.setStatus(entity.getStatus());
        updPlace.setSector(entity.getSector());

        return updPlace;
    }

}
