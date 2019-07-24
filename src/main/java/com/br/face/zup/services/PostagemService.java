package com.br.face.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.face.zup.models.Postagem;
import com.br.face.zup.repositories.PostagemRepository;

@Service
public class PostagemService {
	
	@Autowired
	private PostagemRepository postagemRepository;

	public Iterable<Postagem> retornarPostagens() {
		return postagemRepository.findAll();
	}
	
	public void salvarPostagem(Postagem postagemModel) {
		postagemModel.setId(null);
		postagemRepository.save(postagemModel);
	}
	
	public Postagem pegarPostagemPeloID(int id) {
		if(postagemRepository.existsById(id)) {
			return postagemRepository.findById(id).get();
		}
		return null;
	}
	
	public long quantidadeDePostagem() {
		return postagemRepository.count();
	}
	
	public void atualizarPostagem(int id, Postagem postagem) {
		postagem.setId(id);
		postagemRepository.save(postagem);
	}
	
	public void apagarPostagem(int id) {
		postagemRepository.deleteById(id);
	}
}
