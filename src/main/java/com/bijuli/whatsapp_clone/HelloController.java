package com.bijuli.whatsapp_clone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String getHello() {
    return "Hello";
  }

}
