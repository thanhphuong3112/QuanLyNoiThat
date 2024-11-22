package thietkenoithat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import thietkenoithat.model.KhachhangRepository;



@Controller
public class KhachhangController {
    @Autowired KhachhangRepository khachhangRepository;
    @GetMapping("/khachhang")
    public String index(Model model) {
        model.addAttribute("list", khachhangRepository.findAll());
        return ("khachhang/index");
    }
    
}
