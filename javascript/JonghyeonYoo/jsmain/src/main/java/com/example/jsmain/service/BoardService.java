package com.example.jsmain.service;

import com.example.jsmain.entity.Board;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardService {
    public void register(Board board) throws Exception;

    public List<Board> list() throws Exception;
}