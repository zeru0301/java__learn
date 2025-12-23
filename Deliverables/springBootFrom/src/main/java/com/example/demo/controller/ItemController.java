package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.ItemService;

@Controller
public class ItemController {

    private final ItemService itemService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("items", itemService.getItems());
        return "index";
    }
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/add")
    public String add(@RequestParam String itemName) {
        itemService.addItem(itemName);
        return "redirect:/";
    }
}