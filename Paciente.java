/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Operação Abstracta
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.operacaoabstrata;

//declaração de subclasse
public class Paciente extends Pessoa
{
	private String estado;

	public Paciente(int numero, String nome) 
	{
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}

	// implemetação da operação método abstracto declarado pela superclasse
	public int getNumero() 
	{
		return numero;
	}	
}
