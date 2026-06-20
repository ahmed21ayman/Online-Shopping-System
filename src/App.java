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

    static class Customer extends Product{
        private String name;
        private String email;
        Customer(String productName, double price, int quantity, String name, String email){
            super(productName, price, quantity);
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
        void totalPrice(){
            System.out.println("hello: " + customer + " you order: " + orderId + "\nproduct: " + product + " * " + quantity + "\ntotal price" + price*quantity);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
