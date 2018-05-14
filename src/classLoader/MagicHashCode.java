package classLoader;

public class MagicHashCode {
	
	private static final int HASH_INCREMENT = 0x61c88647;
	
	public static void main(String[] args) {
		hashCode(16);
		hashCode(32);
		hashCode(64);
	}
	
	private static void hashCode(Integer length){
		int hashcode = 0;
		for(int i = 0; i < length; i++){
			hashcode=i*HASH_INCREMENT+HASH_INCREMENT;
			System.out.print(hashcode & length-1);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
}
