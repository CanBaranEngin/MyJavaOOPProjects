import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to Movie Order Program");
        System.out.println("Please enter your name: ");
        String name=inp.nextLine();
        System.out.println("Please enter your password: ");
        String password=inp.nextLine();
        User user=new User(1,name,password);
        Purchase p = new Purchase(user);
        p.purchaseSystem();




    }

}