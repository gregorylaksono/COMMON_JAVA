package de.act.common.system;

import org.acegisecurity.providers.encoding.Md5PasswordEncoder;

public class SPassEncode2 {
	public static String encode(final String passwd) {
		final Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		// String salt= "3gp=sE)P2?Qlv#W+A:f&l\\B*|w";

		final String salt = "3gp=sE)P2?Qlv#W+A:f'l\\\\B*|w";
		final String encoded = encoder.encodePassword(passwd, salt);
		// System.out.println("Password: "+ passwd + " encode: "+ encoded);
		return encoded;
	}
	/*
	 * Md5PasswordEncoder encoder = new Md5PasswordEncoder(); String salt =
	 * "3gp=sE)P2?Qlv#W+A:f\'l\\\\B*|w"; for (String passwd : args) { String
	 * encoded = encoder.encodePassword(passwd, salt);
	 */
}
