package com.xiu.factory.complex;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationMul;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
