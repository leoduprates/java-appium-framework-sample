package org.sample.framework.widgets;

public interface IZoom {
	/**
	 * Realiza a a��o de tocar duas vezes a tela com o bot�o direito do mouse diminuindo o zoom do aplicativo.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IZoom out();
	
	/**
	 * Realiza a a��o de tocar duas vezes a tela com o bot�o direito do mouse aumentando o zoom do aplicativo.
	 * 
	 * @throws ComponentNotFoundException caso o bot�o n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract IZoom in();
	
}
