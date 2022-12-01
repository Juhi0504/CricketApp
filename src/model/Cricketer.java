package model;

public class Cricketer {

    String id;
    String name;

    CricketerType type;
    boolean isCaptain;
    boolean isViceCaptain;

    public Cricketer(String id, String name, CricketerType type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.isCaptain = isCaptain;
        this.isViceCaptain = isViceCaptain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CricketerType getType() {
        return type;
    }

    public void setType(CricketerType type) {
        this.type = type;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public boolean isViceCaptain() {
        return isViceCaptain;
    }

    public void setViceCaptain(boolean viceCaptain) {
        isViceCaptain = viceCaptain;
    }
}
