package com.example.demo.repo.fooditem;

import com.example.demo.entity.fooditems.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItems,Integer> {


}
