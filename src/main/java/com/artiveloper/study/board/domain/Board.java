package com.artiveloper.study.board.domain;

import com.artiveloper.study.user.domain.User;

import java.sql.Timestamp;

/**
 * Created by kimsunwoo on 2016-06-24.
 */
public class Board {

    //멤버 클래스
    private User user;
    //게시판 번호
    private int boardNo;
    //제목
    private String subject;
    //내용
    private String content;
    //게시날짜
    private Timestamp registDate;
    //수정날짜
    private Timestamp modifyDate;
    //삭제날짜
    private Timestamp deleteDate;
    //게시글 상태 플래그
    private String boardStatus;

}
