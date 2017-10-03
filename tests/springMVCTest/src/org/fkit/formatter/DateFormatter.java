package org.fkit.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */

// ʵ��Converter<S,T>�ӿ�
public class DateFormatter implements Formatter<Date>{

	// ��������ģ�壺��yyyy-MM-dd
	private String datePattern;
	// ���ڸ�ʽ������
	private SimpleDateFormat dateFormat;
	
	// ��������ͨ������ע����������ʹ������ڸ�ʽ������
	public DateFormatter(String datePattern) {
		this.datePattern = datePattern;
		this.dateFormat = new SimpleDateFormat(datePattern);
	}

	// ��ʾFormatter<T>��T���Ͷ���
	@Override
	public String print(Date date, Locale locale) {
		return dateFormat.format(date);
	}

	// �����ı��ַ�������һ��Formatter<T>��T���Ͷ���
	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		try {
			return dateFormat.parse(source);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		
	}

	

}
