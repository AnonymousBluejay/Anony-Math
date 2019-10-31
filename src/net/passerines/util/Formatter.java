package net.passerines.util;

public class Formatter {

	public static String superscript(String str) {
		//TODO: Handle ^10 and other multiple digits, using scanner
	    //str = str.replaceAll("\\^0", "⁰");
	    //str = str.replaceAll("\\^1", ""); //Heres the 1 should I ever need it: ¹
	    //str = str.replaceAll("\\^2", "²");
	    //str = str.replaceAll("\\^3", "³");
	    //str = str.replaceAll("\\^4", "⁴");
	    //str = str.replaceAll("\\^5", "⁵");
	    //str = str.replaceAll("\\^6", "⁶");
	    //str = str.replaceAll("\\^7", "⁷");
	    //str = str.replaceAll("\\^8", "⁸");
	    //str = str.replaceAll("\\^9", "⁹");
	    return str;
	}
	
	public static String removePointZero(String str) {
		str = str.replaceAll("\\.0", "");
		return str;
	}
}
