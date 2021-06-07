import model.Seance;

public class SeanceDaoImpl extends AbstractDao<Seance> implements dao.SeanceDao {



    @Override
    public Seance getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Seance update(Seance entity){

        Seance updSeance = getById(entity.getId());

        updSeance.setFilm(entity.getFilm());
        updSeance.setHall(entity.getHall());
        updSeance.setCinema(entity.getCinema());
        updSeance.setTicketList(entity.getTicketList());

        return updSeance;
    }
}
