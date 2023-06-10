package backend.order;

import backend.orderline.OrderlineCartModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Long userId;
    private String address;
    private Float totalPrice;
    private List<OrderlineCartModel> orderlineCartModels;
}
