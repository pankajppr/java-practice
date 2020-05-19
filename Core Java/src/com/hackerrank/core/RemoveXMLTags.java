package com.hackerrank.core;

public class RemoveXMLTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		
		String lineReplaced = line.replaceAll("<h1>[\\\\s\\\\S]*?</h1>", "");
		
		System.out.println(lineReplaced);

	}

}
