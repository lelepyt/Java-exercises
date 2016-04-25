package org.exercises.listwithprimitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		byte variableByte = 123;
		String.valueOf( variableByte);
		short variableShort = 32722;
		String.valueOf( variableShort);
		int variableInt = 21474836;
		String.valueOf( variableInt);
		long variableLong = 32333333;
		String.valueOf( variableLong);
		float variableFloat = 31.24f;
		String.valueOf( variableFloat);
		boolean variableBoolean = true;
		String.valueOf( variableBoolean);
		char variableChar = 1044;
		String.valueOf( variableChar);
		double variableDouble = 123.1;
		String.valueOf( variableDouble);

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
