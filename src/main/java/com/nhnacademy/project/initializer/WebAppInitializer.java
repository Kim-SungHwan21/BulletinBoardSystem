package com.nhnacademy.project.initializer;

import com.nhnacademy.project.repository.Admin;
import com.nhnacademy.project.repository.PostDataLoad;
import com.nhnacademy.project.repository.PostRepository;
import com.nhnacademy.project.repository.UserDataLoad;
import com.nhnacademy.project.repository.UserRepository;
import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes({
    javax.servlet.http.HttpServlet.class,
    javax.servlet.Filter.class,
    javax.servlet.ServletContextListener.class,
    javax.servlet.http.HttpSessionListener.class
})
public class WebAppInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        ctx.setAttribute("userDataLoad", loadUserRepository());
        ctx.setAttribute("admin", registerAdmin());
        ctx.setAttribute("postDataLoad", loadPostRepository());
    }

    private UserRepository loadUserRepository() {
        UserRepository userRepository = new UserDataLoad();
        return userRepository;
    }

    private Admin registerAdmin() {
        Admin admin = new Admin("admin", "12345", "관리자");
        return admin;
    }

    private PostRepository loadPostRepository() {
        PostRepository postRepository = new PostDataLoad();
        return postRepository;
    }
}
