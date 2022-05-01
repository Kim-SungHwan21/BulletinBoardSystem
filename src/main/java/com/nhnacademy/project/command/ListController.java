package com.nhnacademy.project.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

//        HttpSession session = request.getSession();
//        Cart list = (Cart) session.getAttribute("cart");
//
//        for(String itemName: items) {
//            Item item = foodStand.getItem(itemName);
//
//            try {
//                item.decreaseAmount();
//            } catch (AmountException ex) {
//                request.setAttribute("exception", ex);
//                throw new RuntimeException(ex);
//            }
//
//            list.put(item.getFood(), 1);
//        }

        return "/list.jsp";
    }
}
