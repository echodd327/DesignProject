package effectiveJava.e7;

class wine{
	String name(){
		return "wind";
	}
}

class SparklingWind extends wine{

	@Override
	String name() {
		return "sparkWine";
	}
}
class Champagne extends SparklingWind{

	@Override
	String name() {
		return "Champagne";
	}
}

public class Overriding {
	
	public static void main(String[] args) {
		wine[] wines ={
			new wine(),new SparklingWind(),new Champagne()
		};
		for(wine w:wines){
			System.out.println(w.name());
		}
	}
}
