package com.konopleva.crudeapp.repository;

import com.konopleva.crudeapp.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NotificationRepository extends JpaRepository<Notification, String> {
}
