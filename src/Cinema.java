public class Cinema {
    //vars - data members
    private int userAge;
    private int numberOfTickets;
    private int totalPrice;

    // constructor - default 
    public Cinema(){
        userAge=0;
        numberOfTickets=0;
        totalPrice=0;
    }

    //setters - 1 setter per input
    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

    public void setNumberOfTickets(int numberOfTickets){
        this.numberOfTickets=numberOfTickets;
    }

    //computes total price based on age discount rules
    public void computeTotalPrice(){
        if (userAge>=18){
            totalPrice=numberOfTickets*15; // adult price
        } else {
            totalPrice=numberOfTickets*10; // underage price
        }
    }

    //getter
    public int getTotalPrice(){
        return totalPrice;
    }
}
