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


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
