import dao.TicketDao;
import model.Ticket;
import service.TicketServiceImpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TicketService implements TicketServiceImpl {

    private final TicketDao ticketDao;

    public TicketService(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }


}
