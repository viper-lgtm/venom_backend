package backend.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

//@Entity(name = "User")
@Entity
//@Accessors(chain = true)
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String name;
    private String picture;

//    @OneToMany
//    private List<Orderline> orderlineList;
}
