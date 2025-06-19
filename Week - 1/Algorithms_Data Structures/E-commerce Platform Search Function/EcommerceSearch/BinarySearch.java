package EcommerceSearch;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static int search(Product[] products, String target) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(target);

            if (compare == 0)
                return mid;
            else if (compare < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
