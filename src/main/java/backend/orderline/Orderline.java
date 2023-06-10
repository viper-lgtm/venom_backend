package backend.orderline;

import backend.order.Orders;
import backend.product.Product;
import backend.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Accessors(chain = true)
public class Orderline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amount;
    private Float totalPrice;

    @OneToOne
    private Product product;

    @OneToOne
    private User user;

    @ManyToOne
    private Orders orders;
}
