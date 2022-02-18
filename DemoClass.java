//starting with classes

class Employee{
    int id;
    float salary;
    String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
          name=n;
    }
    public float getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
}

public class DemoClass {

    public static void main(String[] args) {
        Employee one= new Employee();
//        Employee two= new Employee();


        one.id=1;
        one.salary=12000.0f;
        one.setName("a");

        System.out.println(one.getName());
        System.out.println(one.getSalary());
        System.out.println(one.getId());

    }
}
