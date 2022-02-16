package com.learning.forum.controller;

import com.learning.forum.Dto.TopicoDto;
import com.learning.forum.modelo.Curso;
import com.learning.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> listaTopicos(){
        Topico topico = new Topico ("Duvida","Duvida sobre spring",new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
