package com.eliminateifelsedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) {
		System.out.println("press any key");
		String file = "D:\\workspacekepler\\BestPracticesDemos\\src\\com\\eliminateifelsedemo\\properties\\objects.properties";
		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Properties prop = new Properties();
		try {
			input = br.readLine();
			prop.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(MessageFormat.format(prop.getProperty(input),input));
		
		Item item = (Item) Container.getObjectInstance(prop.getProperty(input));
		item.displayItem();
	}

}
