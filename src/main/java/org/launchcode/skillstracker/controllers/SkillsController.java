package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "submitted")
    public String filledForm(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<h3>" +
                           "<ol>" +
                                "<li>" + first +"</li>" +
                                "<li>" + second +"</li>" +
                                "<li>" + third +"</li>" +
                            "</ol>" +
                        "</h3>" +
                "</body>" +
                "</html>";
    }

    @GetMapping
    public String main() {
        return "<html>" +
                 "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Php</li>" +
                    "</ol>" +
                 "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                  "<body>" +
                     "<form action='submitted' method='post'>" +
                         "<h2>Name:</h2>" +
                         "<input type='text' name='name'>" +
                         "<h2>My favorite language:</h2>" +
                         "<select name='first'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Php'>Php</option>" +
                         "</select>" +
                         "<h2>My Second Favorite language:</h2>" +
                         "<select name='second'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Php'>Php</option>" +
                         "</select>" +
                         "<h2>My third favorite language:</h2>" +
                        "<select name='third'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Php'>Php</option>" +
                        "</select>" +
                        "<input type='submit' value='Submit'>" +
                     "</form>" +
                  "</body>" +
               "</html>";
    }
}
