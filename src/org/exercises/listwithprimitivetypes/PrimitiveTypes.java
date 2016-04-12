package org.exercises.listwithprimitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		Byte variableByte = 123;
		Short variableShort = 32722;
		Integer variableInt = 21474836;
		Long variableLong = (long) 32333333;
		Float variableFloat = 31.24f;
		Boolean variableBoolean = true;
		Character variableChar = 1044;
		Double variableDouble = 123.1;
		

		list.add(variableByte);
		list.add(variableShort);
		list.add(variableInt);
		list.add(variableLong);
		list.add(variableFloat);
		list.add(variableBoolean);
		list.add(variableChar);
		list.add(variableDouble);
		System.out.println("This is all primitive types which are available in the list: " + list.toString());
	}

}
