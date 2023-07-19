package com.example.medicinemanagerdemo.controller;


import com.example.medicinemanagerdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping ("/product-list")
    public String listProduct(Model model) {
        try{
        model.addAttribute("listProduct", productRepository.findAll());
        } catch (Exception e) {
            return "list";
//            throw new RuntimeException(e);
        }
        return "product-list";
    }
}
