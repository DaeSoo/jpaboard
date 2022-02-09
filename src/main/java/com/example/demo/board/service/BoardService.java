package com.example.demo.board.service;

import com.example.demo.board.domain.Resource;

public interface BoardService {

    Resource rtrv(long id);

    Resource save(Resource param);

    Long del(long id);
}
