package thietkenoithat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thietkenoithat.model.ProductsRepository;



@Controller
public class ProductsController {
    @Autowired ProductsRepository productsRepository;
    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("list", productsRepository.findAll());
        return ("products/index");
    }
    
    
}

