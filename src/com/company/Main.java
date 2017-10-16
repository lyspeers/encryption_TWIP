package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/* use string builder class to store encryption key.
	StringBuilder x = new StringBuilder
	x.append("HI")
	use Integer.parseInt() with a string to get decryption key from user input
	int i = Integer.parseInt("576")
	SOP i + 4 outputs 580

	Instead using getNumericValue(String.charAt())
	simplified to (mKey.charAt(0)-'0'));
	the - 0 is to t=get the numeric vakue since all the number ASCII codes - the 0 ASCII code gives you the original number
	 */
	Encryptor y = new Encryptor("Hi there how are you");
	System.out.println(y.encrypted);
	Scanner de = new Scanner(System.in);
	String k = de.next();
	y.decryptor(k);
    }

}
