package com.sp.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sgw
 * @date 2021/5/13 9:54
 */

@RestController
@RefreshScope
public class ProductController {

    @Value("${product.name:1}")
    private String productName;

    @GetMapping("/getProduct")
    public String getProductName(){
        return productName;
    }
}
