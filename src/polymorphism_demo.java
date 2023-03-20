
 class Student{
    int age;
    String name;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(int age,String name){
        System.out.println(name+" age is "+age);
    }
}

public class polymorphism_demo {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Shivam";
    s1.age = 26;
    s1.printInfo(s1.name);
    s1.printInfo(s1.age);
    s1.printInfo(s1.age,s1.name);
    }
}
