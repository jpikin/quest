package org.example.quest.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.quest.user.Human;
import org.example.quest.user.Player;

@WebServlet(name = "startGame", value = "/start-game")
public class StartGame extends HttpServlet {
    private String message;

    public void init() {
        Player human = new Human("TestName");
        message = human.getName();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Space station</h1>");
        out.println("<h2>" + message + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}