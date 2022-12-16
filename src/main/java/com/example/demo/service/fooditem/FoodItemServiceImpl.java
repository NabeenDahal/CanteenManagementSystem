package com.example.demo.service.fooditem;

import com.example.demo.entity.fooditems.FoodItems;
import com.example.demo.repo.fooditem.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemServiceImpl implements FoodItemService {


    @Autowired
    private FoodItemRepo foodItemRepo;

    @Override
    public FoodItems save(FoodItems foodItems)
    {
       foodItems = foodItemRepo.save(foodItems);
       return foodItems;
   }

}
