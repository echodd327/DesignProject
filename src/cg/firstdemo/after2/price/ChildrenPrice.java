package cg.firstdemo.after2.price;

import cg.firstdemo.after2.Movie;

public class ChildrenPrice extends Price{

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int dayRented) {
        double result = 1.5;
        if(dayRented > 3){
            result +=(dayRented - 3)*1.5;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoint(int dayRented) {
        return 1;
    }


}
