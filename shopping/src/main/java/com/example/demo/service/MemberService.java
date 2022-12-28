package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MemberRepository;
import com.example.demo.vo.MemberVo;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public List<MemberVo> findAll() {
		List<MemberVo> members = new ArrayList<MemberVo>();
		memberRepository.findAll().forEach(e -> members.add(e));
		
		return members;
	}
	
	public Optional<MemberVo> findById(Long mbrNo) {
		Optional<MemberVo> member = memberRepository.findById(mbrNo);
		
		return member;
	}
	
	public void deleteById(Long mbrNo) {
		memberRepository.deleteById(mbrNo);
	}
	
	public MemberVo save(MemberVo memberVo) {
		memberRepository.save(memberVo);
		return memberVo;
	}
	
	public void updateById(Long mbrNo, MemberVo memberVo) {
		Optional<MemberVo> member = memberRepository.findById(mbrNo);
		
		if(member.isPresent()) {
			member.get().setMbrNo(memberVo.getMbrNo());
			member.get().setId(memberVo.getId());
			member.get().setName(memberVo.getName());
			memberRepository.save(memberVo);
		}
	}
}
