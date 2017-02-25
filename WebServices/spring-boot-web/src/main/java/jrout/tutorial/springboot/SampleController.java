package jrout.tutorial.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jrout on 2/24/17.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/helow")
    @ResponseBody
    String helloWorld(){
        return "Hello World !!!";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }*/
}
