


package br.com.welc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.welc.dao.MarcaDao;
import br.com.welc.dao.IMarcaDao;
import br.com.welc.domain.Marca;
/*
 * @wagner
 */


public class MarcaTest {
	
	private IMarcaDao cursoDao;
	
	public MarcaTest() {
		cursoDao = new MarcaDao();
	}
	
	@Test
	public void cadastrar() {
		Marca curso =new Marca();
		curso.setCodigo("A32");
		curso.setDescricao("Curso Teste2");
		curso.setNome("Curso de Java Backend2");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
