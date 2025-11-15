import java.util.Scanner;
public class CinemaAPP {
    public static void main(String[] args) {
        //vars
        int userAge;
        int numberOfTickets;
        int totalPrice;

        //objs
        Scanner keyboard=new Scanner(System.in);
        Cinema c=new Cinema();

        //inputs
        System.out.println("What is your age?");
        userAge=keyboard.nextInt();
        c.setUserAge(userAge);

        System.out.println("How many tickets?");
        numberOfTickets=keyboard.nextInt();
        c.setNumberOfTickets(numberOfTickets);
        
        //process
        c.computeTotalPrice();

        //output
        totalPrice=c.getTotalPrice();
        System.out.println("Total price to be paid: €" + totalPrice);
        keyboard.close();
    }
}