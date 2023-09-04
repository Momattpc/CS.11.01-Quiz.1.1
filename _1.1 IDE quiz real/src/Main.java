import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your age? (Integers only, no trolling please) ");
        int age = scanner1.nextInt();
        System.out.println("Received successfully. Alright, what is your first name? (once again, no trolling please) ");
        String firstname = scanner1.next();
        System.out.println("Alright," + " " + firstname + " " + ",that's a cool name, " + "finally, what is your favourite food?");
        String favouriteFood = scanner1.next();
        System.out.println("Cool. So now I have a bunch of information about you. \nIn summary, your first name is:" + " " + firstname + "\nYour age is: " + age + "\nand your favourite food is: " + favouriteFood);
    }
}