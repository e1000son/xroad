package mz.gov.inage.xroad.repos;

import mz.gov.inage.xroad.entities.BirthCertificate;
import mz.gov.inage.xroad.entities.PlaceOfBirth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBirthCertificateRepository extends JpaRepository<BirthCertificate, Long> {
}
