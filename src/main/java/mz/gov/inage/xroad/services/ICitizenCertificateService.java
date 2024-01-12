package mz.gov.inage.xroad.services;

import mz.gov.inage.xroad.dto.CitizenCertificateRequest;
import mz.gov.inage.xroad.entities.BirthCertificate;

public interface ICitizenCertificateService {
    public BirthCertificate saveBirthCertificate(CitizenCertificateRequest citizenCertificateRequest);
}
