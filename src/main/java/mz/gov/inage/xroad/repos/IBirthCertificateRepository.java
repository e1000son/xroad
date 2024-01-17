package mz.gov.inage.xroad.repos;

import mz.gov.inage.xroad.entities.BirthCertificate;
import mz.gov.inage.xroad.entities.PlaceOfBirth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBirthCertificateRepository extends JpaRepository<BirthCertificate, Long> {

    @Query("SELECT n from BirthCertificate n WHERE n.nuic = :reference")
    BirthCertificate findCertificateByNuic(@Param("reference") String reference);
}
