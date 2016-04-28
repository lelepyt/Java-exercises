package org.exercises.lists.listwithprimitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		byte variableByte = 123;
		Byte convertVariableByte = Byte.valueOf(variableByte);
		short variableShort = 32722;
		Short convertVariableShort = Short.valueOf(variableShort);
		int variableInt = 21474836;
		Integer convertVariableInteger = Integer.valueOf(variableInt);
		long variableLong = 32333333;
		Long convertVariableLong = Long.valueOf(variableLong);
		float variableFloat = 31.24f;
		Float convertVariableFloat = Float.valueOf(variableFloat);
		boolean variableBoolean = true;
		Boolean convertVariableBoolean = Boolean.valueOf(variableBoolean);
		char variableChar = 1044;
		Character convertVariableCharacter = Character.valueOf(variableChar);
		double variableDouble = 123.1;
		Double convertVariableDouble = Double.valueOf(variableDouble);

		list.add(convertVariableByte);
		list.add(convertVariableShort);
		list.add(convertVariableInteger);
		list.add(convertVariableLong);
		list.add(convertVariableFloat);
		list.add(convertVariableBoolean);
		list.add(convertVariableCharacter);
		list.add(convertVariableDouble);
		System.out.println("This is all primitive types which are available in the list: " + list.toString());
	}

}
