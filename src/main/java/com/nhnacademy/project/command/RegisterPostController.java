package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.ConcretePost;
import com.nhnacademy.project.repository.Post;
import com.nhnacademy.project.repository.PostRepository;
import com.nhnacademy.project.repository.User;
import com.nhnacademy.project.repository.UserInfo;
import com.nhnacademy.project.repository.UserRepository;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterPostController implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PostRepository postRepository =
            (PostRepository) request.getServletContext().getAttribute("postDataLoad");

        long id = Long.parseLong(request.getParameter("id"));
        String writerUserId = request.getParameter("writerUserId");
        String title = request.getParameter("title");
        LocalDateTime writeTime = LocalDateTime.parse(request.getParameter("writeTime"));
        int viewCount = Integer.parseInt(request.getParameter("viewCount"));
        String content = request.getParameter("content");

        Post post = new ConcretePost(id, writerUserId, title, writeTime, viewCount, content);

        postRepository.register(post);
        request.getServletContext().setAttribute("postDataload", postRepository);

        return "/registerPost.jsp";
    }
}
