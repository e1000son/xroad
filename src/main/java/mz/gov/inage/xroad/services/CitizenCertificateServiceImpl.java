package mz.gov.inage.xroad.services;

import mz.gov.inage.xroad.dto.CitizenCertificateRequest;
import mz.gov.inage.xroad.entities.BirthCertificate;
import mz.gov.inage.xroad.repos.IBirthCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
@Service
public class CitizenCertificateServiceImpl implements ICitizenCertificateService{
    @Autowired
    private IBirthCertificateRepository birthCRepository;
    @Override
    public BirthCertificate saveBirthCertificate(CitizenCertificateRequest citizenRequest) {

        BirthCertificate birthCertificate = new BirthCertificate();
        birthCertificate.setFirstName(citizenRequest.getFirstName());
        birthCertificate.setLastName(citizenRequest.getLastName());
        birthCertificate.setSex(citizenRequest.getSex());
        birthCertificate.setDob(new Date());
        birthCertificate.setFather(citizenRequest.getFather());
        birthCertificate.setMother(citizenRequest.getMother());
        birthCertificate.setState(citizenRequest.getState());
        birthCertificate.setWeight(citizenRequest.getWeight());
        birthCertificate.setProvince(citizenRequest.getProvince());
        birthCertificate.setDistrict(citizenRequest.getDistrict());
        birthCertificate.setVillage(citizenRequest.getVillage());
        birthCertificate.setRegisteredDate(new Timestamp(new Date().getTime()));
        birthCertificate.setDescriptio(citizenRequest.getDescriptio());

        BirthCertificate savedCertificate = birthCRepository.save(birthCertificate);

        return savedCertificate;
    }
}
