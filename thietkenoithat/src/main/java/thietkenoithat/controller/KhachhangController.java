package thietkenoithat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import thietkenoithat.model.KhachHang;
import thietkenoithat.model.KhachhangRepository;



@Controller
public class KhachhangController {
    @Autowired KhachhangRepository khachhangRepository;
    @GetMapping("/khachhang")
    public String index(Model model) {
        model.addAttribute("list", khachhangRepository.findAll());
        return ("khachhang/index");
    }
    @GetMapping("/khachhang/add")
	public String add(Model model) {
		model.addAttribute( "list", khachhangRepository.findAll());
		return "khachhang/add";
	}
	
	@PostMapping("/khachhang/add")
	public String add(KhachHang obj) {
		khachhangRepository.save(obj);
		return "redirect:/khachhang";
	}
    
    
}


