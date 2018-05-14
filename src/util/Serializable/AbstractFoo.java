package util.Serializable;

import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractFoo {
	
	private int x,y ;
	
	private enum State{
		NEW,INITIALIZING,INITIALZED
	}
	
	private final AtomicReference<State> init = new AtomicReference<State>(State.NEW);
	
	public AbstractFoo(int x, int y){
		this.initialize(x, y);
	}
	protected AbstractFoo(){}
	
	protected final void initialize(int x, int y){
		if(!init.compareAndSet(State.NEW, State.INITIALIZING)){
			throw new IllegalArgumentException("aready initalizied");
		}
		this.x = x;
		this.y = y;
		init.set(State.INITIALZED);
	}
	//所有共有方法和受保护方法都调用这个方法。
	private void checkInit(){
		if(init.get() != State.INITIALZED){
			throw new IllegalArgumentException("uninitalizied");
		}
	}
	
	public void sayHello(){
		this.checkInit();
		System.out.println("Hello world");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
