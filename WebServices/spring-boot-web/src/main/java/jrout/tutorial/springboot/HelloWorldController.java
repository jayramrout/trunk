package jrout.tutorial.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jrout on 2/24/17.
 * This is the latest way
 */
@RestController
public class HelloWorldController {

    @GetMapping(path = "gm")
    public String hello(){
        return "Hello Good Morning.";
    }
}
