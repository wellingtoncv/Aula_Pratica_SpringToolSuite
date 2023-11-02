package config;

import com.EngSoftware.aulapratica.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @SuppressWarnings("unused")
	@Autowired
    private UserRepository userRepository;

   // @Bean
    public CommandLineRunner loadData() {
        return args -> {
           //User u1 = new User(null, "Maria", "maria@gmail.com", "993110555", "123456");
          // User u2 = new User(null, "Bob", "bob@gmail.com", "987456234", "456123");
          // userRepository.saveAll(Arrays.asList(u1, u2));
        };
    }
}

