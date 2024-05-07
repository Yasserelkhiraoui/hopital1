package ma.enset.hopital1.security.repo;

import ma.enset.hopital1.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>{
    AppUser findByUsername(String username);
}
