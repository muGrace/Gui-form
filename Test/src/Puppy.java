public class Puppy {
    int puppyAge;

    public Puppy(String name){
        System.out.print("passed name is:" + name);

    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.print("Puppy age is:\n "+ puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(20);
        myPuppy.getAge();
        System.out.print("variable value:\n" +myPuppy.puppyAge);

    }
}
