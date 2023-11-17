package staticFlow;


public class Meesho1{
    String productName;
    int productCost;
    static String productCompany = "Meesho";

    Meesho1(String productName, int productCost) {
        this.productName = productName;
        this.productCost = productCost;
        System.out.println("Constructor executing");
    }

    static {
        System.out.println("Welcome to Meesho");
    }

    public void displayProduct() {
        System.out.println(productName + " " + productCost + " " + productCompany);
    }

    public static void main(String[] args) {
        System.out.println("Main method executing");
        Meesho product = new Meesho("Kurta", 1500);
        product.displayProduct();
    }
}