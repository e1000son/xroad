package mz.gov.inage.xroad.repos;

import mz.gov.inage.xroad.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
