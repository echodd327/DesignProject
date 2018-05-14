package current.thread.test;
public class DCLSingleTon {

    private DCLSingleTon(){}
    static class SingleTonHolder{
     private static final DCLSingleTon instance = new DCLSingleTon() ;
    }

    public static DCLSingleTon getInstance(){
        return SingleTonHolder.instance ;
    }

}