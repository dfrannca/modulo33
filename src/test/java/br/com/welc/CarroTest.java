package br.com.welc;

import static org.junit.Assert.assertNotNull;

//import java.time.Instant;

import org.junit.Test;

import br.com.welc.dao.MarcaDao;
import br.com.welc.dao.IMarcaDao;
import br.com.welc.dao.ICarroDao;
import br.com.welc.dao.CarroDao;
import br.com.welc.domain.Marca;
import br.com.welc.domain.Carro;

public class CarroTest {
	//private ICursoDao cursoDao;
	private ICarroDao matriculaDao;
	private IMarcaDao cursoDao;
	
	public CarroTest() {
		matriculaDao = new CarroDao();
		cursoDao  = new  MarcaDao();
	}
	
	@Test
	public void cadastrar() {
		Marca curso = criarCurso("A10042");//Alterar esse valor
		Carro mat = new Carro();
		mat.setCodigo("AB10042");//Alterar esse valor
//		mat.setDataMatricula(Instant.now());
		
		mat.setDataCompra("06/02/2024");
		mat.setStatus("Entregue.");
		mat.setValor(15000000d);
		mat.setValorReal(164000);
		
		mat.setCurso(curso);
		mat = matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}

	private Marca criarCurso(String codigo) {
		
		Marca curso =new Marca();
		curso.setCodigo(codigo);
		curso.setDescricao("BMW é uma empresa alemã, fabricante de automóveis e motocicletas, sediada em Munique, Baviera");
		curso.setNome("BMW");
		return  cursoDao.cadastrar(curso);
		
		
	}

}
