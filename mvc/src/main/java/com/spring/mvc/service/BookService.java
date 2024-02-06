package com.spring.mvc.service;

import java.util.ArrayList;

import com.spring.mvc.impl.BookDO;


public interface BookService {
	
	//�� ���(��ü ���)
	ArrayList<BookDO> resList();	
	//�� ��������
	ArrayList<BookDO> resSortProc();
	//�� ��������
	ArrayList<BookDO> resSortDescProc();
	//�� ��ȸ
	BookDO resOne(BookDO bdo);	
	//�� ��� 
	void resForm(BookDO bdo);	
	//�� ����
	void resDelete(BookDO bdo);
	//�� ����
	void resModify(BookDO bdo);
}
