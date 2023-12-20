package com.codinggrecipe.member.service;

import com.codinggrecipe.member.dto.MemberDTO;
import com.codinggrecipe.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDto) {

    }
}
