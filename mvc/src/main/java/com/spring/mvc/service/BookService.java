package com.spring.mvc.service;

import java.util.ArrayList;

import com.spring.mvc.impl.BookDO;


public interface BookService {
	
	//글 목록(전체 목록)
	ArrayList<BookDO> resList();	
	//글 오름차순
	ArrayList<BookDO> resSortProc();
	//글 내림차순
	ArrayList<BookDO> resSortDescProc();
	//글 조회
	BookDO resOne(BookDO bdo);	
	//글 등록 
	void resForm(BookDO bdo);	
	//글 삭제
	void resDelete(BookDO bdo);
	//글 수정
	void resModify(BookDO bdo);
}
