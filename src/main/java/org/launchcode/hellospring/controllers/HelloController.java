package org.launchcode.hellospring.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;


@Controller
@RequestMapping(value = "")
public class HelloController {

//    @RequestMapping(value = "")
//    @ResponseBody
//    public String index() {
//        return "Hello World";
//    }

    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye";
    }

    // GET request
    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {
        String name = request.getParameter("name");
        if (name == null) {
            return "Give me a name!";
        }
        return "Hello " + name;
    }



//    @RequestMapping(value = "users", method = RequestMethod.GET)
//    @ResponseBody
//    static String usersHandler() {
//        ArrayList<String> users = new ArrayList<>(Arrays.asList("Joe", "Mike", "Sally"));
//        String usersString = "";
//        for (String user : users) {
//            usersString += user + " ";
//        }
//        return usersString;
//    }

//    @RequestMapping(value = "users/new", method = RequestMethod.GET)
//    @ResponseBody
//    static String userAddHandler() {
//        return "<html>" +
//                "<body>" +
//                "<form method=\"POST\" action='/users'>" +
//                "<input type=\"text\" name='username' />" +
//                "<input type='submit' value='Add User' />" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

//    @RequestMapping(value = "users", method = RequestMethod.POST)
////    @ResponseBody
//    static String userAddHandler(HttpServletRequest request) {
//        String username = request.getParameter("username");
////        return "Yay! A new user appeared: " + username;
//        return "redirect:/users";
//    }


//
    // POST request

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm() {
        String html = "<form method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='lang'>" +
                "<option value='fr'>French</option>" +
                "<option value='sp'>Spanish</option>" +
                "<option value='ger'>German</option>" +
                "<option value='bos'>Bosnian</option>" +
                "<option value='cz'>Czech</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!' />" +
                "</form>";
        return html;
    }


    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request) {
        String name = request.getParameter("name");
        String lang = request.getParameter("lang");
        String message = Message.createMessage(lang, name);

        return "<h1>" + message + "</h1>";
    }

//    @RequestMapping(value = "hello/{name}")
//    @ResponseBody
//    public String helloUrlSegment(@PathVariable String name) {
//        return "Hello" + name;
//    }





}
