# KotlinとReactのサンプル

## 環境
|ライブラリ|バージョン|説明|
|---|---|---|
|IntelliJ IDEA|2018.3.4|統合開発環境|
|Kotlin|1.2.71|言語|
|Spring Boot|2.1.2.RELEASE|Webフレームワーク|
|Thymeleaf|2.1.2.RELEASE|テンプレートシステム|
|React|16.7.0|JSフレームワーク|

## Initializr

```bash
$ curl https://start.spring.io/starter.tgz \
 -d dependencies=web,thymeleaf,lombok \
 -d language=kotlin \
 -d applicationName=Application \
 -d groupId=com.example \
 -d artifactId=spring-boot-kotlin-react \
 -d type=maven-project \
 -d packageName=app \
 -d baseDir=spring-boot-kotlin-react | tar -xzvf -
```


