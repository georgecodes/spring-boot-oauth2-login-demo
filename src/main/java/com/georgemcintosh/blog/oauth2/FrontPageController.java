package com.georgemcintosh.blog.oauth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class FrontPageController {

    @RequestMapping("/")
    public ModelAndView index(@AuthenticationPrincipal OAuth2User principal) {
        if(principal == null) {
            return new ModelAndView("index_loggedout.html");
        }
        String name = principal.getAttribute("name");
        ModelAndView mav = new ModelAndView("index_loggedin.html", Map.of("name", name));
        return mav;
    }

}
