package current.thread.futureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Preloader {
	
	private final FutureTask<ProductInfo> future = new FutureTask<ProductInfo>(new Callable<ProductInfo>() {

		@Override
		public ProductInfo call() throws Exception {
			return null;
		}
		 
	});
	private final Thread thread = new Thread(future);
	
	public void start(){
		thread.start();
	}
	
	public ProductInfo get(){
		try {
			return future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
