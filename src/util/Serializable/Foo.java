
package util.Serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Foo extends AbstractFoo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4754886066128761782L;
	
	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException{
		s.defaultReadObject();
		
		int x = s.readInt();
		int y = s.readInt();
		initialize(x, y);
	}
	
	private void writeObject(ObjectOutputStream s) throws IOException{
		s.defaultWriteObject();
		
		s.writeInt(getX());
		s.writeInt(getY());		
	}
	
	public Foo(int x, int y){
		super(x,y);
	}
	
}
