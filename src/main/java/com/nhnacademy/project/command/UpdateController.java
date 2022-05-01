package com.nhnacademy.project.command;

import com.nhnacademy.project.repository.User;
import com.nhnacademy.project.repository.UserInfo;
import com.nhnacademy.project.repository.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        UserRepository userRepository =
            (UserRepository) request.getServletContext().getAttribute("userDataLoad");

        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String name = request.getParameter("name");
        String profile = request.getParameter("profile");

        User user = new UserInfo(id, pwd, name, profile);

        userRepository.modify((UserInfo) user);
        request.getServletContext().setAttribute("userDataload", userRepository);


        return "/update.jsp";
    }
}
