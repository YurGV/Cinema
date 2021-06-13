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
@Table(name = "halls")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    @Column
    private Integer capacity;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany (mappedBy = "sector", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sector> sectors;

    @OneToMany (mappedBy = "seance", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Seance> seances;

}
