package com.produto.projeto1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.projeto1.Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
