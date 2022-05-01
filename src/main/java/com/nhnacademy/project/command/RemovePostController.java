package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.PostRepository;
import com.nhnacademy.project.repository.UserRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemovePostController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PostRepository postRepository =
            (PostRepository) request.getServletContext().getAttribute("postDataLoad");

        long id = Long.parseLong(request.getParameter("id"));

        postRepository.remove(id);

        request.getServletContext().setAttribute("postDataLoad", postRepository);

        return "/removePost.jsp";
    }
}
