import dao.TicketDao;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class TicketServiceImpl implements service.TicketService {

    @Autowired
    private final TicketDao ticketDao;

}
