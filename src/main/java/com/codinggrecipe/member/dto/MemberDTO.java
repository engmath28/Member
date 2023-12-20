package com.codinggrecipe.member.dto;

import com.codinggrecipe.member.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;


    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDto = new MemberDTO();
        memberDto.setId(memberEntity.getId());
        memberDto.setMemberEmail(memberEntity.getMemberEmail());
        memberDto.setMemberName(memberEntity.getMemberName());
        memberDto.setMemberPassword(memberEntity.getMemberPassword());
        return memberDto;
    }
}
