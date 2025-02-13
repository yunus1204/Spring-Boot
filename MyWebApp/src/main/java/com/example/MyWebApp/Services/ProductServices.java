package com.example.MyWebApp.Services;

import com.example.MyWebApp.Models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {


    List<Product> prod= new ArrayList<>(Arrays.asList(
            new Product(101,"apple"),
            new Product(102,"Orange"),
            new Product(103,"Pinapple")
    ));
    public List<Product> getProductService()
    {
        return prod;
    }

    public Product getProductById(int id) {
        for(Product i:prod)
        {
            if(i.getId() ==id){
                return i;
            }
        }
        return null;
    }

    public void addProduct(Product t) {
            prod.add(t);

    }

    public void UpdateTheProduct(Product t) {
        for (int i = 0; i < prod.size(); i++) {
            if (prod.get(i).getId() == t.getId()) {
                prod.set(i, t); // Update the product with the new details
                return;
            }
        }
    }

    public void deleteProductbyId(int id) {
        for(Product i:prod)
        {
            if(i.getId()==id)
            {
                prod.remove(i);
            }
        }
    }
}
