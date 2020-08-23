package com.ashwin.java;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String TAG = MyServlet.class.getName(); 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        System.out.println(TAG + ": constructor");
    }

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println(TAG + ": init");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println(TAG + ": init (" + config + ")");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println(TAG + ": service (" + arg0 + ", " + arg1 + ")");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println(TAG + ": destroy");
	}
}
