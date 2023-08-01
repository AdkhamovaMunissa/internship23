package azuredataapi.apiforweb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import azuredataapi.apiforweb.model.User;
import azuredataapi.apiforweb.dto.LoginDto;


@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String name);
    // Optional<User> findOneByEmailAndPassword(String email, String password);
    // User findByEmail(String email);
}
