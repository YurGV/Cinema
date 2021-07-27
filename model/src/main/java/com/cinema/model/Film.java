package com.cinema.model;

import com.cinema.model.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.cinema.model.enums.Country;
import com.cinema.model.enums.Format;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "film")
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
    @Enumerated(EnumType.STRING)
    private Format format;
    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToOne(mappedBy = "seance")
    private Seance seance;
}