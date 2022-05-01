package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.Admin;
import com.nhnacademy.project.repository.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLoginProcessingController implements Command {
    private Admin admin;
    private String id;
    private String pwd;
    private String name;

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public AdminLoginProcessingController(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        if ((id != null && pwd != null && id.equals(admin.getId())
            && pwd.equals(admin.getPwd()))) {
            HttpSession session = request.getSession();
            session.setAttribute("id", id);

            return "/adminPage.jsp";
        } else {
            return "/loginForm.jsp";
        }
    }
}
