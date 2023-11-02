package resouce;

import com.EngSoftware.aulapratica.entities.User;

import services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @SuppressWarnings("unused")
	@Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
		return null;
        // Implement the logic here
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
		return null;
        // Implement the logic here
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user) {
		return null;
        // Implement the logic here
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
		return null;
        // Implement the logic here
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
		return null;
        // Implement the logic here
    }
}
