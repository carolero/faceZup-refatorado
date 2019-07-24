package com.br.face.zup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.face.zup.models.Postagem;

@Repository
public interface PostagemRepository extends CrudRepository<Postagem, Integer>{

}
