package cg.firstdemo.after2.price;

import cg.firstdemo.after2.Movie;

public class NewReleasePrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int dayRented) {
        return  dayRented * 3;
    }

    @Override
    public int getFrequentRenterPoint(int dayRented) {
        if(dayRented>1)
        return 2;
        else
            return 1;
    }
}
