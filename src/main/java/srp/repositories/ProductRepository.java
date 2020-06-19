/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp.repositories;

import java.util.List;
import srp.models.Product;

/**
 *
 * @author shinobu
 */
public interface ProductRepository {
     void create(Product product);

    Product find(String id);

    List<Product> findAll();

    Product update(Product post, String id);

    void delete(String id);
}
