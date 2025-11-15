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

    //compute
    public void computeTotalPrice(){
        if (userAge>=18){
            totalPrice=ticketsNum*15;
        } else {
            totalPrice=ticketsNum*10;
        }
    }

    //getter
    public int getTotalPrice(){
        return totalPrice;
    }
}
