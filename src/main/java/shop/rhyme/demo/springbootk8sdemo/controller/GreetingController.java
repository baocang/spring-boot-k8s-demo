package shop.rhyme.demo.springbootk8sdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.rhyme.demo.springbootk8sdemo.config.GreetingConfig;

@Controller
public class GreetingController {

    private final GreetingConfig greetingConfig;

    GreetingController(GreetingConfig greetingConfig) {
        this.greetingConfig = greetingConfig;
    }

    @ResponseBody
    @GetMapping("/welcome")
    public String value() {
        return this.greetingConfig.getMessage();
    }

}
