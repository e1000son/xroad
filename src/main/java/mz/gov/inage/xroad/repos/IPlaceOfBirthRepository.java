package mz.gov.inage.xroad.repos;

import mz.gov.inage.xroad.entities.Citizen;
import mz.gov.inage.xroad.entities.PlaceOfBirth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlaceOfBirthRepository extends JpaRepository<PlaceOfBirth, Long> {
}
