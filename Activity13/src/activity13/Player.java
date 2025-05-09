package activity13;

public class Player {
    private String name;
    private int hp;
    private int wins;
    private int consecutiveWins;
    private int choice; // 0: question mark, 1: rock, 2: paper, 3: scissors

    public Player(String name) {
        this.name = name;
        reset();
    }

    public void reset() {
        this.hp = 100;
        this.wins = 0;
        this.consecutiveWins = 0;
        this.choice = 0;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public int getWins() { return wins; }
    public void setWins(int wins) { this.wins = wins; }
    public int getConsecutiveWins() { return consecutiveWins; }
    public void setConsecutiveWins(int consecutiveWins) { this.consecutiveWins = consecutiveWins; }
    public int getChoice() { return choice; }
    public void setChoice(int choice) { this.choice = choice; }
    public void incrementWins() { this.wins++; }
    public void incrementConsecutiveWins() { this.consecutiveWins++; }
    public void resetConsecutiveWins() { this.consecutiveWins = 0; }
    public void decreaseHp(int amount) { this.hp -= amount; }
}
