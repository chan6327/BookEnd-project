package user_book;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/userBook.do")
public class UserBookServlet extends HttpServlet{
	
	RequestDispatcher rd;
	String bookBase = "user/book/user_book_";
	String memberBase = "user/member/user_member_";
	
	String job="";
	String url = "";
	
	public UserBookServlet() {}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		if(req.getParameter("job") != null) {
			job = req.getParameter("job");
		}
		switch(job) {
		case "category":		//카테고리
			Category(req,resp);
			break;
		case "search":			//검색
			Search(req,resp);
			break;
		case "details":			//상세
			Details(req,resp);
			break;
		case "login":			//로그인
			Login(req,resp);
			break;
		case "cart":			//장바구니
			Cart(req,resp);
			break;
		default:				//메인
			Index(req,resp);
			break;
		}
	}
	//카테고리 페이지
	public void Category(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		url = bookBase + "category.jsp";
		rd = req.getRequestDispatcher(url);
		rd.forward(req,resp);
	}
	//검색 페이지
	public void Search(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		url = bookBase + "search.jsp";
		
		
		String findStr = req.getParameter("findStr");
		System.out.println("job : " + req.getParameter("job"));
		System.out.println("findStr : " + findStr);
		
		//req.setAttribute("findStr", findStr);
		
		rd = req.getRequestDispatcher(url);
		rd.forward(req,resp);
	}
	//상세 페이지
	public void Details(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		url = bookBase + "details.jsp";
		rd = req.getRequestDispatcher(url);
		rd.forward(req,resp);
	}
	//로그인
	public void Login(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		url = memberBase + "login.jsp";
		rd = req.getRequestDispatcher(url);
		rd.forward(req,resp);
	}
	//장바구니
	public void Cart(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		url = memberBase + "cart.jsp";
		rd = req.getRequestDispatcher(url);
		rd.forward(req,resp);
	}
	//메인 페이지
	public void Index(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		url = "index_main.jsp";
		rd = req.getRequestDispatcher(url);
		rd.forward(req,resp);
	}

}
