package util;

public class NutritionFacts {
	
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int soduim;
	private final int carbohydrate;
	
	public static class Builder{
		private  int servingSize;
		private  int servings;
		private  int calories;
		private  int fat;
		private  int soduim;
		private  int carbohydrate;
		
		public Builder(int servingSize,int servings, int calories){
			this.servingSize = servingSize;
			this.servings = servings;
			this.calories = calories;
		}
		public  Builder fat(int val){
		   fat = val;
		   return this;
		}
		public Builder soduim(int val){
			soduim = val;
			return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		public NutritionFacts getInstance(){
			return new NutritionFacts(this);
		}
		
	}
	
	public NutritionFacts(Builder builder){
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.soduim = builder.soduim;
		this.carbohydrate = builder.carbohydrate;
		
	}
	
	
	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings="
				+ servings + ", calories=" + calories + ", fat=" + fat
				+ ", soduim=" + soduim + ", carbohydrate=" + carbohydrate + "]";
	}



	public static void main(String[] args) {
		NutritionFacts fact = new NutritionFacts.Builder(1, 2, 3).
				fat(4).soduim(5).carbohydrate(6).getInstance();
		System.out.println(fact);
		
	}
}
