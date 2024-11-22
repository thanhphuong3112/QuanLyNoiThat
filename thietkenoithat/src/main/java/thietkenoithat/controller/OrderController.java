package thietkenoithat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import thietkenoithat.model.OrdersRepositoryy;



@Controller
public class OrderController {
    @Autowired OrdersRepositoryy ordersRepository;
    @GetMapping("/orders")
    public String index(Model model) {
        model.addAttribute("list", ordersRepository.findAll());
        return ("orders/index");
    }
    
}
