package com.butenov.socialmedia.core.dataaccess.repository;

import com.butenov.socialmedia.core.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
