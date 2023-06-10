package backend.orderline;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderlineControler {
    private final OrderlineServiceRepo service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Orderline create(@RequestBody OrderlineModel orderlineModel) {
        return service.createOrderline(orderlineModel);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void updateOrderline(@RequestParam Long orderlineId, @RequestParam Long amount) {
        service.updateOrderlineById(orderlineId, amount);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderlineCartModel> getOrderlineCartModel(@RequestParam Long userId) {
        return service.getOrderlineCartModel(userId);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteOrderlineById(@RequestParam Long orderlineId) {
        service.deleteOrderlineById(orderlineId);
    }
}
