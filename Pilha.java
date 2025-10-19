package model;
public class Pilha {
	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	//verifica se está vazia
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//coloca elementos na pilha
	public void push(String e) {
		No elemento = new No();
		elemento.dado = e;
		if(isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	//tira elementos da pilha e retorna
	public String pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
  
	// mostra o topo da pilha
	public String top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos na pilha");
		}
		String valor = topo.dado;
		return valor;
	}
	
	//mostra o tamanho da pilhha 
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No aux = topo;
			cont = 1;
			while(aux.proximo != null) {	
				aux = aux.proximo;
				cont++;
			}
		}
		return cont;
	}
}
