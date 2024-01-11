package mz.gov.inage.xroad.controllers;

import mz.gov.inage.xroad.entities.User;
import mz.gov.inage.xroad.repos.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private IUserRepository userRepository;
    @RequestMapping("/showReg")
    public String showRegistrationPage(){
        return "/login/registerUser";
    }
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user){
        userRepository.save(user);
        return "/login/login";
    }
}
