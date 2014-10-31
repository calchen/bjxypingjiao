package com.chenky.util;

/**
 * 身份证工具 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class IdCardNumberUtil {
	/**
	 * 用于模糊的字符
	 */
	private static final String FUZZYWORDS = "******";

	/**
	 * 模糊身份证号后几位，长度由FUZZYWORDS的长度决定
	 * 
	 * @param idCardNum
	 *            身份证号
	 * @return 模糊后的身份证号
	 */
	public static String fuzzy(String idCardNum) {
		if (isLegal(idCardNum)) {
			idCardNum = idCardNum.substring(0,
					idCardNum.length() - FUZZYWORDS.length())
					+ FUZZYWORDS;
		}
		return idCardNum;
	}

	/**
	 * 判断身份证号是否被模糊,本方法会先检测输入的身份证号是否合法，如果不合法直接返回false
	 * 
	 * @param idCardNum
	 *            身份证号
	 * @return 是否被模糊
	 */
	public static boolean hasFuzzied(String idCardNum) {
		if (!isLegal(idCardNum)) {
			return false;
		}
		if (!idCardNum.endsWith(FUZZYWORDS)) {
			return false;
		}
		return true;
	}

	/**
	 * 判断输入的身份证号是否合法
	 * 
	 * @param idCardNum
	 *            身份证号
	 * @return 合法返回true，不合法返回false
	 */
	public static boolean isLegal(String idCardNum) {
		if (idCardNum == null || "".equals(idCardNum)) {
			return false;
		}
		if (idCardNum.length() != 18 && idCardNum.length() != 15) {
			return false;
		}
		return true;
	}
}
