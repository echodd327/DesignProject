package effectiveJava.e6;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Herb {
	 
	public enum Type{
		ANNUAL,PERENIAL, BIENNIAL
	}
	private final String name;
	private final Type type;
	
	Herb(String name,Type type){
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return name;
	}
	
	public enum Pharse{
		  SOLID,LIQUID,CAS;
		  
		  public enum Transition{
			  MELT(SOLID,LIQUID),
			  FREEZE(LIQUID,SOLID),
			  BOIL(LIQUID,CAS),
			  CONDENSE(CAS,LIQUID),
			  SUBLIME(SOLID,CAS),
			  DEPOSIT(CAS,SOLID);
			  private final Pharse src;
			  private final Pharse dst;
			  
			  Transition(Pharse src,Pharse dst) {
				this.src = src;
				this.dst = dst;
			  }
		  }
		  
		  private static final Map<Pharse,Map<Pharse,Transition>> m = new EnumMap<Pharse,Map<Pharse,Transition>>(Pharse.class);
		  static{
			  for(Pharse p: Pharse.values()){
				  m.put(p, new EnumMap<Pharse,Transition>(Pharse.class));
			  }
			  for(Transition s: Transition.values()){
				  m.get(s.src).put(s.dst, s);
			  }
		  }
		  public static Transition from(Pharse src,Pharse dest){
			  return m.get(src).get(dest);
		  }
		  
		 
	}
	public static void main(String[] args) {
		Set<Herb> garden = new HashSet<Herb>();
		garden.add(new Herb("月季",Type.ANNUAL));
		garden.add(new Herb("玫瑰",Type.ANNUAL));
		garden.add(new Herb("百合",Type.PERENIAL));
		garden.add(new Herb("樱花",Type.PERENIAL));
		garden.add(new Herb("水仙",Type.BIENNIAL));
		Map<Herb.Type,Set<Herb>> herbsByType = new EnumMap<Herb.Type,Set<Herb>>(Herb.Type.class);
		for(Herb.Type t: Herb.Type.values()){
			herbsByType.put(t, new HashSet<Herb>());
		}
		for(Herb herb:garden){
			herbsByType.get(herb.type).add(herb);
		}
		System.out.println(herbsByType);
		
		System.out.println(Pharse.m);
		System.out.println(Pharse.from(Pharse.SOLID, Pharse.LIQUID));
	}
}
