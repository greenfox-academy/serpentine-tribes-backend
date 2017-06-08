package com.greenfox.tribesoflagopus.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public String greeting() {
    return "hello, CircleCI!";
  }

}
