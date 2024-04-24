/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Operação Abstracta
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.operacaoabstrata;

//declaração de subclasse
public class Medico extends Pessoa
{
	private String especialidade;

	public Medico(int numero, String nome) 
	{
		this.numero = numero;
		this.nome = nome;
	}

	public String getEspecialidade() 
	{
		return especialidade;
	}

	public void setEspecialidade(String especialidade) 
	{
		this.especialidade = especialidade;
	}
	
	// implemetação do método abstracto declarado pela superclasse
	protected int getNumero() 
	{
		return numero;
	}
}
