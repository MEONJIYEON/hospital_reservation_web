package com.spring.mvc.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bdao;
	
	@Override
	public ArrayList<BookDO> resList() {
		return bdao.resList();
	}
	@Override
	public ArrayList<BookDO> resSortProc() {
		return bdao.resSortProc();
	}
	@Override
	public ArrayList<BookDO> resSortDescProc() {
		return bdao.resSortProc();
	}
	@Override
	public BookDO resOne(BookDO bdo) {
		// TODO Auto-generated method stub
		return bdao.resOne(bdo);
	}
	
	@Override
	public void resForm(BookDO bdo) {	 
		bdao.resForm(bdo);
	}

	@Override
	public void resDelete(BookDO bdo) {		
		bdao.resDelete(bdo);
	}
	
	@Override
	public void resModify(BookDO bdo) {
		bdao.resModify(bdo);
	}
	
}
