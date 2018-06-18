package cg.firstdemo.after.movie;

import cg.firstdemo.after.Movie;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int dayRented) {
        return dayRented * 3;
    }
}
