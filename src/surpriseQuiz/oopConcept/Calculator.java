package surpriseQuiz.oopConcept;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        int c = add(13,32);
        int d = multiply(11,8);
        System.out.println(c);
        System.out.println(d);
    }
}
