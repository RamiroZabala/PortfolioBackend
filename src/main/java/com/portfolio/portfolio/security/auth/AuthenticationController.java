package com.portfolio.portfolio.security.auth;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
//@RequestMapping(value="/api/auth", method={RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequiredArgsConstructor

public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
    return ResponseEntity.ok(service.register(request));
  }

  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
      return ResponseEntity.ok(service.authenticate(request));
  }
  
  @RequestMapping(value = "/authenticate", method = RequestMethod.OPTIONS)
  public ResponseEntity<?> handleOptionsRequest() {
      HttpHeaders headers = new HttpHeaders();
      headers.add("Allow", "OPTIONS, POST");
      //headers.add("Access-Control-Allow-Origin", "*");
      //headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
      //headers.add("Access-Control-Allow-Headers", "Authorization, Content-Type");
      //headers.add("Access-Control-Allow-Credentials", "true");
      //headers.add("Access-Control-Max-Age", "3600");
      return ResponseEntity.ok().headers(headers).build();
  }

  @GetMapping ("/session_status")
  public Boolean isSessionValid (){
      return true;
  }
}
