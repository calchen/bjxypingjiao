package com.chenky.util;

import java.security.MessageDigest;

/**
 * sha1加密工具类 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class Sha1Util {

	/**
	 * 采用的加密算法
	 */
	private static final String ALGORITHM = "SHA1";
	/**
	 * 所有十六进制小写字母
	 */
	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/**
	 * sha1加密
	 *
	 * @param str
	 * @return String
	 */
	public static String hex_sha1(String str) {
		if (str == null) {
			str = "";
		}
		try {
			// 根据常量ALGORITHM判断使用什么加密方式，这里默认为sha1
			MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
			messageDigest.update(str.getBytes());
			return getFormattedText(messageDigest.digest());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 将密文转换成十六进制形式
	 *
	 * @param bytes
	 *            the raw bytes from the digest.
	 * @return the formatted bytes.
	 */
	private static String getFormattedText(byte[] bytes) {
		int len = bytes.length;
		StringBuilder buf = new StringBuilder(len * 2);
		// 把密文转换成十六进制的字符串形式
		for (int j = 0; j < len; j++) {
			buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
			buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
		}
		return buf.toString();
	}
}