package com.hj.util;

import java.io.IOException;
import java.security.MessageDigest;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/*
    //MD5加密和解密
    public static String getMD5(String MD5str) throws Exception{
	MessageDigest md=MessageDigest.getInstance("md5");
	byte[] buf=md.digest(MD5str.getBytes());
	BASE64Encoder encodes=new  BASE64Encoder();
	String mds=encodes.encode(buf);
	return mds;
    // BASE加密和解密
	String str5=new BASE64Encoder().encode(MessageDigest.getInstance("md5").digest(MD5str.getBytes()));
	return str5;
}*/

//MD5加密和解密
public class MD5Util {
	public static String getMD5(String MD5str) throws Exception {
		MessageDigest md = MessageDigest.getInstance("md5");
		byte[] buf = md.digest(MD5str.getBytes());
		BASE64Encoder encoder = new BASE64Encoder();
		String mds = encoder.encode(buf);
		return mds;
	}

// BASE加密和解密
public static void de(String base) {
		System.out.println(base);
		BASE64Encoder encoder = new BASE64Encoder();
		String bb = encoder.encode(base.getBytes());
		System.out.println(bb);
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] b1 = decoder.decodeBuffer(bb);
			System.out.println(new String(b1));
		} catch (IOException e) {
			e.printStackTrace();
		}
}
	public static void main(String[] args) throws Exception {
		System.out.println(getMD5("yyyyy"));
	}
}
