package com.bridgelabz.Hello.world;

import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class HelloWorldController {

    @RequestMapping(value = {"/", "/hello", "/msg"})
    public String getMessage() {

        return "Hello Bridgelabz!";
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String test2(@PathVariable String name) {
        return "Hello " + name + "!";
}

    @RequestMapping(value = "/test3/{name}", method = RequestMethod.GET)
    public String test3(
            @RequestParam String fname,
            @RequestParam String lname,
            @PathVariable String name )
    {
        return name + " " + fname + " " + lname + " ";
    }

    @PostMapping("/post")
    public String test4(@RequestBody Client client) {
    return  "Hello " + client.toString();
    }

}
