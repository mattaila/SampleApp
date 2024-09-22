package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Item;
import com.example.demo.service.ItemService;

@Controller
public class SampleController {

    @Autowired
    private ItemService service;
    
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/item")
    public String listItem(Model model) {
        List<Item> pageList = service.getItemAll();

        model.addAttribute("pages", pageList);

        Item item = new Item();
        item.setId(1L);
        item.setItemName("test");
        item.setPrice(1000);
        item.setItemDescription("desc");
        model.addAttribute("item", item);
        return "item";
    }

    @PostMapping("/create")
    public String post(Model model, @ModelAttribute @Validated Item item, BindingResult bidingResult) {
        model.addAttribute("item", item);
        if(bidingResult.hasErrors()) {
            return "item";
        }
        return "redirect:item";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
