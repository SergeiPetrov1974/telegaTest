package pro.sky.telegrambot.model;

public enum CommandButtons {
    START("/start");
    private final String commandButtons;


    CommandButtons(String commandButtons) {
        this.commandButtons = commandButtons;
    }

    public String getCommandButtons() {
        return commandButtons;
    }
}
