package com.example.demo.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "member")
public class MemberVo {
	@Id
	// GeneratedValue를 선언한 이유는 테이블 생성 시 해당 필드를 PK, AUTO_INCREMENT로 설정했기 때문에 직접 할당이 아닌 자동으로 생성되도록 하기 위함
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 데이터베이스에 위임하는 방식
	private Long mbrNo;
	
	private String id;
	
	private String name;
	
	@Builder
	public MemberVo(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
