package segregacao_interface;



public class Programa {
	public static void main(String[] args) {
		IItemBiblioteca item = new Filme();
		IItemBiblioteca item2 = new Livro();
		IItemBiblioteca item3= new LivroAudio();
		IItemBiblioteca item4 = new LivroConsulta();
	}
	
	

}
