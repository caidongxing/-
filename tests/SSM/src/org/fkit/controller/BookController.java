package org.fkit.controller;

import java.util.List;

import org.apache.log4j.chainsaw.Main;
import org.fkit.domain.Book;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理图书请求控制器
 * */
//@Controller
//public class BookController {
//	
//	/**
//	 * 自动注入BookService
//	 * */
//	@Autowired
//	@Qualifier("BookService")
//	private BookService bookService;
//
//	/**
//	 * 处理/main请求
//	 * */
//	@RequestMapping(value="/main")
//	 public String main(Model model){
//		// 获得所有图书集合
//		List<Book> book_list = bookService.getAll();
//		// 将图书集合添加到model当中
//		model.addAttribute("book_list", book_list);
//		// 跳转到main页面
//		return "main";
//	}
//	
//}
@Controller
public class BookController{
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	@RequestMapping(value="/main")
	public String main(Model mv){
		List<Book> books=bookService.getAll();
		mv.addAttribute("books", books);
		return "main";
	}
}


