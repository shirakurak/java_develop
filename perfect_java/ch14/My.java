package ch14;

// エラーハンドラ処理を組み込んだクラス
public class My {

  private ErrorHandler errorHandler;
  public void registerErrorHandler(ErrorHandler errorHandler) {
    this.errorHandler = errorHandler;
  }
  
  public void exec() {
    // 処理
    if (errorHandler != null) {
      errorHandler.onError("something wrong happened");
    }
  }
}
