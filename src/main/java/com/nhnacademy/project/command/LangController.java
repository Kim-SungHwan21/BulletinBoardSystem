package com.nhnacademy.project.command;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LangController implements Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Optional.ofNullable(request.getParameter("lang"))
            .ifPresent(lang -> request.getServletContext().setAttribute("appLang", lang));

        return "redirect:/";
    }
}

//Optional.ofNullable(Arrays.stream(request.getCookies()).filter(cookie -> cookie.getValue(lang)).getParameter("lang"))
//    .ifPresent(lang -> request.getServletContext().setAttribute("appLang", lang));
//<% request.getCookies()%>
