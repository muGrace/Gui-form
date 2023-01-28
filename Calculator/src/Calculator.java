 class Calculation {
     int z;

     public void add(int x, int y) {
         z = x + y;
         System.out.println("The sum is:"+z);

     }

     public void minus(int x, int y) {
         z = x - y;
         System.out.println("The difference is:"+z);
     }
 }
    public class Calculator extends  Calculation{
        public  void multiply(int x,int y){
            z=x*y;
            System.out.println("The product is :"+z);
        }

        public static void main(String[] args) {
            int a=2;
            int b=2;
            Calculator cal=new Calculator();
            cal.add(a,b);
            cal.multiply(a,b);
            cal.multiply(a,b);
        }
    }

