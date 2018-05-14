package current.thread;

public class UnsafeStates {
	
	private String[] states = new String[]{"aa","bb"};

	public String[] getStates() {
		return states;
	}
	
	public static void main(String[] args) {
		UnsafeStates s = new UnsafeStates();
		s.getStates()[1]="cc";
		System.out.println(s.states[1]);
	}
}
