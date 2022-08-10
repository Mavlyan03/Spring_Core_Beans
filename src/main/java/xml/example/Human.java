package xml.example;

public class Human {
    private String humanName;
    private int humanAge;

    public Human() {
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanName='" + humanName + '\'' +
                ", humanAge=" + humanAge +
                '}';
    }
}
