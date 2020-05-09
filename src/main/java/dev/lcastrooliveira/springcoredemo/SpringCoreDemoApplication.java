package dev.lcastrooliveira.springcoredemo;

import dev.lcastrooliveira.springcoredemo.view.InterfaceTexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringCoreDemoApplication implements CommandLineRunner {

	@Autowired
	private InterfaceTexto interfaceTexto;

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Situação da locadora");
		interfaceTexto.mostrarStatusDaLocadora();
		scan.nextLine();

		System.out.println("Locando a BMW");
		interfaceTexto.solicitarLocacao("ABC-1234");
		interfaceTexto.mostrarStatusDaLocadora();
		scan.nextLine();

		System.out.println("Devolvendo o Gol");
		interfaceTexto.solicitarDevolucao("KLM-3453");
		interfaceTexto.mostrarStatusDaLocadora();
		scan.nextLine();

		System.out.println("Mandando o Gol para a oficina");
		interfaceTexto.solicitarManutencao("KLM-3453");
		interfaceTexto.mostrarStatusDaLocadora();
		scan.nextLine();

		System.out.println("Buscando o Corcel da Oficina");
		interfaceTexto.solicitarRetiradaManutencao("DFG-5678");
		interfaceTexto.mostrarStatusDaLocadora();
		scan.nextLine();
	}
}
