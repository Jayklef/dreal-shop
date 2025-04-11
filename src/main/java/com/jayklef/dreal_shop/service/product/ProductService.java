package com.jayklef.dreal_shop.service.product;

import com.jayklef.dreal_shop.entity.Product;
import com.jayklef.dreal_shop.repository.ProductRepository;
import com.jayklef.dreal_shop.service.product.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{

    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {

        Product product = productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException("Product not found"));
        return product;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.findById(id).ifPresent(productRepository::delete);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return null;
    }

    @Override
    public List<Product> getProductByBrand(String brand) {
        return null;
    }

    @Override
    public List<Product> getProductByCategoryAndBrand(String category, String brand) {
        return null;
    }

    @Override
    public List<Product> getProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductByBrandAndName(String name, String category) {
        return null;
    }

    @Override
    public List<Product> countProductsByBrandAndName(String brand, String name) {
        return null;
    }
}
