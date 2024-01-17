package mz.gov.inage.xroad.controllers;

import mz.gov.inage.xroad.entities.BirthCertificate;
import mz.gov.inage.xroad.repos.IBirthCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CitizenCertificateRestController {
    @Autowired
    IBirthCertificateRepository certificateRepository;
    @RequestMapping("/citizens/{nuic}")
    public BirthCertificate findCitizenCertificate(@PathVariable("nuic") String nuic){
        BirthCertificate certificate = certificateRepository.findCertificateByNuic(nuic);
        return certificate;
    }
}
