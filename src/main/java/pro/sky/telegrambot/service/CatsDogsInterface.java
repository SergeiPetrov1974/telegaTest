package pro.sky.telegrambot.service;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.response.SendResponse;

public interface CatsDogsInterface {
    SendResponse stepOne(Update update);
    SendResponse getMenu(Update update);
}
