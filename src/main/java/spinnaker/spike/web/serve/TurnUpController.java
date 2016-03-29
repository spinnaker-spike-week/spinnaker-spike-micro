package spinnaker.spike.web.serve;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TurnUpController {

    @RequestMapping(value="/turnUp", method= RequestMethod.GET)
    public String turnUp(Model model){
        model.addAttribute("turnUp", new TurnUp());
        return "turnUp";
    }

    @RequestMapping(value="/turnUpHey", method= RequestMethod.POST)
    public String create(@ModelAttribute TurnUp turn, Model model){
        model.addAttribute("turnUp", turn);
        return "hey";
    }
}
