package Employee;

public class Main {

    public static void main(String[] args){
        Director director = new Director();
        Worker worker = new Worker();
        Accounter accounter = new Accounter();

        director.getProfession();
        worker.getProfession();
        accounter.getProfession();
    }

}