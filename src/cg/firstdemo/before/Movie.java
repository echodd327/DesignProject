package cg.firstdemo.before;

public class Movie {

    public static final int CHILDRENS = 2; //儿童片，3天内1.5，大于3天就1天1.5
    public static final int REGULAR = 0; //常规片，2天内2块钱，大于2天就一天1.5
    public static final int NEW_RELEASE =1; //新片，1天3块钱

    private String title;
    private int priceCode;
    public Movie(String title, int priceCode){
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
    public String getTitle() {
        return title;
    }
}
