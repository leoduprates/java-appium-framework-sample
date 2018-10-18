package org.sample.framework.widgets;

public interface ITextField {
	/**
	 * Realiza a a��o de escrever uma cadeia de caracteres no campo de texto.
	 * 
	 * @throws ComponentNotFoundException caso o campo de texto n�o seja encontrado.
	 * @return este objeto.
	 */
	public abstract ITextField setText(String text);
}
