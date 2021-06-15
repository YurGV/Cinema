package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "seance")// давай все-таки в единственном числе, мно просто какпец как глаз режет
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "seance", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> tickets;
}
