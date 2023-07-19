package com.example.medicinemanagerdemo.controller;


import com.example.medicinemanagerdemo.model.Product;
import com.example.medicinemanagerdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping ("/deleteProduct/{ProductID}")
    public String deleteProduct(@PathVariable("ProductID") long ProductID) {
        productRepository.deleteById(ProductID);
        //model.addAttribute("listProduct", productRepository.findAll());
        return "redirect:/product-list";
    }

    @PostMapping("/product/search")
    public String searchProduct(@RequestParam("name") String name, Model model) {
        List<Product> searchResult = (List<Product>) productRepository.searchProductsByName(name);
        model.addAttribute("listProduct", searchResult);
        return "product-list";
    }
}
