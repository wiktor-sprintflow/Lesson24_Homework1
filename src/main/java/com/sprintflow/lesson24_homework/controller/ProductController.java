package com.sprintflow.lesson24_homework.controller;

import com.sprintflow.lesson24_homework.model.Product;
import com.sprintflow.lesson24_homework.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String addProduct(Model model){
        //model.addAttribute("product", new Product());
        return "home";
    }

//    @PostMapping("/")
//    public String addProductToList(Product product){
//        productRepository.add(product);
//        return "redirect:/lista";
//    }
}
