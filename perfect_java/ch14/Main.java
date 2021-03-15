package ch14;

public class Main {

  My my = new My();
  my.registerErrorHandler(new ErrorHandlerImpl());
  my.exec();
}
