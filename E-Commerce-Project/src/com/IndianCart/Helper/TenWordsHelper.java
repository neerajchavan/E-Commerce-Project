package com.IndianCart.Helper;

public class TenWordsHelper {

	public static String getTenWords(String description) {
		String[] str = description.split(" ");

		if (str.length > 10) {
			String res = "";
			for (int i = 0; i < 10; i++) {
				res = res + str[i]+" ";
			}
			return (res + "...");
		} else {
			return description + "...";
		}
	}

}
