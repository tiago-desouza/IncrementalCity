package com.tssouza.incrementalcity.controller;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

	@PostMapping("/add")
	public void lerCaminho(@RequestParam String file) throws IOException, CsvException {
//		String pathWindows = file.replace("\\", "\\\\");
//		Path path = Paths.get(pathWindows);
//		Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Tiago\\Desktop\\nomes.csv"));
		Reader reader = Files.newBufferedReader(Paths.get(file));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		List<String[]> pessoas = csvReader.readAll();
		for (String[] pessoa : pessoas) {
			System.out.println("Name : " + pessoa[0] + " - Idade : " + pessoa[1] + " - Email : " + pessoa[2]);
		}
	}
}
