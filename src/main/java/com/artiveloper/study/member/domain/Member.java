package com.artiveloper.study.member.domain;

import com.artiveloper.study.board.domain.Board;

import java.sql.Timestamp;

/**
 * Created by kimsunwoo on 2016-06-24.
 */
public class Member {

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

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getJoinStatus() {
        return joinStatus;
    }

    public void setJoinStatus(String joinStatus) {
        this.joinStatus = joinStatus;
    }

    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    public Timestamp getDropDate() {
        return dropDate;
    }

    public void setDropDate(Timestamp dropDate) {
        this.dropDate = dropDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", joinStatus='" + joinStatus + '\'' +
                ", joinDate=" + joinDate +
                ", dropDate=" + dropDate +
                '}';
    }
}
