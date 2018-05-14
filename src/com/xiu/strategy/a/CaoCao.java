package com.xiu.strategy.a;
public class CaoCao {

    public static void main(String args[]){
        /**
         * 曹操疑心重，选择了华容道，对曹操来说至于杂样走华容道，不关心，死多少人也不关心，只关心我要走这条道就好
         */
        IRunStrategy huaRongRoad = new HuaRongRoad() ;
        ContextRunStrategy contextRunStrategy = new ContextRunStrategy(huaRongRoad) ;
        contextRunStrategy.choiceRoad();
    }
}

