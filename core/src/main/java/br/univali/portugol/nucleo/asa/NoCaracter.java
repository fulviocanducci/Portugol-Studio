package br.univali.portugol.nucleo.asa;

/**
 * Representa um valor do tipo {@link TipoDado#CARACTER} no código fonte.
 *
 * @author Luiz Fernando Noschang
 * @version 1.0
 *
 * @see TipoDado
 */
public final class NoCaracter extends NoExpressaoLiteral<Character>
{
    /**
     *
     * @param valor o caracter representado por este nó da árvore
     * @since 1.0
     */
    public NoCaracter(char valor)
    {
        super(valor);
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }

    @Override
    public String toString()
    {
        return "'" + getValor() + "'";
    }

    @Override
    public TipoDado getTipoResultante()
    {
        return TipoDado.CARACTER;
    }
}
