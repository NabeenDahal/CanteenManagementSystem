package com.example.demo.Controller;

import com.example.demo.entity.fooditems.FoodItems;
import com.example.demo.enums.VegOrNonVegEnum;
import com.example.demo.service.fooditem.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private FoodItemService foodItemService;
    @GetMapping("/hello")
    public String helloWorld(@RequestParam("msg") String msg){
        System.out.println("Hello world");
        System.out.println(msg);

        FoodItems foodItems =new FoodItems();
        foodItems.setName("Butter Naan");
        foodItems.setPrice(70f);
        foodItems.setQuantity(10);
        foodItems.setVegOrNonVeg(VegOrNonVegEnum.VEG);
        foodItemService.save(foodItems);
        return "Hello World";
    }



}
