package staticFlow;

public class Meesho {
    String productName;
    int productCost;
    static String productCompany = "Meesho";
   
    static {
        System.out.println("Welcome to Meesho");
    }

    Meesho(String productName, int productCost) {
        this.productName = productName;
        this.productCost = productCost;
        System.out.println("Constructor executing");
    }

  

    public void displayProduct() {
        System.out.println(productName + " " + productCost + " " + productCompany);
    }
    public static void display() {
    	System.out.println("static method is executing");
    }

    public static void main(String[] args) {
        System.out.println("Main method executing");
        Meesho product = new Meesho("Kurta", 1500);
        product.displayProduct();
        product.display();
    }
}