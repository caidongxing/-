package org.fkit.converter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class  DateEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException{
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=simpleDateFormat.parse(text);
			setValue(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}