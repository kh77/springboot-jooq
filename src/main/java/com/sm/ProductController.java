package com.sm;

//import com.sm.jooq.tables.pojos.Product;
import com.sm.jooq.tables.daos.ProductsDao;
import com.sm.jooq.tables.pojos.Products;
import com.sm.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductsDao productRepository;

    @GetMapping
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Products findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Products product) {
        productRepository.insert(product);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Products product) {
        product.setId(id);
        productRepository.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.delete(findById(id));
    }
}

