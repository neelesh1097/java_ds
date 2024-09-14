import java.util.Scanner;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: size of the array
        int n = scn.nextInt();
        int[] arr = new int[n];

        // Input: array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Call the span function and get the result
        int[] result = span(arr);

        // Print the result array
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    public static int[] span(int[] arr) {
        int[] span = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;  // The first element always has a span of 1

        for (int i = 1; i < arr.length; i++) {
            // Pop elements from the stack while the current element is greater than the element at the top of the stack
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            // If the stack becomes empty, it means the current element is the largest seen so far
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                // The span is the difference between the current index and the index of the top element in the stack
                span[i] = i - st.peek();
            }

            // Push the current index onto the stack
            st.push(i);
        }

        return span;
    }
}
