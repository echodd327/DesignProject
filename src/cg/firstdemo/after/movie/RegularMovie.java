package cg.firstdemo.after.movie;

import cg.firstdemo.after.Movie;

public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public int getPriceCode() {
       return Movie.REGULAR;
    }

    @Override
    public double getCharge(int dayRented) {
        double result =2;
        if(dayRented > 2){
            result += (dayRented - 2) *1.5;
        }
        return result;
    }
}
