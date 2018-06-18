package cg.firstdemo.after2.price;

import cg.firstdemo.after2.Movie;

public abstract class Price {

    public abstract int getPriceCode();

     public abstract  double getCharge(int dayRented);

     public abstract  int getFrequentRenterPoint(int dayRented);
}
