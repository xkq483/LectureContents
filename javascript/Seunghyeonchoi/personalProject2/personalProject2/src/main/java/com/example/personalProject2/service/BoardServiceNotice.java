package com.example.personalProject2.service;

import com.example.personalProject2.entity.BoardNotice;

import java.util.List;

public interface BoardServiceNotice {
    public void registerNotice(BoardNotice boardNotice) throws Exception;
    public List<BoardNotice> listNotice() throws Exception;
}
