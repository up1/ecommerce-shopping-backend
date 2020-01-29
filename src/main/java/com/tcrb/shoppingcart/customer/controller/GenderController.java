package com.tcrb.shoppingcart.customer.controller;

import com.tcrb.shoppingcart.customer.pojo.ResponseGender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenderController {
    @GetMapping("/api/v1/genders")
    public List<ResponseGender> getGenders() {
        List<ResponseGender> genders = null;
        return genders;
    }
}
