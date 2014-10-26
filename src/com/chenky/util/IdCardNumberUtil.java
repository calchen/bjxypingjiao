package com.chenky.util;

/**
 * 身份证工具 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class IdCardNumberUtil {
	private static final String FUZZYWORDS = "******";
	private static final int IDCARDNUMLENGTH = 18;

	/**
	 * 模糊身份证号
	 * 
	 * @param idCardNum
	 * @return
	 */
	public static String fuzzy(String idCardNum) {
		if (isLegal(idCardNum)) {
			idCardNum = idCardNum.substring(0,
					IDCARDNUMLENGTH - FUZZYWORDS.length())
					+ FUZZYWORDS;
		}
		return idCardNum;
	}

	/**
	 * 判断身份证号是否被模糊,本方法会先检测输入的身份证号是否合法，如果不合法直接返回false
	 * 
	 * @param idCardNum
	 * @return
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
	 * @return 合法返回true，不合法返回false
	 */
	public static boolean isLegal(String idCardNum) {
		if (idCardNum == null || "".equals(idCardNum)) {
			return false;
		}
		if (idCardNum.length() != IDCARDNUMLENGTH) {
			return false;
		}
		return true;
	}
}
