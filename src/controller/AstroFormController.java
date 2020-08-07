
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import service.AstroCalculator;

@WebServlet(urlPatterns = {"/entervalue"})
public class AstroFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/entervalues.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String date=request.getParameter("dob1");
		String month=request.getParameter("dob2");
		String year=request.getParameter("dob3");
		String dob = date+"-"+month+"-"+year;	
		
		User u=new User(name,date,month,gender);
		AstroCalculator ac=new AstroCalculator();
		String Astrosign=ac.findSign(u);
		System.out.println(Astrosign);
		
		if(Astrosign.equals("Aquarius")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/aquarius.svg'>");
			rd.forward(request, response);
		}
		
		if(Astrosign.equals("Aries")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/aries.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Cancer")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/cancer.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Capricorn")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/capricorn.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Gemini")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/gemini.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Leo")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/leo.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Libra")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/libra.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Pisces")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/pisces.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Sagittarius")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/sagittaruis.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Scorpio")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/scorpio.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Taurus")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/taurus.svg'>");
			rd.forward(request, response);
		}
		if(Astrosign.equals("Virgo")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/virgo.svg'>");
			rd.forward(request, response);
		}
	}
}
