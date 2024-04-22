import javax.swing.JOptionPane;
public class EcommerceSystem {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to the E-Commerce System!");
        int customerId = Integer.parseInt(JOptionPane.showInputDialog("Please enter your ID:"));
        String name = JOptionPane.showInputDialog("Please enter your name:");
        String address = JOptionPane.showInputDialog("Please enter your address:");
        Customer customer1 = new Customer(customerId, name, address);
        int NumOfProducts = Integer.parseInt(JOptionPane.showInputDialog("How many products would you like to add to your cart?"));
        Cart cart1 = new Cart(customerId, NumOfProducts);
        for (int i = 0; i < NumOfProducts; i++) {
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP"));
            Product product;
            if (choice == 1) {
                product = new ElectronicProduct("Smartphone",1, 599.99, "Samsung", 1);
            } else if (choice == 2) {
                product = new ClothingProduct("T-shirt",2,19.99,"Medium","Cotton");

            } else if (choice == 3) {
                product = new BookProduct("OOP",3,39.99,"O’Reilly","X Publications");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice, Please try again.");
                i--;
                continue;
            }
            cart1.addProduct(product);
        }
        double totalPrice = cart1.calculatePrice();
        int orderChoice = Integer.parseInt(JOptionPane.showInputDialog(null,"Your total is $" + totalPrice + ", Would you like to place the order? 1- Yes 2- No"));
        if (orderChoice == 1) {
            cart1.placeOrder();
        }
        else {
            JOptionPane.showMessageDialog(null, "Your order placement request has been cancelled.");
        }
        JOptionPane.showMessageDialog(null, "Thank you, " + customer1.getName() + ", for registering with us!");

}
}
