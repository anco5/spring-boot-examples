# SpringBootとKotlinのサンプル

## 環境
|ライブラリ|バージョン|説明|
|---|---|---|
|IntelliJ IDEA|2018.3.4|統合開発環境|
|Kotlin|1.2.71|言語|
|Spring Boot|2.1.2.RELEASE|Webフレームワーク|
|Mustache|2.1.2.RELEASE|テンプレートシステム|


## 構築
```bash
curl https://start.spring.io/starter.tgz \
 -d dependencies=web,mustache \
 -d type=gradle-project \
 -d language=kotlin \
 -d groupId=com.example \
 -d artifactId=spring-boot-kotlin-mustache \
 -d packageName=com.example.app \
 -d applicationName=Application \
 -d baseDir=spring-boot-kotlin-mustache | tar -xzvf -
```