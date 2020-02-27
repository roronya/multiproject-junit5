package subproject1;

public class App {

  public String getGreeting() {
    return "Hello, this is subproject1.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }

}
