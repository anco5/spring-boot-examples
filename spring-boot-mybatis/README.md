# SpringBootとMyBatisのサンプル

## 環境
|ライブラリ|バージョン|説明|
|---|---|---|
|IntelliJ IDEA|2018.3.3|統合開発環境|
|JDK|1.8|Java|
|Spring Boot|2.1.2.RELEASE|Webフレームワーク|
|mybatis-spring|2.0.0|ORマッパー|
|Thymeleaf|2.1.2.RELEASE|テンプレートエンジン|
|Gradle|4.10.2|ビルド管理|
|Lombok|1.18.4|ボイラーテンプレート削減|


## 準備

### テーブル作成
```postgresql
CREATE TABLE users (
  id BIGSERIAL,
  name VARCHAR(30),
  password VARCHAR(255),
  finished BOOLEAN
);
```

## 機能
1. ユーザ一覧表示
2. ユーザ登録
3. ユーザ情報編集
4. ユーザ削除（論理削除）
