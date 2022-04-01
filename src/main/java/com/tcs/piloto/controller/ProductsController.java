package com.tcs.piloto.controller;

import com.tcs.piloto.model.Products;
import com.tcs.piloto.repository.ProductsRepository;
import com.tcs.piloto.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductsController {
  private final ProductsService productsService;
    @GetMapping
    public ResponseEntity<List<Products>> getAllCustomer()
    {
        return new ResponseEntity<>(productsService.getProducts(), HttpStatus.OK);
    }
}
