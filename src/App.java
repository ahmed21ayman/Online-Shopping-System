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

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
