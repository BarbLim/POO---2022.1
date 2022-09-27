package Exercicio5;

public class OrderItem {
    Integer quantity;
    double price;
    Product product;
    
    public OrderItem(Integer quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public  double subTotal() {
        double subTotal = quantity * price;

        return subTotal;
    }

    public Integer getQuantity() {
        return quantity;
    }


}
