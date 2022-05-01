package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.UserRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultInfoController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        UserRepository userRepository =
            (UserRepository) request.getServletContext().getAttribute("userDataLoad");

        HttpSession session = request.getSession(false);

        String id = request.getParameter("id");


        session.setAttribute("userInfo", userRepository.getUser(id));
        return "/resultInfo.jsp";
    }
}
