package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.User;
import com.nhnacademy.project.repository.UserInfo;
import com.nhnacademy.project.repository.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        UserRepository userRepository =
            (UserRepository) request.getServletContext().getAttribute("userDataLoad");

        String id = request.getParameter("id");

        userRepository.remove(id);
        request.getServletContext().setAttribute("userDataload", userRepository);

        return "/delete.jsp";
    }
}
