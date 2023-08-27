package com.pga;
public class URLify {
	public static String urlify(String input, int trueLen) {
		char[] str = input.toCharArray();
		// space count
		int spaceCount = 0;
		for (int i = 0 ; i < trueLen; i++) {
			if (str[i] == ' ')
			spaceCount++;
		}
		
		int index = trueLen + (2 * spaceCount);
		if (str.length > index) {
			str[trueLen] = '\0';
		}
		
		for (int i = trueLen - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 3] = '%';
				str[index - 2] = '2';
				str[index - 1] = '0';
				index -= 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		return new String(str);
	}
}
