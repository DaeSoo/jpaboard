package com.example.demo.board.service;

import com.example.demo.board.domain.Resource;
import com.example.demo.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardRepository boardRepository;


    @Override
    public Resource rtrv(long id) {
        return boardRepository.findById(id).orElse(null);
    }

    @Override
    public Resource save(Resource param) {
        return boardRepository.save(param);
    }

    @Override
    public Long del(long id) {
        boardRepository.deleteById(id);
        return id;
    }
}
