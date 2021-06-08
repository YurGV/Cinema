import dao.ClientDao;
import model.Client;


public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {


    @Override
    public Client getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Client update(Client entity) {

        Client updClient = getById(entity.getId());

        updClient.setFirstName(entity.getFirstName());
        updClient.setLastName(entity.getLastName());
        updClient.setEmail(entity.getEmail());
        updClient.setPassword(entity.getPassword());
        updClient.setTickets(entity.getTickets());

        return updClient;

    }
}
