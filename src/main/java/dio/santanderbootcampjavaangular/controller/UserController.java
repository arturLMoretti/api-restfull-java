package dio.santanderbootcampjavaangular.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.santanderbootcampjavaangular.domain.model.User;
import dio.santanderbootcampjavaangular.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> findById(@PathVariable Long Id) {
    User user = userService.findById(Id);

    return ResponseEntity.ok(user);
  }

  @PostMapping()
  public ResponseEntity<User> create(@RequestBody User user) {
    User userCreated = userService.create(user);

    URI location = ServletUriComponentsBuilder
      .fromCurrentRequest()
      .buildAndExpand(userCreated.getId())
      .toUri();
    return ResponseEntity.created(location).body(userCreated);
  }
}
