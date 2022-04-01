package com.tcs.piloto.service.impl;

import com.tcs.piloto.model.Products;
import com.tcs.piloto.repository.ProductsRepository;
import com.tcs.piloto.service.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;

    public ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getProducts() {
        return productsRepository.findAll();
    }
}
