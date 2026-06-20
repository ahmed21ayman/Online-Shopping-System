public class App {

    static class Product{
        protected String productName;
        protected double price;
        protected int quantity;
        Product(String productName, double price, int quantity){
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    static class Customer{
        private String name;
        private String email;
        Customer(String name, String email){
            this.name = name;
            this.email = email;
        }
    }

    static class Order extends Product{
        private int orderId;
        private String customer;
        private String product;
        Order(String productName, double price, int quantity, int orderId, String customer, String product){
            super(productName, price, quantity);
            this.orderId = orderId;
            this.customer = customer;
            this.product = product;
        }
        void orderDetails(){
            System.out.println("hello: " + customer + " you order: " + orderId + "\nproduct: " + productName + " * " + quantity + "\ntotal price: " + price*quantity);
        }
    }


    public static void main(String[] args) throws Exception {
        Product p1 = new Product("mac mini", 50000, 3);
        Customer c1 = new Customer("Ahmedd Ayman", "ahmed@gmail");
        Order o1 = new Order("mac mini", 50000, 2, 1, "Ahmedd Ayman", "ahmed@gmail");
        o1.orderDetails();
    }
}
