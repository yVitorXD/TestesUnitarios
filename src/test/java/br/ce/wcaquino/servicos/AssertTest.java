package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	public void test(){
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		//verificar se sao iguais
		Assert.assertEquals("Erro de comparação: ", 2, 1);
		Assert.assertEquals(0.51, 0.51, 0.01);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		//Assert.assertEquals(i, i2);
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i,  i2.intValue());
		
		//com Strings
		
		Assert.assertEquals("bola", "bola");
		//ignorando maisculas 
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		//inicia com
		Assert.assertTrue("bola".startsWith("bo"));
		
		//sem equals da erro, preciso colocar o equals/hashcode na classe usuario
		//
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		
		Assert.assertEquals(u1, u2);
		
		//ta vendo se sao a mesma instancia de objeto
		Assert.assertSame(u2, u2);
		
		//verifica se nao é o mesmo, na forma negativa
		Assert.assertNotSame(u1, u2);
		
		//verifica se é vazio
		Assert.assertNull(u3);
		//verifica se nao esta vazio
		Assert.assertNotNull(u2);
		
		//esperado -> recebido
		//esperei casa e recebi bola(error)
		
	}
		
}
