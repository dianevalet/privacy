/**
 * 
 */
package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoAdult;
import services.ServiceAdult;

/**
 * @author DIANA
 *
 */
@WebServlet(name="masseSalariale",urlPatterns={"/MasseSalariale"})
public class MasseSalariale extends HttpServlet{

	
	

		public MasseSalariale() {
			// TODO Auto-generated constructor stub
		}
		
		public void doGet(HttpServletRequest request, HttpServletResponse response)
				 throws ServletException, IOException 
				
			{
				DaoAdult dao = new DaoAdult();
				PrintWriter out = response.getWriter();
				double resultat;
				resultat= dao.MasseSalariale();
				
				if(resultat==0){
					out.println("Pas de masse salariale");
				}else{
					request.setAttribute("resultat", resultat);
					this.getServletContext().getRequestDispatcher("/MasseSalariale.jsp").forward(request, response);
					
					
				}
				
				
			         
			}
}
