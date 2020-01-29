package com.tcrb.shoppingcart.product;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
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
    private String availability;
    @Column(name = "brand")
    private String brand;
}
