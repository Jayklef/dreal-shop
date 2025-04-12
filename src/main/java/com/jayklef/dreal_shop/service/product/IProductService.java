package com.jayklef.dreal_shop.service.product;

import com.jayklef.dreal_shop.entity.Product;
import com.jayklef.dreal_shop.request.AddProductRequest;
import com.jayklef.dreal_shop.request.UpdateProductRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);

    Product updateProduct(UpdateProductRequest request, Long id);

    void deleteProduct(Long id);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductByBrand(String brand);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String name, String category);
    Long countProductsByBrandAndName(String brand, String name);

}
