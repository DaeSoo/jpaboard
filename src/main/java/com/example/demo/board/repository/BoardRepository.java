package com.example.demo.board.repository;

import com.example.demo.board.domain.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Resource, Long> {
}
