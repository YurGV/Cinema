package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enums.Country;
import model.enums.Format;
import model.enums.Genre;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "films")
public class Film {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private Date year;
    @Column
    private Integer durability;
    @Column
    private Country county;
    @Column
    private Format format;
    @Column
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToOne(mappedBy = "seance")
    private Seance seance;
}