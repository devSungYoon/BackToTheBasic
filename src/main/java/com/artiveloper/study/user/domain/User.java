package com.artiveloper.study.user.domain;

import com.artiveloper.study.board.domain.Board;

import java.sql.Timestamp;

/**
 * Created by kimsunwoo on 2016-06-24.
 */
public class User {

    //게시판 클래스
    private Board board;
    //이름
    private String userName;
    //아이디
    private String userId;
    //비밀번호
    private String userPassword;
    //가입상태(플래그)
    private String joinStatus;
    //가입날짜
    private Timestamp joinDate;
    //탈퇴날짜
    private Timestamp dropDate;

}
