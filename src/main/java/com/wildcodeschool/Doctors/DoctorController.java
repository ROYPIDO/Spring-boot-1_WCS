package com.wildcodeschool.Doctors;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public String index(@PathVariable int number) {
        if (number == 1) {
            return "<h1>William Hartnell</h1>";
        } else if(number == 10) {
            return "David Tennant";
        }
        else if(number == 13){
            return "Jodie Whittaker";
        }
        else {
            return "default";
        }
    }
}