package mz.gov.inage.xroad.controllers;

import mz.gov.inage.xroad.dto.CitizenCertificateRequest;
import mz.gov.inage.xroad.entities.BirthCertificate;
import mz.gov.inage.xroad.services.ICitizenCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CitizenCertificateController {
    @Autowired
    ICitizenCertificateService citizenCertificateService;
    @RequestMapping(value = "/registerCitizen", method = RequestMethod.POST)
    public String saveCitizenCertificate(CitizenCertificateRequest request, ModelMap modelMap){
        BirthCertificate birthCertificate = citizenCertificateService.saveBirthCertificate(request);
        modelMap.addAttribute("msg", "Certidão de nascimento criada com sucesso. " +
                "ID = " + birthCertificate.getId() + ". NUIC = " + birthCertificate.getNuic());
        return "/citizen/certificateConfirmation";
    }
}
