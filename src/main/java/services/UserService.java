package services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.EngSoftware.aulapratica.entities.User;


@Service
public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User insert(User user);

    void delete(Long id);

    User update(Long id, User user);
}
