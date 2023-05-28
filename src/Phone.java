import java.util.Scanner;

public class Phone {
    String number;
    String model;
    double weight;

    String receiveCallName = "Kate";
    private static String receiveCallNumber;

    public Phone(String a, String b, double c){
        number = a;
        model = b;
        weight = c;
    }

    public Phone(String a, String b){
        number=a;
        model=b;
    }

    public Phone(){
    }

    static String getNum(){
        Scanner enter = new Scanner(System.in);
        return enter.nextLine();
    }

    static String getModel(){
        Scanner enter = new Scanner(System.in);
        return enter.nextLine();
    }

    public String getNumber(){
        return number;
    }

    public void receiveCall(){
        this.receiveCallName = receiveCallName;
        System.out.println("The call from: " + receiveCallName);
    }
    public void receiveCall(String name, String number){
        this.receiveCallName = receiveCallName;
        this.receiveCallNumber = receiveCallNumber;
        System.out.println("The call from: " + receiveCallName + "\n" + receiveCallNumber);
    }
    public static void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Send message to number " + numbers[i]);
        }

//    public void receiveCall(String receiveCallName, String number){
//        System.out.println("There is calling from: " + receiveCallName + "\n" + number);
//    }

    }
    }

