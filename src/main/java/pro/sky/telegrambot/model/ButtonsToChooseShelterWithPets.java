package pro.sky.telegrambot.model;

public enum ButtonsToChooseShelterWithPets {
    CAT("\uD83D\uDC31Кошки"),
    DOG("\uD83D\uDC36Собаки");
    private final String nameButton;


    public String getNameButton() {
        return nameButton;
    }

    ButtonsToChooseShelterWithPets(String nameButton) {
        this.nameButton = nameButton;

    }
}
