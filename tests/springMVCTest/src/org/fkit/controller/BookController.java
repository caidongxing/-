package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;

import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ����ͼ�����������
 * */
@Controller
public class BookController {


	/**
	 * ����/main����
	 * */
	@RequestMapping(value="/main")
	 public String main(Model model){
		// ģ�����ݿ�������ͼ�鼯��
		List<Book> book_list = new ArrayList<Book>();
		book_list.add(new Book("java.jpg","���Java���壨�����̣�","��� ����",74.2));
		book_list.add(new Book("ee.jpg","������Java EE��ҵӦ��ʵս","��� ����",59.2));
		book_list.add(new Book("android.jpg","���Android���壨�����̣�","��� ����",60.6));
		book_list.add(new Book("ajax.jpg","���Ajax���壨�����̣�","��� ����",66.6));
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("book_list", book_list);
		// ��ת��mainҳ��
		return "main";
	}
	
}
