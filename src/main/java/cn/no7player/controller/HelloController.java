package cn.no7player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    @RequestMapping("/baidu")
    public String baidu(){
        return "redirect:https://www.baidu.com";
    }
    @RequestMapping("/s")
    public String d31(){
        return "redirect:https://www.itshenyang.net/s8000";
    }
}
