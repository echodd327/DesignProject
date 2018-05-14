package current.thread.semaphore;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class BoundedHashSet<T> {
	
	private final Set<T> set;
	private final Semaphore sem;
	
	public BoundedHashSet(int bound){
		this.set = Collections.synchronizedSet(new HashSet<T>());
		this.sem = new Semaphore(bound);
	}
	
	public boolean add(T o) throws InterruptedException{
		sem.acquire();
		boolean wasAdd = false;
		try{
			wasAdd = set.add(o);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(!wasAdd)
				sem.release();
		}
		return wasAdd;
	}
	
	public boolean remove(Object o){
		boolean wasRemoved = set.remove(o);
		if(wasRemoved)
			sem.release();
		return wasRemoved;
	}
	
	
}
