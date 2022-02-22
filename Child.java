public class Child extends Parent{   //inheritance
    @Override
    public void Career(String name){       //these the methods present in parent class
        System.out.println("my chosen career is "+name);
    }
    @Override //Over riding the methods
    public void Age(int age){
        System.out.println("my age is "+age);
    }
}
