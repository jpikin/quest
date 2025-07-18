package org.example.quest.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.quest.game.Game;
import org.example.quest.user.Human;
import org.example.quest.user.Player;

@WebServlet(name = "startGame", value = "/start-game")
public class StartGame extends HttpServlet {
    private String message;

    public void init() {
        Player player = new Human("TestName");
        Game game = player.getGame();
        message = game.startGame();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String content = "<html><head>" +
                "<link rel=\"stylesheet\" href=\"" + request.getContextPath() + "/css/styles.css\">" +
                "</head><body>" +
                "<div class=\"wrapper\">" +
                "<h1>Space station</h1>" +
                "<h2>" + message + "</h2>" +
                "</div>" +
                "</body></html>";

        response.setContentType("text/html");
        response.getWriter().write(content);
    }

    public void destroy() {
    }
}