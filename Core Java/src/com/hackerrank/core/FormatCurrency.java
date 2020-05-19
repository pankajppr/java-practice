package com.hackerrank.core;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment1 = 12324.134;
		DecimalFormat df2 = new DecimalFormat("#.##");
		String payment2 = df2.format(payment1);
		Double payment = new Double(payment2);
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat in = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
		NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		
		String inStr = in.format(payment);
		System.out.println("US: "+ us.format(payment));
		System.out.println("India: Rs."+ inStr.substring(1,inStr.length()));
		System.out.println("China: "+ ch.format(payment));
		System.out.println("France: "+ fr.format(payment));

	}

}
