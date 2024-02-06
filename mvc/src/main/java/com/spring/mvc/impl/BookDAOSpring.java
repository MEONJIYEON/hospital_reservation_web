package com.spring.mvc.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.mvc.common.JDBCUtil;


@Repository("bookDAOSpring")
public class BookDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public ArrayList<BookDO> resList(){
		System.out.println("-- [spring jdbc] resList() 처리 -- ");
		String sql = "select * from book";
		
		return (ArrayList<BookDO>) jdbcTemplate.query(sql, new BoardRowMapper());
	}
	
	//글 오름차순
	public ArrayList<BookDO> resSortProc() {
		System.out.println("-- [spring jdbc] resSortProc()  처리 --");
		String sql ="select * from book order by date";
		
		return (ArrayList<BookDO>) jdbcTemplate.query(sql, new BoardRowMapper());
	}
	
	//글 내림차순
	public ArrayList<BookDO> resSortDescProc() {
		System.out.println("-- [spring jdbc] resSortProc()  처리 --");
		String sql ="select * from book order by date desc";
		
		return (ArrayList<BookDO>) jdbcTemplate.query(sql, new BoardRowMapper());
	}	
	//글 조회 
	public BookDO resOne(BookDO bdo) {
		System.out.println("-- [spring jdbc] resOne() 처리 -- ");
			
		//sql문 완성
		String sql = "select * from book where seq=?";
		Object[] args = {bdo.getSeq()};
			
		return jdbcTemplate.queryForObject(sql, args, new BoardRowMapper());
		}
	
	//DO로 넘어오는  데이터를 받아서 데이터베이스에 저장
	public void resForm(BookDO bdo) {
		System.out.println("-- [spring jdbc] resForm()  처리 --");
		String sql = "insert into book (date, time, sym, name, registerNum, num, email) values"
		 		+ "(?, ?, ?, ?, ?, ?, ?)";
		//jdbcTemplate.update(sql,bdo.getTitle(), bdo.getWriter(), bdo.getContent());
		Object[] args = {bdo.getDate(), bdo.getTime(), bdo.getSym(), bdo.getName(), 
				bdo.getRegisterNum(), bdo.getNum(), bdo.getEmail()};
		jdbcTemplate.update(sql, args);
	}
	
	//글 삭제 
	public void resDelete(BookDO bdo) {
		System.out.println("-- [spring jdbc] resDelete()  처리 --");
	
		String sql = "delete from book where seq=?";
		jdbcTemplate.update(sql, bdo.getSeq());
	}
	
	

	//글 수정하기 
	public void resModify(BookDO bdo) {		
		System.out.println("-- [spring jdbc] resModify()  처리 --");
			
		String sql = "update book set date=?, time=?, sym=?, name=?, registerNum=?,num=?,email=? where seq=?";
	    
		jdbcTemplate.update(sql, bdo.getDate(),  bdo.getTime(), bdo.getSym(),bdo.getName(),bdo.getRegisterNum(),bdo.getNum(),bdo.getEmail(), bdo.getSeq());
	}	
	
	//글 검색
	public ArrayList<BookDO> resSearchList(String searchCon, String searchKey) {
		System.out.println("-- [spring jdbc] resSearchList() 처리");
		
		String sql ="";
		if(searchCon.equals("name"))
			sql = "select * from book where name =? order by seq desc";
		else if(searchCon.equals("date"))
			sql = "select * from book where date=? order by seq desc";
		else {
			System.out.println("resSearchList 오류");
			return null;
		}
		
		Object[] args = {searchKey};
		return (ArrayList<BookDO>) jdbcTemplate.query(sql, args, new BoardRowMapper());
	}
	
	//queryForObject() 처리를 위한 클래스 선언/정의
	class BoardRowMapper implements RowMapper<BookDO> {

		@Override
		public BookDO mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			System.out.println(" -- [spring jdbc] mapRow() -->");
			
			BookDO book = new BookDO();
						
			book.setSeq(rs.getInt(1));
			book.setDate(rs.getString(2));
			book.setTime(rs.getString(3));
			book.setSym(rs.getString(4));
			book.setName(rs.getString(5));
			book.setRegisterNum(rs.getString(6));
			book.setNum(rs.getString(7));
			book.setEmail(rs.getString(8));		
			
			return book;
		}
		
		
	}

}
