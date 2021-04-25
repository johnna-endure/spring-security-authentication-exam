# spring-security-authentication-exam

## 목적
스프링 시큐리티를 이용해 form 로그인 기능을 구현해보자!

## 시나리오

- 인증 기능을 구현한다.
- 로그인 화면에서 인증 요청을 받는다.
- 인증 요청 정보를 Member 데이터베이스에 저장된 정보와 대조해 인증한다.

## 빌드 
```$) gradlew build ```
프로젝트 루트 경로에서 위의 명령을 터미널에 입력하세요.

## 테스트 데이터
MemberService 빈이 생성되면서 Member 테스트 데이터가 생성되도록 했습니다.  

        memberRepository.save(new Member("11", "1234", "USER"));
        memberRepository.save(new Member("user2", "password2", "USER"));
        memberRepository.save(new Member("user3", "password3", "USER"));
        memberRepository.save(new Member("user4", "password4", "USER"));

## 실행 

브라우저에서 http://localhost:8080 로 접속한 뒤, 위 테스트 데이터로 로그인 할 수 있습니다.
