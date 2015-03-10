package com.han.java.spring.learn;

/**
 * Created by yhan on 3/9/15.
 */
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}