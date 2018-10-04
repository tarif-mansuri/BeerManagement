package com.example.web;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exampl.model.BeerExpert;

public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public BeerSelect() {
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Beer selection advice");
		System.out.println("Beer selection advice");
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> list = be.getBrands(c);
		Iterator<String> it =  list.iterator();
		while(it.hasNext()){
			System.out.print("<br>Try "+it.next());
		}
	}

}
