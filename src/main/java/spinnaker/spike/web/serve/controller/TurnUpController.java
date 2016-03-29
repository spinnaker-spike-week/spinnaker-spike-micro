package spinnaker.spike.web.serve.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spinnaker.spike.model.TurnUp;

import java.io.IOException;

@RestController
public class TurnUpController {

    @RequestMapping("/turnUp")
    public TurnUp domain(@RequestParam(value="name")String name) throws IOException {
        return new TurnUp(name);
    }
}
