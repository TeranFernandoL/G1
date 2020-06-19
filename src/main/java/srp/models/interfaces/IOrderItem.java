package srp.models.interfaces;

import srp.models.*;

public interface IOrderItem {
    Order order = null;
    Product product = null;
    Integer quantity = null;
    Double price = null;
    Customer customer = null;

    public Double calculatePrice();

    public Order getOrder();

    public void setOrder(Order order);

    public Product getProduct();

    public Integer getQuantity();

    public Double getPrice();
    
    public Customer getCustomer();
    
    public void setCostumer(Customer customer);
    
    public String getCustomerAddress();
    
    public Double tax();
}