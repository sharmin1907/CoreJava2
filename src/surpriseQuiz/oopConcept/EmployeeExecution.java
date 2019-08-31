package surpriseQuiz.oopConcept;

public class EmployeeExecution {
    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setName("Orion");
        employeeInfo.setAge(28);
        employeeInfo.setDOB("January");


        String newName = employeeInfo.getName();
        System.out.println(newName);
        int newAge = employeeInfo.getAge();
        System.out.println(newAge);
        String newDOB = employeeInfo.getDOB();
        System.out.println(newDOB);
    }
}
