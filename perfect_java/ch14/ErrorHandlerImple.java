package ch14;

// エラーハンドラ用の実装クラス
class ErrorHandlerImpl implements ErrorHandler {
  public void onError(String error) {
    System.out.println("error:" + error);
  }
}