package Exercicio5;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    Date moment;
    OrderStatus status;
    Client client;
    ArrayList<OrderItem> items = new ArrayList<>();
   
    public Order(Date moment, OrderStatus status, Client client, ArrayList<OrderItem> items) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public ArrayList<OrderItem> getItems() {
		return items;
	}
    
    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }
    
    public double total(){
        double sumItems = 0;

        for(OrderItem item : items) {
            sumItems = sumItems + item.subTotal();
        }
        
        return sumItems;
    }

    public String toString() {
        return String.format("%s, %s, Quantity: %s, Subtotal: $%s\n", product.getName(), product.getPrice(), getQuantity(),subTotal());
    }


}
