package org.sample.framework.widgets;

public interface ISwipe {
	/**
	 * Realiza a a��o de tocar na tela e arrastar na horizontal.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract ISwipe horizontal(String orientation);
	
	/**
	 * Realiza a a��o de tocar na tela e arrastar na vertical.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract ISwipe vertical(String orientation);
}
