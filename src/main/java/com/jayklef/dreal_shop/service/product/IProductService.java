package com.jayklef.dreal_shop.service.product;

import com.jayklef.dreal_shop.entity.Product;

import java.util.List;

public interface IProductService {
    Product createProduct(Product product);

    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductByBrand(String brand);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String name, String category);
    List<Product> countProductsByBrandAndName(String brand, String name);

}
