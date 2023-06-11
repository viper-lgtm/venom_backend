package backend.order;

import backend.orderline.Orderline;
import backend.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Data
@Accessors(chain = true)
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float totalPrice;
    private String deliveryAddress;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "orderItem", cascade = CascadeType.ALL)
    private List<Orderline> orderlines;
}
