package com.butenov.socialmedia.core.dataaccess.repository;

import com.butenov.socialmedia.core.domain.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
