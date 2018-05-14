package current.thread.test;
/**
 * 侦察狼
 */
public class ZhenChaLang implements IWolf {

    @Override
    public void doSomting() {
        // 执行狼王交行的任务
        System.out.println(" 去探路");
    }

    public void fangShao(){
        System.out.println(" 去放哨");
    }
}