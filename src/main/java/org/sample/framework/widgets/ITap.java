package org.sample.framework.widgets;

public interface ITap {
	/**
	 * Realiza a a��o de tocar na tela.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract ITap tap();
}
