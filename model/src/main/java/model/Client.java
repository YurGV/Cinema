package model;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    @OneToMany (mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> tickets;

}
