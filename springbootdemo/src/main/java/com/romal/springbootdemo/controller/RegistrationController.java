package com.romal.springbootdemo.controller;

import com.romal.springbootdemo.model.Employee;
import com.romal.springbootdemo.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @PostMapping("/addRegistration")
    public String addregistration(@ModelAttribute("emp") Employee emp, Model model, RedirectAttributes redirectAttributes){
        System.out.println("Inside Registration controller");
        Employee addedEmp;
        addedEmp = registrationService.addEmployee(emp);
        redirectAttributes.addFlashAttribute("emp",addedEmp);
        return "redirect:regSuccess";
    }

    @GetMapping("/registration")
    public String registration(@ModelAttribute("emp") Employee emp,Model model){
        return "registration";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/regSuccess")
    public String success(Model model)
    {
        Employee emp= (Employee) model.asMap().get("emp");
        model.addAttribute("emp",emp);
        return "regSuccess";
    }
}
