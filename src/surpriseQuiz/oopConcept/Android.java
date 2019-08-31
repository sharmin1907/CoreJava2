package surpriseQuiz.oopConcept;

public class Android extends Phone {
    Phone phone = new Phone();
    public int getPrice(){
        int p = price;
        return p;
    }
    public void testMethodAndroid(){
        testMethodPhone();
        System.out.println("from android class");
    }
    //overriding
    public void polymorphismTest(){
        System.out.println("android class");
    }


    public static void main(String[] args) {
        Android android = new Android();
        int storingVariable = android.getPrice();
        System.out.println(android.price);
        System.out.println(android.weight);
        android.testMethodPhone();
        android.testMethodAndroid();
        System.out.println(storingVariable);
        System.out.println(android.getPrice());
        System.out.println(android.getPrice()+100);
        android.polymorphismTest();
    }

}
