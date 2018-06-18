package cg.firstdemo.after2;

import cg.firstdemo.after2.price.ChildrenPrice;
import cg.firstdemo.after2.price.NewReleasePrice;
import cg.firstdemo.after2.price.Price;
import cg.firstdemo.after2.price.RegularPrice;

public class Movie {

    public static final int CHILDRENS = 2; //儿童片，3天内1.5，大于3天就1天1.5
    public static final int REGULAR = 0; //常规片，2天内2块钱，大于2天就一天1.5
    public static final int NEW_RELEASE =1; //新片，1天3块钱

    private Price price;
    private String title;
    public void setPriceCode(int priceCode) {
       switch (priceCode){
           case REGULAR:
               price = new RegularPrice(); //
               break;
           case NEW_RELEASE:
               price = new RegularPrice();
               break;
           case CHILDRENS:
               price = new ChildrenPrice();
               break;
               default:
                   throw  new RuntimeException("Incorrect Price Code");
       }
    }

    public Movie(String title){
        this.title = title;

    }
    public int getPriceCode() {
        return price.getPriceCode();
    }


    public String getTitle() {
        return title;
    }


    public double getCharge(int dayRented){
        return price.getCharge(dayRented);
    }
    public int getFrequentRenterPoint(int dayRented){
        return price.getFrequentRenterPoint(dayRented);
    }

    /**
     * 电影-->什么类型（可更改）--> 类型价格（可更改)
     * 1.店铺一周年促销，将所有新上映电影价格改为常规品价格
     * 2.6.1号促销，降低儿童片的价格
     */
    public  static void main(String[] args){
        //后台录入
        String title = "超人总动员2";
        int priceCode = Movie.NEW_RELEASE;

        //获取价格，从后台里面查询出影片和类型
        Movie movie = new Movie(title);
        movie.setPriceCode(priceCode);
        System.out.println(movie.getCharge(10)); //14块钱


    }
}
