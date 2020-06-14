package Ch5;

public class Student {

  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return this.name;
  }

  public int getScore() {
    return this.score;
  }

  @Override
  public String toString() {
    return name + ":" + score;
  }
  
}