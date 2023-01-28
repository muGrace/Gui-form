import jdk.jfr.Frequency;

import java.util.Scanner;
import java.util.Scanner.*;


import javax.swing.*;
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame= new JFrame("'Test frame");
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int number= input.nextInt();
        System.out.println("Number entered: "+number );
        input.close();
    }

}
