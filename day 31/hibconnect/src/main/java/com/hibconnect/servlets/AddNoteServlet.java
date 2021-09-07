package com.hibconnect.servlets;

import java.lang.invoke.ClassSpecializer.Factory;

import javax.servlet.http.HttpServlet;

public class AddNoteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Note note = new Note(title, content, new Date());
		}
	}
}
