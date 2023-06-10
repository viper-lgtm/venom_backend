package backend.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderController {

    private final OrderServiceRepo service;

    @PostMapping
    public Orders create(@RequestBody OrderDto orderDto) {
        return service.create(orderDto);
    }


}
