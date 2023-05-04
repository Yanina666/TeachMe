import java.util.Scanner;

public class NameSurname
{
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

       System.out.print("Name: ");
       String name = enter.nextLine();
       System.out.println("Your name is: " + name);

       System.out.print("Surname: ");
       String surname = enter.nextLine();
       System.out.println("Your surname is: " + surname);

        System.out.print("Age: ");
        int age = enter.nextInt();
        System.out.println("Your age is: " + age);

        System.out.print("Height: ");
        int height = enter.nextInt();
        System.out.println("Your height is: " + height);

        System.out.print("Weight: ");
        int weight = enter.nextInt();
        System.out.println("Your weight is: " + weight);

        enter.close();
    }
}
