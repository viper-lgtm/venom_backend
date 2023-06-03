package backend.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceRepo implements UserService {
    private final UserRepository repository;

    @Override
    public User create(User user) {
//        Optional<User> userByEmail = repository.findByEmail(user.getEmail());
//        if (!userByEmail.isPresent()) {
//            return repository.save(user);
//        }
//        return null;
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public Optional<User> findByName(String name) {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}
