import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Height m: "); //(вводить рост в формате с запятой 1,68)
        double height = enter.nextDouble();

        System.out.print("Weight kg: ");
        int weight = enter.nextInt();

        enter.close();
        double value = (weight/(height*height));
        System.out.format("Your BMI is: " + "%.1f",value);
    }
}
