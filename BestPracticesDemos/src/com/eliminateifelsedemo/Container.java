package com.eliminateifelsedemo;

public class Container {
	public static Object getObjectInstance(String itemName){
		Object object = null;
		try {
			object = (Object)Class.forName(itemName).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}
}
