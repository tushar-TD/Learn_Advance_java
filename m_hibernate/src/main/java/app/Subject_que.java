package app;



import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Questions;
import entities.Subject;





public class Subject_que {
	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session=sf.openSession();
		

		Subject s1=new Subject(1, "Java", "questions is about java" ,"Who invented JAVA?");
		Transaction tr =session.beginTransaction();
		
		session.save();
		
		tr.commit();
		
		session.close();
		
		sf.close();
		
		
	}
}



<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Calculator</h1>
    <form action="calculator" method="post">
        <label for="num1">Number 1:</label>
        <input type="number" id="num1" name="num1"><br><br>
        
        <label for="num2">Number 2:</label>
        <input type="number" id="num2" name="num2"><br><br>
        
        <input type="submit" value="Add">
        <input type="submit" value="Subtract">
        <input type="submit" value="Divide">
        <input type="submit" value="Multiply">
    </form>
</body>
</html>
Next, create a Servlet called "CalculatorServlet.java" with the following content:

java
Copy code
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = 0;
        
        String action = request.getParameter("submit");
        
        if (action.equals("Add")) {
            result = num1 + num2;
        } else if (action.equals("Subtract")) {
            result = num1 - num2;
        } else if (action.equals("Divide")) {
            result = num1 / num2;
        } else if (action.equals("Multiply")) {
            result = num1 * num2;
        }
        
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}

