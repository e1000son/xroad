package mz.gov.inage.xroad.repos;

import mz.gov.inage.xroad.entities.Citizen;
import mz.gov.inage.xroad.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitizenRepository extends JpaRepository<Citizen, Long> {
}
