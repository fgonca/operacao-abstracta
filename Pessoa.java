/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Operação Abstracta
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.operacaoabstrata;

//Declaração de superclasse abstracta
public abstract class Pessoa 
{
	protected int numero;
	protected String nome;
	
	// declaração de operação abstracta (método abstracto)
	protected abstract int getNumero();
	
	protected String getNome() 
	{
		return nome;
	}
}
