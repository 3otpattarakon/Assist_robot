package com.robot.assistrobot.Controller;

import org.springframework.web.bind.annotation.*;
import com.robot.assistrobot.model.entity.UserAccount;
import com.robot.assistrobot.repository.UserAccountRepo;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserAccountController {

  private final UserAccountRepo repo;

  public UserAccountController(UserAccountRepo repo) {
    this.repo = repo;
  }

  @PostMapping
  public UserAccount create(@RequestBody UserAccount u) {
    return repo.save(u);
  }

  @GetMapping
  public List<UserAccount> all() {
    return repo.findAll();
  }
}