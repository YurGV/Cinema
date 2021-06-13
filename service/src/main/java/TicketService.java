import dao.TicketDao;
import lombok.RequiredArgsConstructor;
import model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TicketServiceImpl;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class TicketService implements TicketServiceImpl {

    @Autowired
    private final TicketDao ticketDao;

}
