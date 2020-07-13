package com.example.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.domain.Cidade;
import com.example.cursomc.domain.Cliente;
import com.example.cursomc.domain.Endereco;
import com.example.cursomc.domain.Estado;
import com.example.cursomc.domain.Produto;
import com.example.cursomc.domain.enums.TipoCliente;
import com.example.cursomc.repositories.CategoriaRepository;
import com.example.cursomc.repositories.CidadeRepository;
import com.example.cursomc.repositories.ClienteRepository;
import com.example.cursomc.repositories.EnderecoRepository;
import com.example.cursomc.repositories.EstadoRepository;
import com.example.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository catrepo;
	
	@Autowired
	private ProdutoRepository prodrepo;
	
	@Autowired
	private EstadoRepository estrepo;
	
	@Autowired
	private CidadeRepository cidrepo;
	
	@Autowired
	private ClienteRepository clirepo;

	@Autowired
	private EnderecoRepository endrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		Produto p1 = new Produto(null,"Computador",2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);
		Produto p3 = new Produto(null,"Mouse",80.00);
		
		Estado est1 = new Estado(null,"minas gerais");
		Estado est2 = new Estado(null,"sao paulo");
		
		Cidade c1 = new Cidade(null,"uberlandia",est1);
		Cidade c2 = new Cidade(null,"sao paulo",est2);
		Cidade c3 = new Cidade(null,"campinas",est2);
		
		
		Cliente cli1 = new Cliente(null,"Maria Silva", "mariasilva@gmail.com", "24191863037",TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3165471236","1196457823"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "32606532", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "centro", "35678123", cli1, c2);
		
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		cli1.getEndereco().addAll(Arrays.asList(e1,e2));
		
		catrepo.saveAll(Arrays.asList(cat1,cat2));
		prodrepo.saveAll(Arrays.asList(p1,p2,p3));
		estrepo.saveAll(Arrays.asList(est1,est2));
		cidrepo.saveAll(Arrays.asList(c1,c2,c3));
		clirepo.saveAll(Arrays.asList(cli1));
		endrepo.saveAll(Arrays.asList(e1,e2));
		
	}

}
