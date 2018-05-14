package effectiveJava.e8;



public class StringTest {
	
	public String statement(){
		String result = "";
		for(int i =0;i<10000;i++){
			result+=i;
		}
		return result;
	}
	
	public String statements(){
		StringBuilder b = new StringBuilder("");
		for(int i =0;i<10000;i++){
			b.append(i);
		}
		return b.toString();
	}
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		StringTest st = new StringTest();
//		st.statement();
		st.statements();
		long end = System.currentTimeMillis();
		System.out.println("耗费时间:"+(end-s));  //377  16
	    //第二种方法比第一种速度快很多倍，原因第1种成平方级增加，第一种成线性增加
	}
}
