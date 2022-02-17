package com.learning.forum.form;

import com.learning.forum.modelo.Curso;
import com.learning.forum.modelo.Topico;
import com.learning.forum.repository.CursoRepository;
import com.learning.forum.repository.TopicoRepository;
import lombok.Data;

@Data
public class TopicoForm {
    private String titulo;
    private String mensagem;
    private String nomeCurso;

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem,curso);
    }
}
