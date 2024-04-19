package de.hsrm.mi.web.app1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("/bsi")
public class BSIController {
    
    @GetMapping
    public String showForm() {
        return "bsi";
    }
    
    @PostMapping
    public String postMethodName(Model m, @RequestParam("kGroesse") int kgroesse, @RequestParam("schuhGr") int schuhGr, @RequestParam("semZahl") int semZahl) {
        int bsiW;
        float w;
        w = schuhGr * semZahl;
        w = kgroesse/w;
        w *= 100;
        bsiW = (int) w;
        m.addAttribute("bsiwert", bsiW);
        return "bsi";
    }
    
        
}
