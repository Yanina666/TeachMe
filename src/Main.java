import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getPersonalData();
        getSymbol();
        getIBM();
    }

    public static void getPersonalData() {
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

    }

    public static void getSymbol() {
        char thisSymbol = 'D';
        System.out.println("ASCII: " + (int) thisSymbol);
    }

    public static void getIBM() {
        Scanner enter = new Scanner(System.in);


        System.out.print("Weight kg: ");
        double weight = enter.nextDouble();

        System.out.print("Height sm: ");
        int height = enter.nextInt();

        System.out.format("Your BMI is: " + "%.1f",weight / (height * height) * 10000);

        enter.close();
    }
}
