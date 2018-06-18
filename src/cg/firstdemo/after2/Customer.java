package cg.firstdemo.after2;

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
            Rental each = (Rental)rentalsEnums.nextElement(); //变量1
            result += "\t" +  each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        result += "Amount owned is :" +String.valueOf(getTotalCharge()) +"\n";
        result += "You earned "+String.valueOf(getTotalFrequmentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentalsEnums = rentals.elements();
        while(rentalsEnums.hasMoreElements()) {
            Rental each = (Rental) rentalsEnums.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    private int getTotalFrequmentRenterPoints(){
        int result = 0;
        Enumeration rentalsEnums = rentals.elements();
        while(rentalsEnums.hasMoreElements()) {
            Rental each = (Rental) rentalsEnums.nextElement();
            result += each.getFrequentRenterPoint();
        }
        return result;
    }


}
