package backend.orderline;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class OrderlineModel {

    private Long id;
    private Long amount;
    private Float totalPrice;
    private Long productId;
    private Long userId;
}
