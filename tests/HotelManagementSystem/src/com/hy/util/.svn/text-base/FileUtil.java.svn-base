package com.hy.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class FileUtil {

	/**
	 * 将inputStream转为二进制数组
	 * */
	public static byte[] InputStream2ByteArray(InputStream inputStream)
			throws Exception {
		ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
		byte[] buff = new byte[100];
		int rc = 0;
		while ((rc = inputStream.read(buff, 0, 100)) > 0) {
			swapStream.write(buff, 0, rc);
		}
		byte[] in2b = swapStream.toByteArray();
		return in2b;
	}

	/**
	 * 将二进制数组转为InputStream
	 * */
	public static InputStream byteArray2InputStream(byte[] b) {
		return new ByteArrayInputStream(b);
	}

	/**
	 * 下载
	 * */
	public static void download(InputStream stream, String path, String filename)
			throws IOException {
		FileOutputStream fs = new FileOutputStream(path + "/" + filename);
		byte[] buffer = new byte[1024 * 1024];
		int byteread = 0;
		while ((byteread = stream.read(buffer)) != -1) {
			fs.write(buffer, 0, byteread);
			fs.flush();
		}
		fs.close();
		stream.close();
	}

	/**
     * 下载附件
     * @param fileOriginalName 文件原始名称
     * @param path 文件路径
     * @param fileName 文件名称 
     * 
     */
    public static void download(String fileName,InputStream fis, HttpServletResponse response) {

    	try {
    		String contentType = "application/octet-stream;charset=utf-8";
			response.setContentType(contentType);

			StringBuffer contentDisposition = new StringBuffer();

			contentDisposition.append("attachment;");
			contentDisposition.append("filename=\"");
			contentDisposition.append(fileName);
			contentDisposition.append("\"");				
			response.setHeader("Content-Disposition", new String(
			        contentDisposition.toString().getBytes(
			                System.getProperty("file.encoding")), "iso8859_1"));			
			ServletOutputStream out = response.getOutputStream();

			byte[] bytes = null;
			try {  
	            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
	            byte[] b = new byte[1000];  
	            int n;  
	            while ((n = fis.read(b)) != -1) {  
	                bos.write(b, 0, n);  
	            }  
	            fis.close();  
	            bos.close();  
	            bytes = bos.toByteArray(); 
	        } catch (FileNotFoundException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }			
			if(bytes==null)
	    		return;
			
			out.write(bytes, 0, bytes.length);
			out.flush();
		} catch (Exception e) {				
			System.out.println("download error" + e.getMessage());
		}
    }
    
    /**
     * 通过文件路径删除文件
     * @param path 文件路径
     */
    public static void deleteFile(String path){
		File file = new File(path);
		if(file.isFile()&&file.exists()){
			file.delete();
		}
	}
}
