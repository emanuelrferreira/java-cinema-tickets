import java.util.Scanner;
public class CinemaAPP {
    public static void main(String[] args) {
        //vars
        int userAge;
        int ticketsNum;
        int totalPrice;

        //objs
        Scanner keyboard=new Scanner(System.in);
        Cinema c=new Cinema();

        //inputs
        System.out.println("What is your age?");
        userAge=keyboard.nextInt();
        c.setUserAge(userAge);

        System.out.println("How many tickets?");
        ticketsNum=keyboard.nextInt();
        c.setTicketsNum(ticketsNum);
        
        //process
        c.computeTotalPrice();

        //output
        totalPrice=c.getTotalPrice();
        System.out.println("Total price to be paid: €" + totalPrice);
        keyboard.close();
    }
}