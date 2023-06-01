import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};

        // First version:
        String[] reversedOrders = new String[orders.length];
        int index = 0;
        for (int i = orders.length - 1; i >= 0; i--) {
            reversedOrders[index] = orders[i];
            index++;
        }
        System.out.println(Arrays.toString(reversedOrders));

        // Second version:
        String temporaryString = orders[0];
        orders[0] = orders[2];
        orders[2] = temporaryString;
        System.out.println(Arrays.toString(orders));
    }
}

// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders` programmatically
// - Print the swapped array into the console:
//   [third, second, first]
