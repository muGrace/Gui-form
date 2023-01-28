public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne= new Employee("Grace");
        Employee empTwo= new Employee("Sylva");
        empOne.empAge(20);
        empOne.empSalary(100000);
        empOne.empDesig("software Engineer");
        empOne.printEmployee();
        empTwo.empSalary(2000000);
        empTwo.empAge(25);
        empTwo.empDesig("Doctor");
        empTwo.printEmployee();
    }
}
