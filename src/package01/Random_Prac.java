package package01;

import java.util.Random;

public class Random_Prac {
  public static void main(String[] args) {
    Random randomInstance = new Random();
    int x = randomInstance.nextInt(7);
    System.out.println(x + 1);
  }
}
