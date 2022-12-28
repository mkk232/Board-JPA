package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.MemberVo;

@Repository
public interface MemberRepository extends JpaRepository<MemberVo, Long>{
	// findBy 뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다.
}
