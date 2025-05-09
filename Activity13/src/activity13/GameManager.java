package activity13;

public class GameManager {
    private Player player;
    private Player computer;
    private int round;
    private boolean gameOver;

    public GameManager() {
        this.player = new Player("Player");
        this.computer = new Player("Computer");
        this.round = 1;
        this.gameOver = false;
    }

    public void resetGame() {
        player.reset();
        computer.reset();
        round = 1;
        gameOver = false;
    }

    public Player getPlayer() { return player; }
    public Player getComputer() { return computer; }
    public int getRound() { return round; }
    public void nextRound() { round++; }
    public boolean isGameOver() { return gameOver; }
    public void setGameOver(boolean over) { this.gameOver = over; }
}
