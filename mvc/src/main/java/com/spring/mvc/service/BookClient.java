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
	
		//BoardService ��ü �������� 
		BookService bService = (BookService)context.getBean("bookService");

	
		ArrayList<BookDO> bList = bService.resList();
	
		for(BookDO temp: bList)
		{
			System.out.println("-->" + temp.toString());
		}
	
		
		//�ϳ��� board ������ �������� 	
		BookDO bdo = new BookDO();
		bdo.setSeq(1);
		bdo = bService.resOne(bdo);
		System.out.println("-->" + bdo.toString());
	}
}
