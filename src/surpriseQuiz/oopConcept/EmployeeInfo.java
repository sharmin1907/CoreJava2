package surpriseQuiz.oopConcept;

public class EmployeeInfo {
    //Encapsulation
    private String name;
    private int age;
    private String DOB;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setDOB(String DOB){
        this.DOB=DOB;
    }
    public String getDOB(){
        return DOB;
    }

}
