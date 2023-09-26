package com.Stream;

import java.io.IOException;

public class Shutdown {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		
		try {
			run.exec("shutdown /s 10");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
