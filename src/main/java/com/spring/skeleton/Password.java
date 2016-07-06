package com.spring.skeleton;



import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Password {
public static void main(String[] args) {
 
 String password = "root";
 PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
 String hashedPassword = passwordEncoder.encode(password);
 System.out.println(hashedPassword);
}
}