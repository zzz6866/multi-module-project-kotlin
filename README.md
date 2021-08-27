# 멀티모듈 프로젝트 구성 예제

## 구성환경
Spring Boot(Kotlin) + Gradle(Kotlin DSL) + H2 Database + 멀티모듈

## 멀티모듈 프로젝트
- MSA 구성에 많이 활용되는 프로젝트 구조
- Core(Common) + Web, Core(Common) + API, Core(Common) + Batch 등 여러 환경의 시스템을 나누어 개발이 되는데 코어(공통)은 다른 시스템에서도 쓰기 떄문에 취합함
- Core(Common)을 도메인별로도 나뉘어서 사용도 가능하다(MSA 구조를 위한 분할)

## 프로파일
- local : 로컬 개발 환경
- develop : 구성해야 하나 고민...
- production : 운영 환경

## `properties` => `yaml` (예정)
- 환경변수 yaml로 변경
- 중복되는 코드를 정리하여 보기 쉬운 구조로 변경

## 참고
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Kotlin](https://kotlinlang.org/)
- [Gradle Kotlin DSL Primer](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
- [Building web applications with Spring Boot and Kotlin](https://spring.io/guides/tutorials/spring-boot-kotlin/)
