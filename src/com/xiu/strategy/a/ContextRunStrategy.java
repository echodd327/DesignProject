package com.xiu.strategy.a;
public class ContextRunStrategy {

    private IRunStrategy iRunStrategy ;

    public ContextRunStrategy(IRunStrategy iRunStrategy){
        this.iRunStrategy = iRunStrategy ;
    }

    /**
     * 选择道路
     */
    public void choiceRoad(){
        iRunStrategy.escapeRoute();
    }
}

