package effectiveJava.e5;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	
	private Map<Class<?>, Object> favorites = new HashMap<Class<?>,Object>();
	
	public <T> void putFavorites(Class<T> type, T instance){
		if(type ==null){
			throw new NullPointerException("type is null");
		}
		favorites.put(type, type.cast(instance));
	}
	//返回对象的引用,动态转换class所表示类型
	public <T> T getFavorites(Class<T> type){
		return type.cast(favorites.get(type));
	}
	
	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorites(String.class, "Java");
		f.putFavorites(Integer.class, 0xcafebaba);
		f.putFavorites(Class.class, Favorites.class);
		String favoriteString = f.getFavorites(String.class);
		int favoriteInteger = f.getFavorites(Integer.class);
		Class<?> favoriteClass = f.getFavorites(Class.class);
		
		System.out.printf("%s %x %s%n", favoriteString,favoriteInteger,favoriteClass.getName());
	}
}
