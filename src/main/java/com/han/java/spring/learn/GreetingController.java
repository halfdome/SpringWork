package com.han.java.spring.learn;

/**
 * Created by yhan on 3/8/15.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name,
                             @RequestParam(value="suffix", defaultValue="Mars") String suffix) {
        if (Math.random() > 0.1)
            return new Greeting(counter.incrementAndGet(),
                String.format(template, name), "Juniper");
        else
            return new Greeting(counter.incrementAndGet(),
                    String.format(template, name), suffix);
    }
}