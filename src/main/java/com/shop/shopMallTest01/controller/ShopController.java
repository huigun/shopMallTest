package com.shop.shopMallTest01.controller;

import com.shop.shopMallTest01.entity.Item;
import com.shop.shopMallTest01.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping(value = "item")
    public String item(Model model) {

        List<Item> items = itemRepository.findByItemName("1번상품");
        Item item = items.get(0);

        model.addAttribute("item",item);
        return "itemList";
    }
}
