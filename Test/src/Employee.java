
import  java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;


public Employee (String name){
    this.name=name;
}
public  void empAge(int empAge){
    empAge=age;
}
public void empSalary(double empSalary){
    empSalary=salary;
}
public void empDesig(String empDesig){
    empDesig=designation;
}
public void printEmployee(){
    System.out.println("name:\t" +name);
    System.out.println("age:\t" +age);
    System.out.println("Designation:\t" +designation);
    System.out.println("salary:\t" +salary);


}}

