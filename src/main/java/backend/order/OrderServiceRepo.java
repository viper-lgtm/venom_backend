package backend.order;

import backend.orderline.Orderline;
import backend.orderline.OrderlineRepository;
import backend.user.User;
import backend.user.UserRepository;
import jakarta.persistence.GeneratedValue;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceRepo implements OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final OrderlineRepository orderlineRepository;

    @Override
    public Order create(OrderDto orderDto) {
        User user = userRepository.findById(orderDto.getUserId()).get();
        List<Orderline> orderlinesByUserId = orderlineRepository.findOrderlinesByUserId(orderDto.getUserId());
        Order order = new Order()
                .setTotalPrice(orderDto.getTotalPrice())
                .setDeliveryAddress(orderDto.getAddress())
                .setUser(user)
                .setOrderlines(orderlinesByUserId);
        return orderRepository.save(order);
    }
}
