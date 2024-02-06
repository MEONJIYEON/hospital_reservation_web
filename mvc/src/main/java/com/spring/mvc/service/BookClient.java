package com.spring.mvc.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.mvc.common.JDBCUtil;
import com.spring.mvc.impl.BookDO;

public class BookClient {

	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("bookSetting.xml");
	
		//BoardService 객체 가져오기 
		BookService bService = (BookService)context.getBean("bookService");

	
		ArrayList<BookDO> bList = bService.resList();
	
		for(BookDO temp: bList)
		{
			System.out.println("-->" + temp.toString());
		}
	
		
		//하나의 board 데이터 가져오기 	
		BookDO bdo = new BookDO();
		bdo.setSeq(1);
		bdo = bService.resOne(bdo);
		System.out.println("-->" + bdo.toString());
	}
}
