package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @GetMapping("/")
    public String save(){
        return "index";
    }
    @RequestMapping("save")
    public String save(@RequestParam(required = false)String Lettuce,
                       @RequestParam(required = false)String Tomato,
                       @RequestParam(required = false)String Mustard,
                       @RequestParam(required = false)String Sprouts, Model model){
        model.addAttribute("Lettuce",Lettuce);
        model.addAttribute("Tomato",Tomato);
        model.addAttribute("Mustard",Mustard);
        model.addAttribute("Sprouts",Sprouts);
        return "menu";
    }
}
