import java.util.Scanner;
public class Main_6_3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("height of stars?");
    int x = keyboard.nextInt();

    for(int i = 0; i < x; i++){
      for(int m = x - i; m > 0; m--){
        System.out.print(" ");
      }
      for(int j = 2*i+1; j > 0; j--){
        System.out.print("*");
      }
      System.out.println();
  }
  }
}