import java.util.Scanner;

class Student2
{
    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    Student2()
    {
        name = "";
        age = 0;
    }

    public void getData()
    {
        System.out.println("Enter Name and Age");
        name = sc.next();
        age = sc.nextInt();
    }

    public void printData()
    {
        System.out.println("Name of student is "+name + " and age is "+age);
    }
}

public class STTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.getData();
        s1.printData();
        s2.getData();
        s2.printData();

    }
}
