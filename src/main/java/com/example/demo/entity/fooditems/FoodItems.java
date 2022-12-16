package com.example.demo.entity.fooditems;

import com.example.demo.enums.VegOrNonVegEnum;

import javax.persistence.*;

@Entity
@Table(name = "food_items")
public class FoodItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Float price;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private VegOrNonVegEnum VegOrNonVeg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public VegOrNonVegEnum getVegOrNonVeg() {
        return VegOrNonVeg;
    }

    public void setVegOrNonVeg(VegOrNonVegEnum vegOrNonVeg) {
        VegOrNonVeg = vegOrNonVeg;
    }
}
