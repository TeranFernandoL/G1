/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp.repositories;
import srp.models.Order;
import java.util.List;
/**
 *
 * @author shinobu
 */
public interface OrderRepository {
    void create(Order order);

    Order find(String id);

    List<Order> findAll();

    Order update(Order post, String id);

    void delete(String id);
}
