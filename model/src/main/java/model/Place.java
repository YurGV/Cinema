package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enums.Status;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "place")// давай все-таки в единственном числе, мно просто какпец как глаз режет
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer number;
    @Column
    private Integer row;
    @Column
    private Status status;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;
}
