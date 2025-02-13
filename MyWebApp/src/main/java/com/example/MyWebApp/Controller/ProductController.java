package com.example.MyWebApp.Controller;

import com.example.MyWebApp.Models.Product;
import com.example.MyWebApp.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServices p;
    @RequestMapping("/product")
    public List<Product> getProducts()
    {
        return p.getProductService();
    }

    @RequestMapping("/product/{id}")
    public Product getById(@PathVariable int id)
    {
        Product temp=p.getProductById(id);
        return temp;
    }

    @PostMapping("/product")
    public void postproduct(@RequestBody Product t)
    {
        p.addProduct(t);
    }

    @PutMapping("/product")
    public void putproduct(@RequestBody Product t)
    {
        p.UpdateTheProduct(t);
    }

    @DeleteMapping("/product/{id}")
    public void deleteproduct(@PathVariable int id)
    {
        p.deleteProductbyId(id);
    }
}
