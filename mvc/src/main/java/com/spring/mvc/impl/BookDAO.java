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
	
	
	//DO�� �Ѿ���� �����͸� �޾Ƽ� �����ͺ��̽��� ����
	public void resForm(BookDO bdo) {
		System.out.println("-- resForm()  ó�� --");
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
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
			
			//sql�� ����
			pstmt.executeUpdate();
			JDBCUtil.close(rs, pstmt, conn);
			
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resForm) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//�� ��ȸ 
	public BookDO resOne(BookDO bdo) {
		System.out.println("-- resOne() ó�� -- ");
		BookDO temp = new BookDO();
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "select * from book where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdo.getSeq());
			//sql�� ����
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
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resOne()) -- ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	//�� ��ü ��������
	public ArrayList<BookDO> resList(){
		System.out.println("-- resList() ó�� -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "select * from book";
			pstmt = conn.prepareStatement(sql);
			//sql�� ����
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
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resList()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
	public ArrayList<BookDO> resSortProc(){
		System.out.println("-- resSortProc() ó�� -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "select * from book order by date";
			pstmt = conn.prepareStatement(sql);
			//sql�� ����
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
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resSortProc()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
	//��������
	public ArrayList<BookDO> resSortDescProc(){
		System.out.println("-- resSortDescProc() ó�� -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "select * from book order by date desc";
			pstmt = conn.prepareStatement(sql);
			//sql�� ����
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
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resSortDescProc()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
	
	//�� ���� 
	public void resDelete(BookDO bdo) {
		System.out.println("-- resDelete()  ó�� --");
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "delete from book where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdo.getSeq()); //�� ��ȣ
			//sql�� ����
			pstmt.executeUpdate();
			JDBCUtil.close(rs, pstmt, conn);
			
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resDelete()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	//�� �����ϱ� 
	public void resModify(BookDO bdo) {		
		System.out.println("-- resModify()  ó�� --");
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "update book set date=?, time=?, sym=?, name=?, registerNum=?,num=?,email=? where seq=?";
			pstmt = conn.prepareStatement(sql);	
			
			pstmt.setString(1, bdo.getDate());  //�� ����
			pstmt.setString(2, bdo.getTime()); //�� ����
			pstmt.setString(3, bdo.getSym());
			pstmt.setString(4, bdo.getName());
			pstmt.setString(5, bdo.getRegisterNum());
			pstmt.setString(6, bdo.getNum());
			pstmt.setString(7, bdo.getEmail());
			pstmt.setInt(8, bdo.getSeq()); //�� ��ȣ 
			
			//sql�� ����
			pstmt.executeUpdate();
			JDBCUtil.close(rs, pstmt, conn);
			
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resModify()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	//�˻��ϱ�
	public ArrayList<BookDO> resSearchList(String searchCon, String searchKey){
		System.out.println("-- resSearchList() ó�� -- ");
		ArrayList<BookDO> bList = new ArrayList<BookDO>();
		try {
			//�����ͺ��̽� ����
			conn = JDBCUtil.getConnection();			
			//sql�� �ϼ�
			String sql = "";
			if(searchCon.equals("name")) {
				sql = "select * from book where name=? order by seq desc";
			}
			else if(searchCon.equals("date")) {
				sql = "select * from book where date=? order by seq desc";
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchKey);
			//sql�� ����
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
			System.out.println("-- �����ͺ��̽� ó�� �Ϸ�(resSearchList()) -- ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bList;
	}
	
}
