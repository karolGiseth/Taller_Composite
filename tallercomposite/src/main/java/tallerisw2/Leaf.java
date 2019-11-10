package tallerisw2;

public class Leaf extends Component {

	public Leaf(String name, int identificador) {
		super(name, identificador);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addComponente(Component a) {
		// TODO Auto-generated method stub
		
		System.out.println("No se pueden añadir mas elementos, es una hoja");
		
	}

	@Override
	void remove(Component a) {
		// TODO Auto-generated method stub
		
		System.out.println("No se pueden eliminar  elementos, es una hoja");
		
	}

	@Override
	void operation(int a) {
		// TODO Auto-generated method stub
		
		System.out.println("La hoja es: "+ name + " " + identificador);	
		
		
	}
	

}
