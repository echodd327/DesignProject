package com.xiu.factory.fourone;

public abstract class WorkerParallel extends ParallelService {

	@Override
	public void waitWorking(String host, int port, String workType) {
		 waitWorkingService(host,port,workType);
	}

	@Override
	public void waitWroking(String workType) {
		waitWorkingService(workType);
	}
	
	public abstract void waitWorkingService(String host, int port, String workType);
	
	public abstract void waitWorkingService(String workType);


}
