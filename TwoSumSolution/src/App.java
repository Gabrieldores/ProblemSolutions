import java.util.Scanner;
public class App {
    // main code to write the vector and target that the user wants to send to the solution class
        public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int nums [] = new int [5];
        Scanner sc = new Scanner(System.in);
        int target;

        for(int i = 0; i < nums.length; i ++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println("Write the target :");
        target = sc.nextInt();

        solution.twoSum(nums, target);
        
    }
}
