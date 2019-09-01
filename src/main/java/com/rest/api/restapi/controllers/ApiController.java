package com.rest.api.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ApiController {

  @GetMapping("/api/getuser")
  public String getDate(Principal principal) {
    return principal.getName();
  }
}
