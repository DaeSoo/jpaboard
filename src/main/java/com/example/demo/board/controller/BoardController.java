package com.example.demo.board.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @RequestMapping("/rtrv/{id}")
    public Resource rtrv(@PathVariable("id") long id){
        return boardService.rtrv(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Resource save(@RequestBody Resource param){
        return boardService.save(param);
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        String str = new Long(boardService.del(id)).toString();
        return str;
    }
}
