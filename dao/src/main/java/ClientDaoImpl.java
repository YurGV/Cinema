import dao.ClientDao;
import model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {


    @Override
    public Class<Client> getEntityClass() {
        return Client.class;
    }

    @Override
    public Client getById(Long id) {

        return getEntityManager().find(getEntityClass(), id);
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

//    @Override
//    public Client update(Client entity) {
//
//        Client updClient = getById(entity.getId());
//
//        updClient.setFirstName(entity.getFirstName());
//        updClient.setLastName(entity.getLastName());
//        updClient.setEmail(entity.getEmail());
//        updClient.setPassword(entity.getPassword());
//        updClient.setTickets(entity.getTickets());
//
//        return updClient;
//
//    }
}
