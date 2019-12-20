package com.sprintflow.lesson24_homework.controller;

import com.sprintflow.lesson24_homework.model.Product;
import com.sprintflow.lesson24_homework.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String addProduct(Model model){
        model.addAttribute("product", new Product());
        return "home";
    }

    @PostMapping("/")
    public String addProductToList(Product product){
        productRepository.add(product);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String productsList(Model model) {

        model.addAttribute("products", productRepository.getAll());
        model.addAttribute("price", productRepository.sumPrices());

        return "productsList";
    }

    @GetMapping("/table")
    public String productsTable(Model model) {

        model.addAttribute("products", productRepository.getAll());
        model.addAttribute("price", productRepository.sumPrices());

        return "productsTable";
    }
}
