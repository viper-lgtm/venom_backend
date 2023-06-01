package backend.orderline;

import backend.product.Product;
import backend.product.ProductRepository;
import backend.user.User;
import backend.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderlineServiceRepo implements OrderlineService {
    private final OrderlineRepository orderlineRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Override
    public Orderline createOrderline(OrderlineModel orderlineModel) {
//        List<Orderline> orderlinesByUserId = orderlineRepository.findOrderlinesByUserId(orderlineModel.getUserId());

        Optional<Product> optionalProduct = productRepository.findById(orderlineModel.getProductId());
        Optional<User> optionalUser = userRepository.findById(orderlineModel.getUserId());
        Orderline orderline = new Orderline()
                .setAmount(orderlineModel.getAmount())
                .setTotalPrice(orderlineModel.getTotalPrice())
                .setProduct(optionalProduct.get())
                .setUser(optionalUser.get());
        return orderlineRepository.save(orderline);
    }

    @Override
    @Transactional
    public void updateOrderlineById(Long orderlineId, Long amount) {
        if (amount <= 0) {
            orderlineRepository.deleteById(orderlineId);
        } else {
            Orderline orderline = orderlineRepository.findById(orderlineId).get();
            Float productPrice = orderline.getProduct().getPrice();
            orderline.setAmount(amount);
            orderline.setTotalPrice(amount * productPrice);
            orderlineRepository.save(orderline);
//            orderlineRepository.updateAmountAndTotalPriceById(orderlineId, amount * productPrice, amount);
        }
    }

    @Override
    public List<OrderlineCartModel> getOrderlineCartModel(Long id) {
        List<Orderline> orderlinesByUserId = orderlineRepository.findOrderlinesByUserId(id);
        List<OrderlineCartModel> orderlineCartModelList = new ArrayList<>();
        for (Orderline o : orderlinesByUserId) {
            orderlineCartModelList.add(new OrderlineCartModel(
                    o.getId(),
                    o.getProduct().getTitle(),
                    o.getProduct().getThumbnail(),
                    o.getTotalPrice(),
                    o.getAmount())
            );
        }
        return orderlineCartModelList;
    }

    @Override
    public void deleteOrderlineById(Long orderlineId) {
        orderlineRepository.deleteById(orderlineId);
    }


}
