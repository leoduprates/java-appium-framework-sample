package org.sample.framework.widgets;

public interface IMap {
	/**
	 * Realiza a a��o de clicar no bot�o.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IMap click();
	
	/**
	 * Realiza a a��o de tocar duas vezes a tela com o bot�o direito do mouse diminuindo o zoom do aplicativo.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IMap out();
	
	/**
	 * Realiza a a��o de tocar duas vezes a tela com o bot�o direito do mouse aumentando o zoom do aplicativo.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IMap in();
	
	/**
	 * Realiza a a��o de tocar na tela e arrastar na horizontal.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IMap horizontal(String orientation);
	
	/**
	 * Realiza a a��o de tocar na tela e arrastar na vertical.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IMap vertical(String orientation);
}
