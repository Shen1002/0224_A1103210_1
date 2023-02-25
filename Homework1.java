import java.util.*;

public class Homework1 {
    public static void main(String[]argv){
        System.out.println("請輸入任意整數:");
        Scanner myInput1 = new Scanner(System.in);
        int n = myInput1.nextInt();
        Boolean i = (Math.abs(n) % 2 == 1);
        System.out.println(i ? "奇數" : "偶數");
    }
}
