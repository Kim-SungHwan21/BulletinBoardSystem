package com.nhnacademy.project.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminPageController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/adminPage.jsp";
    }
}
