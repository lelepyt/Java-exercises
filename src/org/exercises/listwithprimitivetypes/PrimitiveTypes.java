package org.exercises.listwithprimitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		byte variableByte = 123;
		short variableShort = 32722;
		int variableInt = 21474836;
		long variableLong = 32333333;
		float variableFloat = 31.24f;
		boolean variableBoolean = true;
		char variableChar = 1044;
		double variableDouble = 123.1;

		list.add(variableByte);
		list.add(variableShort);
		list.add(variableInt);
		list.add(variableLong);
		list.add(variableFloat);
		list.add(variableBoolean);
		list.add(variableChar);
		list.add(variableDouble);
		System.out.println("This is all primitive types which is available in the lis: " + list.toString());
	}

}
