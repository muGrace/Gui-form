package grace;

import java.util.Scanner;

public class Student {
    public void add(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1=s.nextInt();
        System.out.println("Enter number2:");
        int num2=s.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is:"+sum);
    }
    public static void main(String[] args) {

    }
}
