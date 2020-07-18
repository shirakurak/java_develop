package test;

public class Game {
  private Player player;
  public Game(Player player) {
    this.player = player;
  }
  public String attack() {
    return "Player attck with: " + player.getWeapon();
  }
}