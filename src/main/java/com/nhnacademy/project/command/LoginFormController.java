package com.nhnacademy.project.command;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFormController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        if (Objects.isNull(session) || Objects.isNull(session.getAttribute("id"))) {
            return "/loginForm.jsp";
        } else {
            return"/loginSuccess.jsp";
        }
    }

}
