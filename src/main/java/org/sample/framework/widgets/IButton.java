package org.sample.framework.widgets;

public interface IButton {
	/**
	 * Realiza a a��o de clique no bot�oo.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IButton click();
	
	/**
	 * Verifica se o elemento est� habilitado e dispon�vel na tela.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IButton exists();
}
