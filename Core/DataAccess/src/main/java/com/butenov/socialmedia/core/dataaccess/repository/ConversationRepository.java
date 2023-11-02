package com.butenov.socialmedia.core.dataaccess.repository;

import com.butenov.socialmedia.core.domain.model.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
