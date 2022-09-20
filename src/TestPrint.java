public class TestPrint {
     static public void main(String[] args) {
         int result = 0;
         try {
             result = 10/0;
             System.out.println("Result := "+result);
         } catch (ArithmeticException a) {
             System.out.println("Division by zero error: "+a.getMessage());
         }

         finally {
             System.out.println("It runs after catch");
         }

        System.out.println(100+100+"code here...");
        System.out.println("Test this: "+100+100);
        add(5,6);
        add(6,5,7);
         System.out.println(add(5,7,7,5));
    }

    static void add (int a, int b) {
        System.out.println(a+b);
    }

    static void add (int a, int b, int c) {
        System.out.println(a*b*c);
    }
    static double add (int a, int b, int c, int d){
         return (a+b)/(c-d);
    }
}

class Tester {

    public double add(int a, int b){
        return a / b;
    }

    public String add (String a, int b) {
        return "";
    }
}
