import dao.TicketDao;
import model.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {


    @Override
    public Ticket getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Ticket update(Ticket entity) {

        Ticket updTicket = getById(entity.getId());

        updTicket.setSeance(entity.getSeance());
        updTicket.setClient(entity.getClient());

        return updTicket;
    }
}
