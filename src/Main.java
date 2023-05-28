public class Main {
    public static void main(String[] args){
        Phone firstPhone = new Phone();
//        firstPhone.number = "+375665678432";
//        firstPhone.model = "SonyEricsson";
//        firstPhone.weight = 98.40;

//        System.out.println();
//        firstPhone.receiveCall();
//        firstPhone.getNumber();


        Phone secondPhone = new Phone();
//        secondPhone.number = "+375280678454";
//        secondPhone.model = "Nokia";
//        secondPhone.weight = 120.00;

//        System.out.println();
//        secondPhone.receiveCall();
//        secondPhone.getNumber();


        Phone thirdPhone = new Phone();
//        thirdPhone.number = "+375445671932";
//        thirdPhone.model = "Samsung";
//        thirdPhone.weight = 95.46;

//        System.out.println();
//        thirdPhone.receiveCall();
//        thirdPhone.getNumber();


        System.out.print("Enter the first phone number: ");
        firstPhone.number= Phone.getNum();
        firstPhone.receiveCall("Kate");
        System.out.print("Enter the model: ");
        firstPhone.model = Phone.getModel();
        System.out.print("Enter the weight: ");
        firstPhone.weight = Double.parseDouble(Phone.getNum());

        System.out.print("Enter the second phone number: ");
        secondPhone.number= Phone.getNum();
        secondPhone.receiveCall2("John");
        System.out.print("Enter the model: ");
        secondPhone.model = Phone.getModel();
        System.out.print("Enter the weight: ");
        secondPhone.weight = Double.parseDouble(Phone.getNum());

        System.out.print("Enter the third phone number: ");
        thirdPhone.number= Phone.getNum();
        thirdPhone.receiveCall3("Lina");
        System.out.print("Enter the model: ");
        thirdPhone.model = Phone.getModel();
        System.out.print("Enter the weight: ");
        thirdPhone.weight = Double.parseDouble(Phone.getNum());



        System.out.println("The first phone is: " + firstPhone.model + ", with number: " + firstPhone.number +
                ", with weight: " + firstPhone.weight);
        System.out.println("The second phone is: " + secondPhone.model + ", with number: " + secondPhone.number +
                ", with weight: " + secondPhone.weight);
        System.out.println("The third phone is: " + thirdPhone.model + ", with number: " + thirdPhone.number +
                ", with weight: " + thirdPhone.weight);

        System.out.println();
        firstPhone.receiveCall("Kate");
        firstPhone.getNumber();

        secondPhone.receiveCall2("John");
        secondPhone.getNumber();

        thirdPhone.receiveCall3("Lina");
        thirdPhone.getNumber();

        System.out.println();
        Phone.sendMessage(firstPhone.number, secondPhone.number, thirdPhone.number);
    }
}
