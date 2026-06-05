package com.db.desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.db.desafio.model.Bruxo;
import com.db.desafio.model.BruxoGrifinoria;
import com.db.desafio.model.BruxoSonserina;
import com.db.desafio.model.Magia;
import com.db.desafio.model.dtos.BruxoRequestDTO;
import com.db.desafio.model.dtos.BruxoResponseDTO;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n=================================================");
        System.out.println("DESAFIO");
        System.out.println("=================================================\n");

        System.out.println("--- 1. simulando entrada de dados");
        BruxoRequestDTO request1 = new BruxoRequestDTO("Harry Potter", "GRIFINORIA");
        BruxoRequestDTO request2 = new BruxoRequestDTO("Draco Malfoy", "SONSERINA");

        System.out.println("\n--- 2. convertendo dtos para dominio ---");
        Bruxo bruxo1 = converterParaDominio(request1);
        Bruxo bruxo2 = converterParaDominio(request2);

        System.out.println("\n--- 3. executando ---");
        bruxo1.mostrarInformacoes();
        bruxo2.mostrarInformacoes();

        if (bruxo1 instanceof Magia magiaGrifinoria) {
            magiaGrifinoria.lancarFeitico();
        }
        
        if (bruxo2 instanceof Magia magiaSonserina) {
            magiaSonserina.lancarFeitico();
        }

        System.out.println("\n--- 4. saida de dados ---");
        BruxoResponseDTO response1 = gerarResponseDTO(bruxo1, "Expelliarmus");
        BruxoResponseDTO response2 = gerarResponseDTO(bruxo2, "Serpensortia");

        System.out.println("Response 1 -> Nome: " + response1.getNome() + " | Casa: " + response1.getCasa() + " | Magia: " + response1.getTipoMagia());
        System.out.println("Response 2 -> Nome: " + response2.getNome() + " | Casa: " + response2.getCasa() + " | Magia: " + response2.getTipoMagia());
        
        System.out.println("\n=================================================");
    }

    // Métodos auxiliares de conversão (Factory e Mapper) continuam aqui embaixo
    private Bruxo converterParaDominio(BruxoRequestDTO dto) {
        String casa = dto.getCasa().toUpperCase();
        return switch (casa) {
            case "GRIFINORIA" -> new BruxoGrifinoria(dto.getNome(), "Grifinória");
            case "SONSERINA" -> new BruxoSonserina(dto.getNome(), "Sonserina");
            default -> throw new IllegalArgumentException("Casa desconhecida: " + casa);
        };
    }

    private BruxoResponseDTO gerarResponseDTO(Bruxo bruxo, String tipoMagia) {
        return new BruxoResponseDTO(bruxo.getNome(), bruxo.getCasa(), tipoMagia);
    }
}

