package ma.enset.hopital1.security.repo;

import ma.enset.hopital1.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String> {
}
