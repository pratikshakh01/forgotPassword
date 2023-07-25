package com.assigment.forgotPassword.repository;

import com.assigment.forgotPassword.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForgotPasswordRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByToken(String token);
}
