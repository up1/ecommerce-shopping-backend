package com.tcrb.shoppingcart.product;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "toy_name")
    private String toyName;
    @Column(name = "gender_id")
    private String gender;
    @Column(name = "age_id")
    private int ageId;
    @Column(name = "price")
    private Double price;
    @Column(name = "availability")
    private int availability;
    @Column(name = "brand")
    private String brand;
}
