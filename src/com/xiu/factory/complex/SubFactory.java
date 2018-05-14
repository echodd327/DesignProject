package com.xiu.factory.complex;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationSub;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
