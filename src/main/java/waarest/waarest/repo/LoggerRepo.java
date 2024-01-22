package waarest.waarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import waarest.waarest.entity.Logger;

public interface LoggerRepo extends JpaRepository<Logger, Long> {
//    Logger save(Logger logger);
}
