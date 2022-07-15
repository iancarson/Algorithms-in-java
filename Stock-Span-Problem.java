// Java program for brute force method
// to calculate stock span values
 
import java.util.ArrayList;
import java.util.Stack;
class GFG {
 
    static ArrayList<Integer> calculateSpan(int arr[],
                                            int n)
    {
        // Your code here
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            while (!s.empty() && arr[s.peek()] <= arr[i])
                s.pop();
 
            if (s.empty())
                ans.add(i + 1);
            else {
                int top = s.peek();
                ans.add(i - top);
            }
            s.push(i);
        }
 
        return ans;
    }
 
    // A utility function to print elements of array
    static void printArray(ArrayList<Integer> arr)
    {
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }
 
    // Driver code
    public static void main(String args[])
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
 
        ArrayList<Integer> arr = calculateSpan(price, n);
        printArray(arr);
    }
}
