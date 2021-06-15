
import dao.ClientDao;
import lombok.RequiredArgsConstructor;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ClientIService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
@Service
// реализация, если она не абстракт, должна имплементить все методы интерфейса
public class ClientServiceImpl implements ClientIService {

    @Autowired
    private final ClientDao clientDao;

    @Override
    public Client addClient(String firstName, String lastName, String email, String password) {
        Client newClient = new Client();
        clientDao.save(newClient);
        return newClient;
    }
    @Override
    public Client getClient(Long id) {
        return clientDao.getById(id);
    }
    @Override
    public List<Client> getClients() {
        return clientDao.getAll();
    }
    @Override
    public Client editClient(Long id, String firstName, String lastName, String email, String password) {

        Client client = clientDao.getById(id);

        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setPassword(password);
        clientDao.save(client);

        return client;
    }

    @Override
    public Optional<Client> findByName(final String firstName, String lastName) {

        return clientDao.getAll().stream()
                .filter(x -> x.getFirstName().equals(firstName))
                .filter(x -> x.getLastName().equals(lastName))
                .findFirst();
    }
    @Override
    public void deleteClient(Long id) {
        clientDao.delete(clientDao.getById(id));
    }
}
