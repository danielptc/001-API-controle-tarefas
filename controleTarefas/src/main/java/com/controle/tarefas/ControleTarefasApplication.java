package com.controle.tarefas;

import com.controle.tarefas.model.Tarefa;
import com.controle.tarefas.repository.TarefaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class ControleTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleTarefasApplication.class, args);
	}

}
