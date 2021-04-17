# spring-security-authentication-exam

## 테스트 데이터
MemberService 빈이 생성되면서 Member 테스트 데이터가 생성되도록 했습니다.  

        memberRepository.save(new Member("11", "1234", "USER"));
        memberRepository.save(new Member("user2", "password2", "USER"));
        memberRepository.save(new Member("user3", "password3", "USER"));
        memberRepository.save(new Member("user4", "password4", "USER"));
