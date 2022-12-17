public class Human {
    private String name;
    private boolean cupboadKey;

    public Human(String name, boolean cupboadkey) {
        this.name = name;
        this.cupboadKey = cupboadkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public Boolean getCupboadKey() {
        return cupboadKey;
    }

    public void openCupboad(Cupboad c) {
        if (getCupboadKey() && c.getCondition().equalsIgnoreCase("close"))
            System.out.println("Человек открыл шкаф");
        else if (!getCupboadKey() && c.getCondition().equalsIgnoreCase("close"))
            System.out.println("Необходимо найти ключ");
        else
            System.out.println("Шкаф открыт");

    }
}
