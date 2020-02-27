package subproject1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void appHasAGreeting() {
    App classUnderTest = new App();
    System.out.println(classUnderTest.getGreeting());
    assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  }

}
