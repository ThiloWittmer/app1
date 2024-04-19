package de.hsrm.mi.web.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/bsi")
public class BSIController {
    
    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return "bsi";
    }
    
}
