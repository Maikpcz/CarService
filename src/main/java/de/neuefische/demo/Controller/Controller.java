package de.neuefische.demo.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("HelloWorld")
public class Controller {

    @GetMapping
    public String greetings() {
        return "Servus";
    }

    @GetMapping("{name}")
        public String greetings2(@PathVariable String name){
            return name ;
        }
@PostMapping("/post")
    public String greetings3(@RequestBody String name){
        return String.valueOf(name.length());
}

}
