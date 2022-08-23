package com.webex.tdbg.PricingFormattor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.webex.tdbg.PricingFormattor.service.PricingService;


@RestController
public class PricingController {

    @Autowired
    private PricingService pricingService;


    @GetMapping("/pricing/{dollar}")
    public String priceConvertor(@PathVariable double dollar){
        String finalPrice = PricingService.dollarPriceConvertor(dollar);
        return finalPrice;
    }
}
