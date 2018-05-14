package com.xiu.factory.complex;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationDiv;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
