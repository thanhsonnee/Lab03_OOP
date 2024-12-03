// import java.util.*; 
// import java.util.Scanner;

// // @SuppressWarnings({"unchecked", "deprecation"})
// public class Main { 
//     public static void main(String[] args) { 
//         int a, b;
//         Scanner num = new Scanner(System.in); 

//         a = num.nextInt(); 
//         b = num.nextInt(); 
//         System.out.println(((a+b)*2) + " " + (a*b));
//         // System.out.println( ((a+b)*2));
//     }
// }





import java.util.*; 
import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        int[] a = new int[10001]; 
        int n;
        int sum = 0;  
        Scanner num = new Scanner(System.in); 
        n = num.nextInt(); 
        for (int i=1;i<=n;i++){
            a[i] = num.nextInt(); //doc vao tu ban phim 
            sum += a[i]; 
        }
        System.out.println(sum); 
    }
}