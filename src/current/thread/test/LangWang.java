package current.thread.test;
/**
 * 狼王
 */
public class LangWang implements IWolf {

    private static LangWang langWang ;
    private  LangWang(){
        System.out.println("狼王产生了--构造方法被调用");
    }
    public static LangWang getLangWang(){
        if(null == langWang){
            langWang = new LangWang() ;
        }
        System.out.println("狼王对应的地址："+langWang.toString());
        return langWang ;
    }

    public static void main(String args[]){
        LangWang.getLangWang().doSomting();
        LangWang.getLangWang().buLie();
    }

    @Override
    public void doSomting() {
        // 安排一些工作给下属狼 比如侦查狼
        ZhenChaLang zhenChaLang1 = new ZhenChaLang() ;
        System.out.print("侦察狼 "+zhenChaLang1.toString());
        zhenChaLang1.doSomting();

        ZhenChaLang zhenChaLang2 = new ZhenChaLang();
        System.out.print("侦察狼 "+zhenChaLang2.toString());
        zhenChaLang2.fangShao();
    }
    
    public void buLie(){
        BuLieLang buLieLang1 = new BuLieLang() ;
        System.out.print("捕猎狼 "+buLieLang1.toString());
        buLieLang1.doSomting();

        BuLieLang buLieLang2 = new BuLieLang() ;
        System.out.print("捕猎狼 "+buLieLang2.toString());
        buLieLang1.doSomting();
    }
}