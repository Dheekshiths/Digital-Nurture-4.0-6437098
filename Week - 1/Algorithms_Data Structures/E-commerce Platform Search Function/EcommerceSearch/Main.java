package EcommerceSearch;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Chair", "Furniture"),
            new Product(104, "Table", "Furniture"),
            new Product(105, "Watch", "Accessories")
        };

        System.out.println("Product List:");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.print("\nEnter product name to search: ");
        String target = sc.nextLine();

        // Linear Search
        int linearResult = LinearSearch.search(products, target);
        if (linearResult != -1)
            System.out.println("\nLinear Search: Product found at index " + linearResult + ": " + products[linearResult]);
        else
            System.out.println("\nLinear Search: Product not found!");

        // Sort products before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        int binaryResult = BinarySearch.search(products, target);
        if (binaryResult != -1)
            System.out.println("Binary Search: Product found at index " + binaryResult + ": " + products[binaryResult]);
        else
            System.out.println("Binary Search: Product not found!");
    }
}
