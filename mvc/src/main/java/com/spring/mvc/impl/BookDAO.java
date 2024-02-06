package com.spring.mvc.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.spring.mvc.common.JDBCUtil;


@Repository("BookDAO") 
public class BookDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	//DO로 넘어오는 데이터를 받아서 데이터베이스에 저장
	public void resForm(BookDO bdo) {
		System.out.println("-- resForm()  처리 --");
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "insert into book (date, time, sym, name, registerNum, num, email) values"
			 		+ "(?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, bdo.getDate());  
			pstmt.setString(2, bdo.getTime()); 
			pstmt.setString(3, bdo.getSym()); 
			pstmt.setString(4, bdo.getName());  
			pstmt.setString(5, bdo.getRegisterNum()); 
			pstmt.setString(6, bdo.getNum());
			pstmt.setString(7, bdo.getEmail());
			
			//sql문 실행
			pstmt.executeUpdate();
			JDBCUtil.close(rs, pstmt, conn);
			
			System.out.println("-- 데이터베이스 처리 완료(resForm) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//글 조회 
	public BookDO resOne(BookDO bdo) {
		System.out.println("-- resOne() 처리 -- ");
		BookDO temp = new BookDO();
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "select * from book where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdo.getSeq());
			//sql문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {				
				temp.setSeq(rs.getInt(1)); //seq
				temp.setDate(rs.getString(2));
				temp.setTime(rs.getString(3));
				temp.setSym(rs.getString(4));
				temp.setName(rs.getString(5));
				temp.setRegisterNum(rs.getString(6));
				temp.setNum(rs.getString(7));
				temp.setEmail(rs.getString(8));
			}
			JDBCUtil.close(rs, pstmt, conn);
			System.out.println("-- 데이터베이스 처리 완료(resOne()) -- ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	//글 전체 가져오기
	public ArrayList<BookDO> resList(){
		System.out.println("-- resList() 처리 -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "select * from book";
			pstmt = conn.prepareStatement(sql);
			//sql문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDO bdo = new BookDO();
				
				bdo.setSeq(rs.getInt(1));
				bdo.setDate(rs.getString(2));
				bdo.setTime(rs.getString(3));
				bdo.setSym(rs.getString(4));
				bdo.setName(rs.getString(5));
				bdo.setRegisterNum(rs.getString(6));
				bdo.setNum(rs.getString(7));
				bdo.setEmail(rs.getString(8));		
				
				bList.add(bdo);
			}			
			JDBCUtil.close(rs, pstmt, conn);
			System.out.println("-- 데이터베이스 처리 완료(resList()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
	public ArrayList<BookDO> resSortProc(){
		System.out.println("-- resSortProc() 처리 -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "select * from book order by date";
			pstmt = conn.prepareStatement(sql);
			//sql문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDO bdo = new BookDO();
				
				bdo.setSeq(rs.getInt(1));
				bdo.setDate(rs.getString(2));
				bdo.setTime(rs.getString(3));
				bdo.setSym(rs.getString(4));
				bdo.setName(rs.getString(5));
				bdo.setRegisterNum(rs.getString(6));
				bdo.setNum(rs.getString(7));
				bdo.setEmail(rs.getString(8));		
				
				bList.add(bdo);
			}			
			JDBCUtil.close(rs, pstmt, conn);
			System.out.println("-- 데이터베이스 처리 완료(resSortProc()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
	//내림차순
	public ArrayList<BookDO> resSortDescProc(){
		System.out.println("-- resSortDescProc() 처리 -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "select * from book order by date desc";
			pstmt = conn.prepareStatement(sql);
			//sql문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDO bdo = new BookDO();
				
				bdo.setSeq(rs.getInt(1));
				bdo.setDate(rs.getString(2));
				bdo.setTime(rs.getString(3));
				bdo.setSym(rs.getString(4));
				bdo.setName(rs.getString(5));
				bdo.setRegisterNum(rs.getString(6));
				bdo.setNum(rs.getString(7));
				bdo.setEmail(rs.getString(8));		
				
				bList.add(bdo);
			}			
			JDBCUtil.close(rs, pstmt, conn);
			System.out.println("-- 데이터베이스 처리 완료(resSortDescProc()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
	
	//글 삭제 
	public void resDelete(BookDO bdo) {
		System.out.println("-- resDelete()  처리 --");
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "delete from book where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdo.getSeq()); //글 번호
			//sql문 실행
			pstmt.executeUpdate();
			JDBCUtil.close(rs, pstmt, conn);
			
			System.out.println("-- 데이터베이스 처리 완료(resDelete()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	//글 수정하기 
	public void resModify(BookDO bdo) {		
		System.out.println("-- resModify()  처리 --");
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "update book set date=?, time=?, sym=?, name=?, registerNum=?,num=?,email=? where seq=?";
			pstmt = conn.prepareStatement(sql);	
			
			pstmt.setString(1, bdo.getDate());  //글 제목
			pstmt.setString(2, bdo.getTime()); //글 내용
			pstmt.setString(3, bdo.getSym());
			pstmt.setString(4, bdo.getName());
			pstmt.setString(5, bdo.getRegisterNum());
			pstmt.setString(6, bdo.getNum());
			pstmt.setString(7, bdo.getEmail());
			pstmt.setInt(8, bdo.getSeq()); //글 번호 
			
			//sql문 실행
			pstmt.executeUpdate();
			JDBCUtil.close(rs, pstmt, conn);
			
			System.out.println("-- 데이터베이스 처리 완료(resModify()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	//검색하기
	public ArrayList<BookDO> resSearchList(String searchCon, String searchKey){
		System.out.println("-- resSearchList() 처리 -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//데이터베이스 연결
			conn = JDBCUtil.getConnection();			
			//sql문 완성
			String sql = "";
			if(searchCon.equals("name")) {
				sql = "select * from book where name=? order by seq desc";
			}
			else if(searchCon.equals("date")) {
				sql = "select * from book where date=? order by seq desc";
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchKey);
			//sql문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDO bdo = new BookDO();
				bdo.setSeq(rs.getInt(1));
				bdo.setDate(rs.getString(2));
				bdo.setTime(rs.getString(3));
				bdo.setSym(rs.getString(4));
				bdo.setName(rs.getString(5));
				bdo.setRegisterNum(rs.getString(6));
				bdo.setNum(rs.getString(7));
				bdo.setEmail(rs.getString(8));		
				
				bList.add(bdo);
			}			
			JDBCUtil.close(rs, pstmt, conn);
			System.out.println("-- 데이터베이스 처리 완료(resSearchList()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
}
