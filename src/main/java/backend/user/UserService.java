package backend.user;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(User user);

    User update(User user);

    User findByName(String name);

    User findByEmail(String email);

    List<User> findAll();

    Optional<User> findById(Long id);
}
