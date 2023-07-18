package saving.serializable.gameSaver;

import java.io.Serializable;

class GameCharacter implements Serializable {
    private int power;
    private String type;
    private String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public String getType() {
        return type;
    }
}
