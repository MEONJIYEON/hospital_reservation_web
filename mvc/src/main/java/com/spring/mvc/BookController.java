package com.spring.mvc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.impl.BookDAO;
import com.spring.mvc.impl.BookDAOSpring;
import com.spring.mvc.impl.BookDO;

@Controller
public class BookController {
	
	@Autowired
	BookDAOSpring bdaoSpring;

	@RequestMapping(value = "/index.do")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/reservation.do")
	public String reservation() {
		return "reservation";
	}
	
	@RequestMapping(value = "/resForm.do")
	public String resForm() {
		return "resForm";
	}
	
	@RequestMapping(value = "/resSearch.do")
	public String resSearch() {
		return "resSearch";
	}
	
	@RequestMapping(value="/resProc.do", method=RequestMethod.POST)
	public String resProc(BookDO bdo) {
		System.out.println("resProcController() --> ");
		
		System.out.println("date : " + bdo.getDate() + 
						   " time : " + bdo.getTime() +
						   " sym : " + bdo.getSym() +
						   " name : " + bdo.getName() +
						   " registerNum : " + bdo.getRegisterNum() +
						   " num : " + bdo.getNum() +
						   " email : " + bdo.getEmail());
		
		//bdao.insertBoard(bdo);
		bdaoSpring.resForm(bdo);
			
		return "redirect:resList.do";
		
	}
	
	@RequestMapping(value="/resList.do")
	public String resList(BookDO bdo, BookDAO bdao, Model model) {
		System.out.println("resListController(Ano) --> ");
		
		ArrayList<BookDO> bList = bdaoSpring.resList();		
		model.addAttribute("bList", bList);	
		
		return "resList";
	}
	
	@RequestMapping(value="/resSortProc.do")
	public String resSortProc(BookDO bdo, BookDAO bdao, Model model) {
		System.out.println("resSortProcController(Ano) --> ");
		
		ArrayList<BookDO> bList = bdaoSpring.resSortProc();		
		model.addAttribute("bList", bList);	
		
		return "resSortProc";
	}
	
	@RequestMapping(value="/resSortDescProc.do")
	public String resSortDescProc(BookDO bdo, BookDAO bdao, Model model) {
		System.out.println("resSortDescProcController(Ano) --> ");
		
		ArrayList<BookDO> bList = bdaoSpring.resSortDescProc();		
		model.addAttribute("bList", bList);	
		
		return "resSortDescProc";
	}
	
	@RequestMapping(value="/resDelete.do")
	public String resDelete(BookDO bdo, BookDAO bdao, Model model) {
		System.out.println("resDeleteController(Ano) --> ");
		
		bdaoSpring.resDelete(bdo);
		//mav.setViewName("redirect:getBoardList.do");
		
		return "redirect:resList.do";
	}
	
	
	//한개만가져오기
	@RequestMapping(value="/resOne.do")
	public String resOne(BookDO bdo, Model model) {		
		System.out.println("[spring] resOneController(Ano) --> ");
		
		System.out.println("seq : " + bdo.getSeq());		
		BookDO book = bdaoSpring.resOne(bdo);	
		model.addAttribute("book", book);		
		
		return "resOne";
	}
	
	@RequestMapping(value="/resModify.do")
	public String resModify(BookDO bdo, BookDAO bdao, Model model) {
		System.out.println("resModifyController(Ano) --> ");

		BookDO book = bdao.resOne(bdo);

//		mav.addObject("board", board);
//		mav.setViewName("modifyBoardView");
		model.addAttribute("book", book);
		
		return "resModify";
	}
	
	@RequestMapping(value="/resModifyProc.do")
	public String resModifyProc(BookDO bdo, BookDAO bdao, Model model) {
		System.out.println("resModifyProcController(Ano) --> ");

		bdaoSpring.resModify(bdo);
		//mav.setViewName("redirect:getBoardList.do");
				
		return "redirect:resList.do";
	}
	
	@RequestMapping(value="/resSearchList.do")
	public String resSearchList(@RequestParam(value="searchCon") String searchCon,
			@RequestParam(value="searchKey") String searchKey,
			BookDAO bdao, Model model) {
		System.out.println("searchCon :" + searchCon);
		System.out.println("searchKey :" + searchKey);
		
		ArrayList<BookDO> bList = bdaoSpring.resSearchList(searchCon, searchKey);
		model.addAttribute("bList", bList);
		return "resSearchList";
		
	}
}
