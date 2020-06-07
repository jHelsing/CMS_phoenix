package se.jonteh.cms.phoenix;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
  
  @GetMapping("/")
  public String startPage(@RequestParam(name="name", required=false, defaultValue="World") String name,
                          Model model) {
    model.addAttribute("name", name);
    return "startPage";
  }
  
}
