package pro.sky.telegrambot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.model.DogsOwner;

public interface DogsRepository extends JpaRepository<DogsOwner,Long> {
}
