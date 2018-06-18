package cg.firstdemo.before;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector rentals = new Vector();

    public Customer(String name){
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.add(arg);
    }
    public String getName() {
        return name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequmentRenterPoints = 0;
        Enumeration rentalsEnums = rentals.elements();
        String result = "Rental Record for "+ this.getName() + "\n";
        while(rentalsEnums.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental)rentalsEnums.nextElement();

            switch (each.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmount+=2;
                    if(each.getDayRented() > 2){
                        thisAmount += (each.getDayRented() - 2) *1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if(each.getDayRented() > 3){
                        thisAmount +=(each.getDayRented() - 3)*1.5;
                    }
                    break;
            }
            frequmentRenterPoints ++;
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)&& each.getDayRented()>1){
                frequmentRenterPoints++;
            }

            result += "\t" +  each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }
        result += "Amount owned is :" +String.valueOf(totalAmount) +"\n";
        result += "You earned "+String.valueOf(frequmentRenterPoints) + " frequent renter points";
        return result;
    }
}
