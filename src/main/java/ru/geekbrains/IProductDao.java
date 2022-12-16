package ru.geekbrains;

import java.util.List;

public interface IProductDao {
    Product findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);

    void saveOrUpdate(Product product);
}
