package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.model.students;

@Controller
public class HomeController {
    @RequestMapping({"/", ""})
    public String home(Model model) {
        model.addAttribute("html", "<p style=\"color:blue\")>alo</p>");
        model.addAttribute("age", 18);
        model.addAttribute("gen", true);
        model.addAttribute("age", 18);
        model.addAttribute("students", new students(1, "Châu Xink"));
        return "home";
    }

    @RequestMapping("/local")
    public String local() {
        return "local";
    }
}

