package com.example.medicinemanagerdemo.controller;

import com.example.medicinemanagerdemo.model.Product;
import com.example.medicinemanagerdemo.repository.MedicinesRepository;
import com.example.medicinemanagerdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MedicinesController {
    @Autowired
    private MedicinesRepository medicinesRepository;

    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/medicines-list")
    public String listMedicines(Model model) {
        try{
            model.addAttribute("listMedicines", medicinesRepository.findByCategory(2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "medicines-list";
    }

    @GetMapping ("/deleteMedicines/{ProductID}")
    public String deleteMedicines(@PathVariable("ProductID") long ProductID) {
        medicinesRepository.deleteById(ProductID);
        //model.addAttribute("listProduct", productRepository.findAll());
        return "redirect:/medicines-list";
    }

    @PostMapping("/medicines/search")
    public String searchProduct(@RequestParam("name") String name, Model model) {
        List<Product> searchResult = (List<Product>) medicinesRepository.searchProductsByName(name);
        model.addAttribute("listMedicines", searchResult);
        return "medicines-list";
    }
}
