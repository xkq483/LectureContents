// service 어떤 서비스인지

package com.example.cholongtest.service;
import com.example.cholongtest.entity.Board;

import java.util.List;

public interface BoardService {
    public void register(Board board) throws Exception;

    public List<Board> list() throws Exception;
}
