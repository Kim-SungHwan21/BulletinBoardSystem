package com.nhnacademy.project;

import com.nhnacademy.project.command.AddUserController;
import com.nhnacademy.project.command.AdminLoginProcessingController;
import com.nhnacademy.project.command.AdminPageController;
import com.nhnacademy.project.command.Command;
import com.nhnacademy.project.command.DeleteController;
import com.nhnacademy.project.command.FileUploadController;
import com.nhnacademy.project.command.InfoController;
import com.nhnacademy.project.command.InfoPostController;
import com.nhnacademy.project.command.LangController;
import com.nhnacademy.project.command.ListController;
import com.nhnacademy.project.command.LoginFormController;
import com.nhnacademy.project.command.LoginProcessingController;
import com.nhnacademy.project.command.LogoutController;
import com.nhnacademy.project.command.ModifyPostController;
import com.nhnacademy.project.command.PostPageController;
import com.nhnacademy.project.command.RegisterPostController;
import com.nhnacademy.project.command.RemovePostController;
import com.nhnacademy.project.command.ResultInfoController;
import com.nhnacademy.project.command.ResultInfoPostController;
import com.nhnacademy.project.command.UpdateController;
import com.nhnacademy.project.repository.Admin;
import com.nhnacademy.project.repository.PostRepository;
import com.nhnacademy.project.repository.UserRepository;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebServlet(name = "frontServlet", urlPatterns = "*.do")
public class FrontServlet extends HttpServlet {
    private static final String REDIRECT_PREFIX = "redirect:";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        try {
            Command command  = resolveCommand(req.getServletPath(), req.getMethod());
            String view = command.execute(req, resp);

            if (view.startsWith(REDIRECT_PREFIX)) {
                resp.sendRedirect(view.substring(REDIRECT_PREFIX.length()));
            } else {
                RequestDispatcher rd = req.getRequestDispatcher(view);
                rd.include(req, resp);
            }
        } catch (Exception ex) {
            log.error("", ex);

            req.setAttribute("exception", ex);

            RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
            rd.forward(req, resp);
        }
    }

    private Command resolveCommand(String servletPath, String method) {
        Command command = null;
        UserRepository repo = (UserRepository) getServletContext().getAttribute("userDataLoad");
        Admin admin = (Admin) getServletContext().getAttribute("admin");
        PostRepository postRepo = (PostRepository) getServletContext().getAttribute("postDataLoad");

        if ("/login.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new LoginFormController();
        } else if ("/login.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new AdminLoginProcessingController(admin);
        }
        else if ("/login.do".equals(servletPath) && "POST".equalsIgnoreCase(method)){
            command = new LoginProcessingController(repo);
        }
        else if ("/logout.do".equals(servletPath)) {
            command = new LogoutController();
        } else if ("/change-lang.do".equals(servletPath)) {
            command = new LangController();
        } else if ("/adminPage.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new AdminPageController();
        } else if ("/list.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new ListController();
        } else if ("/info.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new InfoController();
        } else if ("/update.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new UpdateController();
        } else if ("/delete.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new DeleteController();
        } else if ("/addUser.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new AddUserController();
        } else if ("/upload.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new FileUploadController();
        } else if ("/resultInfo.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new ResultInfoController();
        } else if ("/infoPost.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new InfoPostController();
        } else if ("/registerPost.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new RegisterPostController();
        } else if ("/removePost.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new RemovePostController();
        } else if ("/modifyPost.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new ModifyPostController();
        } else if ("/postPage.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new PostPageController();
        } else if ("/resultInfoPost.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new ResultInfoPostController();
        }

        return command;
    }

}
