package com.artiveloper.study.board.domain;

import com.artiveloper.study.member.domain.Member;

import java.sql.Timestamp;

/**
 * Created by kimsunwoo on 2016-06-24.
 */
public class Board {

    //멤버 클래스
    private Member member;
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

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Timestamp registDate) {
        this.registDate = registDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Timestamp getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Timestamp deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getBoardStatus() {
        return boardStatus;
    }

    public void setBoardStatus(String boardStatus) {
        this.boardStatus = boardStatus;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", member=" + member +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", registDate=" + registDate +
                ", modifyDate=" + modifyDate +
                ", deleteDate=" + deleteDate +
                ", boardStatus='" + boardStatus + '\'' +
                '}';
    }
}
