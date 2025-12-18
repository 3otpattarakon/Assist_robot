package com.robot.assistrobot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robot.assistrobot.model.entity.UserAccount;

public interface UserAccountRepo extends JpaRepository<UserAccount, Long> {}