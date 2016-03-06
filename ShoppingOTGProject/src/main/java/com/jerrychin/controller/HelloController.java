package com.jerrychin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jerrychin.domain.Item;

@Controller
@RequestMapping("/")
public class HelloController {
    
    @RequestMapping( method = RequestMethod.GET)
    public String welcome(ModelMap model) {
    	// stuff model with dummy data for test purpose
    	List<Item> list = new ArrayList<Item>();
    	Item item = new Item();
    	item.setItemId(10001);
    	item.setItemName("苹果");
    	item.setCost(45.2f);
    	item.setPrice(50.0f);
    	item.setQuantity(50);
    	item.setUnit("箱");
    	item.setOrigin("山东");
    	item.setTitle("山东莱阳 蜜妮红富士苹果 1箱10kg以上");
    	item.setDescription("世上最好的苹果，请速速抢购，售完为止！");
    	for(int i = 0; i < 12; i++)
    		list.add(item);
    	
    	model.addAttribute("items", list);
    	// redirect user to web page.
        return "index";
    }
    
 }