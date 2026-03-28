package User.Management.API.User.Management.API.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import User.Management.API.User.Management.API.Entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
}
