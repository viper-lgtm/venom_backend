package backend.orderline;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface OrderlineService {

    Orderline createOrderline(OrderlineModel orderlineModel);

    void updateOrderlineById(Long orderlineId, Long amount);

    Collection<OrderlineCartModel> getOrderlineCartModel(Long id);

    void deleteOrderlineById(Long id);
}
