package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private int member_id;
    private String member_pw;
    private String member_name;
    private String member_email;
    private String nickName;
    private boolean activated;
}
