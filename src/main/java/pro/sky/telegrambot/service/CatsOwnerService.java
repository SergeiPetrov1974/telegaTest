package pro.sky.telegrambot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.listener.TelegramBotUpdatesListener;

@Service
public class CatsOwnerService implements CatsDogsInterface {
    private Logger logger = LoggerFactory.getLogger(TelegramBotUpdatesListener.class);

    private CatsRepository catsRepository;

    private TelegramBot telegramBot;



    public CatsOwnerService(CatsRepository catsRepository, TelegramBot telegramBot) {
        this.catsRepository = catsRepository;
        this.telegramBot = telegramBot;
    }

    @Override
    public SendResponse getMenu(Update update) {
        InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Информация о приюте");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Завести друга");
        InlineKeyboardButton button3 = new InlineKeyboardButton("Прислать отчет о питомце");
        InlineKeyboardButton button4 = new InlineKeyboardButton("Позвать волонтера");
        button1.callbackData("инфа0");
        button2.callbackData("взять0");
        button3.callbackData("отчет0");
        button4.callbackData("волонтер0");
        keyboardMarkup.addRow(button1);
        keyboardMarkup.addRow(button2);
        keyboardMarkup.addRow(button3);
        keyboardMarkup.addRow(button4);
        return telegramBot.execute(new SendMessage(update.callbackQuery().message().chat().id(), "Отлично!Чем могу помочь?").replyMarkup(keyboardMarkup));

    }

    @Override
    public SendResponse stepOne(Update update) {
        InlineKeyboardMarkup keyboardForStepOne = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Как нас найти?");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Оформить пропуск на авто");
        InlineKeyboardButton button3 = new InlineKeyboardButton("Техника безопасности");
        InlineKeyboardButton button4 = new InlineKeyboardButton("Отправить свой контакт");
        InlineKeyboardButton button5 = new InlineKeyboardButton("Позвать волонтера");
        button1.callbackData("расписание0");
        button2.callbackData("авто0");
        button3.callbackData("тб0");
        button4.callbackData("сохранение0");
        button5.callbackData("волонтер0");
        keyboardForStepOne.addRow(button1);
        keyboardForStepOne.addRow(button2);
        keyboardForStepOne.addRow(button3);
        keyboardForStepOne.addRow(button4);
        keyboardForStepOne.addRow(button5);
        return telegramBot.execute(new SendMessage(update.callbackQuery().message().chat().id(), "Добро пожаловать в приют для кошек! Что будем делать?").replyMarkup(keyboardForStepOne));
    }


}
