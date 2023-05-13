package backend.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {
    private final ProductServiceRepo service;

//    @GetMapping
//    public List<Product> findAll() {
//        return service.findAll();
//    }

    @GetMapping
    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        products.add("1");
        products.add("2");
        products.add("3");
        products.add("5");
        return products;
    }
}
