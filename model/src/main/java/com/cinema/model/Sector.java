package com.cinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sector")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal price;


    @OneToMany (mappedBy = "sector", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Place> places;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
}
