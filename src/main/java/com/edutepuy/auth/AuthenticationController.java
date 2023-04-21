package com.edutepuy.auth;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
@Tag(name = "Authentication", description = "Authentication module")
public class AuthenticationController {

  private final AuthenticationService service;

  @Operation(
          summary = "User register",
          description = "Register a new user")
  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
                  content = @Content(
                          mediaType = "application/json",
                          examples = {
                                  @ExampleObject(
                                          value = "{\"firstname\" : \"Fernando\", \"lastname\" : \"Rodriguez\", \"email\" : \"fernando.jesus@gmail.com\", \"password\" : \"12345678\"}"
                                  ),
                          }
                  )
          )
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.register(request));
  }

  @Operation(
          summary = "User login",
          description = "Get registered user token")
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
                  content = @Content(
                          mediaType = "application/json",
                          examples = {
                                  @ExampleObject(
                                          value = "{\"email\" : \"fernando.jesus@gmail.com\", \"password\" : \"12345678\"}"
                                  ),
                          }
                  )
          )
      @RequestBody AuthenticationRequest request
  ) {
    return ResponseEntity.ok(service.authenticate(request));
  }


}
