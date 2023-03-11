package com.chhinhua.fullstackbackend.repository;

import com.chhinhua.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
