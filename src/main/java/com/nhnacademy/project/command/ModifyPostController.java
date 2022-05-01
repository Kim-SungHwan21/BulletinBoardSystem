package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.ConcretePost;
import com.nhnacademy.project.repository.Post;
import com.nhnacademy.project.repository.PostRepository;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyPostController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PostRepository postRepository =
            (PostRepository) request.getServletContext().getAttribute("postDataLoad");

        long id = postRepository.getPosts().size()+1;
        String writerUserId = (String) request.getSession().getAttribute("writerUserId");
        String title = request.getParameter("title");
        LocalDateTime writeTime = LocalDateTime.now();
        int viewCount = Integer.parseInt(request.getParameter("viewCount"));
        String content = request.getParameter("content");

        Post post = new ConcretePost(id, writerUserId, title, writeTime, viewCount, content);

        postRepository.modify(post);
        request.getServletContext().setAttribute("postDataload", postRepository);

        return "/postPage.jsp";
    }
}
