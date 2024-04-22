import javax.swing.*;
class Order {
     int customerId;
     int orderId;
     Product[] products;
     double totalPrice;
    public Order(int customerId, int orderId, Product[] products, double totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice); }
     public void printOrderInfo() {
                String message = "Here's your order summary:\n"+
                        "Order ID: " + orderId + "\n" +
                        "Customer ID: " + customerId + "\n" +
                        "Products:\n";
                for (int i = 0; i < products.length; i++) {
                    message += products[i].getName() + " - $" + products[i].getPrice() + "\n"; }
            message += "\nTotal Price: $" + totalPrice;
                JOptionPane.showMessageDialog(null, message);
            }
        }


