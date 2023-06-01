package backend.orderline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderlineCartModel {

    private Long id;
    private String title;
    private String thumbnail;
    private float totalPrice;
    private Long amount;
}
