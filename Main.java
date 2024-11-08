import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    // You can test your method here
     System.out.println(isPrime(1));
     System.out.println(isPrime(4));
     System.out.println(isPrime(3));
     System.out.println(isPrime(4));
     System.out.println(isPrime(5));
     System.out.println(isPrime(17));
     System.out.println(isPrime(8675309));
  }

  public static boolean isPrime(int N) {
    int divCount = 0;
    if(N == 1) {
      return false;
    } else {
      for(int i = N; i >= 0; i--) {
          if(i != 0 && N % i == 0) {
             divCount++;
          }
      }
    }
    if(divCount == 2) {
       return true;
    }
    // TODO: Replace and write your code below
    return false;
  }
}
