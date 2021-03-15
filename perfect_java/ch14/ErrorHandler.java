package ch14;

// エラーハンドラ用のインタフェース定義
interface ErrorHandler {
  void onError(String error);
}