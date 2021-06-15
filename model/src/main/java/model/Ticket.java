package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ticket")// давай все-таки в единственном числе, мно просто какпец как глаз режет
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "seance_id")
    private Seance seance;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
