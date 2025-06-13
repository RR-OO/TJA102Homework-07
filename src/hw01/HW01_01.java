package hw1;

//請設計一隻Java程式，計算12，6這兩個數值的和與積
public class HW01_01 {
 public static void main(String[] args) {
     int num1 = 12;
     int num2 = 6;

     // 和
     int sum = num1 + num2;
     // 積
     int product = num1 * num2;

     System.out.println("數字12、6的 和: " + sum);
     System.out.println("數字12、6的 積: " + product);
 }
}