package com.xiu.factory.fourone;

public abstract class MigrantWorker extends WorkerParallel {

	@Override
	public void waitWorkingService(String host, int port, String workType) {
		System.out.println("开启服务!");
	}

	@Override
	public void waitWorkingService(String workType) {
		System.out.println("从配置文件里面开启服务!");
	}

}
