package pro.sky.telegrambot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.model.CatsOwner;

public interface CatsRepository extends JpaRepository<CatsOwner,Long> {
}
