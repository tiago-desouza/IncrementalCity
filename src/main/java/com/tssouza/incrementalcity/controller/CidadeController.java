package com.tssouza.incrementalcity.controller;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.tssouza.incrementalcity.model.Cidade;
import com.tssouza.incrementalcity.repository.CidadeRepository;

@RestController
@RequestMapping("/cidade")
public class CidadeController {
	
	@Autowired
	private CidadeRepository cidadeRepository;

	@PostMapping("/add")
	@Transactional
	public @ResponseBody String lerCaminho(@RequestParam String file) throws IOException, CsvException {
		Reader reader = Files.newBufferedReader(Paths.get(file));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		Cidade cidade = new Cidade();
		List<Cidade> cidadesList = new ArrayList<Cidade>();
		List<String[]> cidades = csvReader.readAll();
		
		for (String[] cidadeT : cidades) {
			cidade.setIbgeId(cidadeT[0]);
			cidade.setUf(cidadeT[1]);
			cidade.setNome(cidadeT[2]);
			cidade.setCapital(cidadeT[3]);
			cidade.setLongitude(cidadeT[4]);
			cidade.setLatitude(cidadeT[5]);
			cidade.setNoAccents(cidadeT[6]);
			cidade.setNomeAlternativo(cidadeT[7]);
			cidade.setMicroRegiao(cidadeT[8]);
			cidade.setMacroRegiao(cidadeT[9]);
			cidadesList.add(cidade);
			cidadeRepository.saveAll(cidadesList);
		}

		return "Saved";
	}
}
