package com.adrianjayson.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by adrianjayson on 5/4/17.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("show-form")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("process-form")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("shout")
    public String shoutForm(HttpServletRequest request, Model model) {
        if (request.getMethod() == "POST") {
            String message = request.getParameter("message");
            message = message.toUpperCase();

            model.addAttribute("message", message);

            return "shout";
        }

        return "shout-form";
    }

    @RequestMapping("process-form2")
    public String processForm2(
            @RequestParam("message") String message, Model model) {
        message = message.toUpperCase();

        model.addAttribute("message", message);

        return "shout";
    }
}
