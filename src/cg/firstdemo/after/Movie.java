package cg.firstdemo.after;

import cg.firstdemo.after.movie.ChildrenMovie;
import cg.firstdemo.after.movie.NewReleaseMovie;
import cg.firstdemo.after.movie.RegularMovie;

public abstract  class Movie {

    public static final int CHILDRENS = 2; //儿童片，3天内1.5，大于3天就1天1.5
    public static final int REGULAR = 0; //常规片，2天内2块钱，大于2天就一天1.5
    public static final int NEW_RELEASE =1; //新片，1天3块钱

    private String title;

    public Movie(String title ){
        this.title = title;

    }
    public abstract  int getPriceCode();

    public String getTitle() {
        return title;
    }


    public abstract double getCharge(int dayRented);

    public int getFrequentRenterPoint(int dayRented){
        if((getPriceCode() == Movie.NEW_RELEASE)&& dayRented>1){
            return 2;
        }else{
            return 1;
        }
    }


    /**
     * 电影-->什么类型（可更改）--> 类型价格（可更改)
     * 1.店铺一周年促销，将所有新上映电影价格改为常规品价格
     * 2.6.1号促销，降低儿童片的价格
     */
    public  static void main(String[] args){
        String title = "超人总动员2";
        int type  = Movie.CHILDRENS; //需要将所有新上映片更改为 常规片类型。

        Movie movie = null;
        switch(type){
            case Movie.REGULAR:
                movie = new RegularMovie(title);
                break;
            case Movie.CHILDRENS:
                movie = new ChildrenMovie(title); //需要更改代码，ChildrenMovie
                break;
            case Movie.NEW_RELEASE:
                movie = new RegularMovie(title);
                break;
        }
        System.out.println(movie.getCharge(10)); //30块钱

    }
}
