public class Cinema {
    //vars - data members
    private int userAge;
    private int ticketsNum;
    private int totalPrice;

    // constructor - default 
    public Cinema(){
        userAge=0;
        ticketsNum=0;
        totalPrice=0;
    }

    //setters - 1 setter per input
    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

    public void setTicketsNum(int ticketsNum){
        this.ticketsNum=ticketsNum;
    }

    //computes total price based on age discount rules
    public void computeTotalPrice(){
        if (userAge>=18){
            totalPrice=ticketsNum*15; // adult price
        } else {
            totalPrice=ticketsNum*10; // underage price
        }
    }

    //getter
    public int getTotalPrice(){
        return totalPrice;
    }
}
