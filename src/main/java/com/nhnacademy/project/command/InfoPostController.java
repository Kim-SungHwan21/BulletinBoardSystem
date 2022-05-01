package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.PostRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InfoPostController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PostRepository postRepository =
            (PostRepository) request.getServletContext().getAttribute("postDataLoad");

        HttpSession session = request.getSession(false);

        long id = Long.parseLong(request.getParameter("id"));


        session.setAttribute("postInfo", postRepository.getPost(id));

        return "/infoPost.jsp";
    }
}
