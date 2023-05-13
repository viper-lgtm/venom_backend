package backend.product;

import java.util.Collection;
import java.util.Optional;

public interface ProductService {

    Collection<Product> findAll();
    Optional<Product> findById(Long id);
}
