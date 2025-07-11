package com.airtribe.NewsAggregatorAPI.repository;

import com.airtribe.NewsAggregatorAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDataJpaRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
