package com.testehospede.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testehospede.entity.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
}