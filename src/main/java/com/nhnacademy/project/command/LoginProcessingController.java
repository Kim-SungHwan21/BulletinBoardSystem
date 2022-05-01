package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.Admin;
import com.nhnacademy.project.repository.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProcessingController implements Command {
    private UserRepository repo;
    private String id;
    private String pwd;
    private String name;



    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public LoginProcessingController(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public LoginProcessingController(UserRepository repo) {
        this.repo = repo;
    }


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
    //    request.getServletContext().getAttribute("admin");

//        if (request.getServletContext().getAttribute("admin").equals(admin.getId())) {
//            if (request.getServletContext().getAttribute("admin").equals(admin.getId())
//                && request.getServletContext().getAttribute("admin").equals(admin.getPwd())) {
//                return "redirect:/login.do";
//            } else {
//                return "/loginForm.jsp";
//            }
//        }
//            if (repo.getUser(id) != null) {
//                if ((repo.getUser(id).getPassword()).equals(pwd)) {
//                    HttpSession session = request.getSession();
//                    session.setAttribute("id", id);
//
//                    return "redirect:/login.do";
//                }
//            }
//            return "/loginForm.jsp";

        if ((id != null && pwd != null && id.equals(repo.getUser(id))
            && pwd.equals(repo.getUser(id).getPassword()))) {
            HttpSession session = request.getSession();
            session.setAttribute("id", id);

            return "redirect:/login.do";
        } else {
            return "/loginForm.jsp";
        }
    }
}
