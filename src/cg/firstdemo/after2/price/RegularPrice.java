package cg.firstdemo.after2.price;

import cg.firstdemo.after2.Movie;

public class RegularPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int dayRented) {
        double result = 2;
        if(dayRented > 2){
            result += (dayRented - 2) *1.5;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoint(int dayRented) {
        return 1;
    }
}
