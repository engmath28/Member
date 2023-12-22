package com.codinggrecipe.member.controller;

import com.codinggrecipe.member.dto.MemberDTO;
import com.codinggrecipe.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자주입
    private final MemberService memberService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDto) {
        System.out.println("MemberController.save");
        System.out.println("memberDto = " + memberDto);
        memberService.save(memberDto);
        return "login";
    }

    @GetMapping("/member/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
        MemberDTO loginResult = memberService.login(memberDTO);
        if (loginResult != null) {
            // Login 성공
            session.setAttribute("loginEmail", loginResult.getMemberEmail());
            return "main";
        }else {
            // Login 실패
            return "login";
        }
    }

    @GetMapping("/member/")
    public String findAll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList", memberDTOList);
        return "list";
    }


}
