// import javax.swing.JOptionPane;
// import java.util.Scanner; 

// public class add_two_integers{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in); 

//         double a = input.nextDouble(); 
//         double b = input.nextDouble(); 
//         System.out.println(a+b); 
//         input.close(); 
//     }
// }

//code mẫu
// Description
// Compute the sum of two integers a and b.
// Input
// Line 1 contains two integers a and b (0 <= a, b <= 10
// 19
// )
// Ouput
// Write the sum of a and b
// Example
// Input
// 3 5
// Output
// 8
// import java.util.*; 
// import java.util.Scanner;
// import java.math.BigInteger;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Đọc hai số nguyên lớn a và b
//         BigInteger a = scanner.nextBigInteger();
//         BigInteger b = scanner.nextBigInteger();
        
//         // Tính tổng của a và b
//         BigInteger sum = a.add(b);
        
//         // In ra kết quả
//         System.out.println(sum);
//     }
// }

//code mẫu - bài Permutation generation 
// Description
// Given an integer n, write a program to generate all permutations of 1, 2, ..., n in a lexicalgraphic order (elements of a permutation are separated by a SPACE character).
// Example
// Input 
// 3
// Output
// 1 2 3 
// 1 3 2 
// 2 1 3 
// 2 3 1 
// 3 1 2 
// 3 2 1 

// import java.util.*; 
// import java.util.Arrays;
// import java.util.Scanner;
// public class Main {

//     public static void generatePermutations(int n) {
//         int[] nums = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             nums[i] = i + 1;
//         }
        
//         System.out.println(arrayToString(nums));
        
//         while (nextPermutation(nums)) {
//             System.out.println(arrayToString(nums));
//         }
//     }

//     private static boolean nextPermutation(int[] nums) {
//         int i = nums.length - 2;
        
//         while (i >= 0 && nums[i] >= nums[i + 1]) {
//             i--;
//         }
        
//         if (i < 0) {
//             return false;
//         }
        
//         int j = nums.length - 1;
//         while (nums[j] <= nums[i]) {
//             j--;
//         }
        
//         swap(nums, i, j);
        
//         reverse(nums, i + 1, nums.length - 1);
        
//         return true;
//     }

//     private static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     private static void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             swap(nums, start, end);
//             start++;
//             end--;
//         }
//     }

    
//     private static String arrayToString(int[] nums) {
//         StringBuilder sb = new StringBuilder();
//         for (int num : nums) {
//             sb.append(num).append(" ");
//         }
//         return sb.toString().trim();
//     }

//     public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
// 		int n = s.nextInt();
//         generatePermutations(n);
//     }
// }
