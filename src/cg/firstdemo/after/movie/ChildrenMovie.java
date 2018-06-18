package cg.firstdemo.after.movie;

import cg.firstdemo.after.Movie;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public int getPriceCode() {
       return  Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int dayRented) {
        double result = 1.5;
        if(dayRented > 3){
            result +=(dayRented - 3)*1.5;
        }
        return result;
    }

}
