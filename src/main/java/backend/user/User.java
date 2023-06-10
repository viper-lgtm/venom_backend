package backend.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String name;
    private String picture;
    private String city;
    private String address;

//    @OneToMany
//    private List<Orderline> orderlineList;
}
