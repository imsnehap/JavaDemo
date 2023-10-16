import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // max() method to get max Product price
        Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productB.price);

        double d = productsList.stream().mapToDouble(Product::getPrice).sum();
        System.out.println(d);


        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // using parallelStream()
        // method for parallel stream
        list.parallelStream().forEach(System.out::print);
        System.out.println("\n");

        list.stream().forEach(System.out::print);


    }
}
