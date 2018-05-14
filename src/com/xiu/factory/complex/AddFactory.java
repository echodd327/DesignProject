package com.xiu.factory.complex;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationAdd;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
