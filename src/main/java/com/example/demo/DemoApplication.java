package com.example.demo;

//import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import com.example.demo.member.MemberCreateRequestDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		MemberCreateRequestDto dto =
				new MemberCreateRequestDto(
						"Leanne",
						"leanne@example.com",
						22);

		Member member = Member.from(dto);
		System.out.println(member);
	}
}

/**
 * DTO 이해하기 - 비유: 카페에서 커피 주문하기
 * main() -> 손님
 * MemberCreateRequestDto -> 주문서
 * Member -> 실제 만들어진 커피
 *
 * 0. 주문서 템플릿을 만든다.
 * @Getter
 * public class MemberCreateRequestDto {
 *     private String name;
 *     private String email;
 *     private int age;
 * }
 *
 * 1. 손님이 주문서를 작성한다.
 * MemberCreateRequestDto dto =
 * 		new MemberCreateRequestDto(
 * 			"..", "..", ".."
 * 		)
 * 	// 아직 커피는 없다. >> 주문서만 작성한 상태 <<
 *
 * 2. 주문서를 바리스타에게 준다.
 * Member member = Member.from(dto);
 * // 바리스타 = .from
 *
 * 3. 바리스타가 주문서를 읽고 커피를 만든다.
 * public static Member from(MemberCreateRequestDto dto) {
 *      return new Member(
 *           null,
 *           dto.getName(),
 *           dto.getAge(),
 *           dto.getEmail()
 *      );
 * }
 *
 * 4. 결과
 * 이제 주문서(MemberCreateRequestDto)도 있고, 커피(Member)도 있다!
 * 바리스타가 주문서를 읽고 새로운 커피를 만들어낸 것이다.
 */
