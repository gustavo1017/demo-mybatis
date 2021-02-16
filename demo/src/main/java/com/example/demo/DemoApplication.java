package com.example.demo;

import com.example.demo.mapper.IAuthor;
import com.example.demo.models.Author;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final IAuthor iAuthor;

	public DemoApplication(IAuthor iAuthor) {
		this.iAuthor = iAuthor;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Author author = this.iAuthor.find();
		System.out.println(author);
	}
}
