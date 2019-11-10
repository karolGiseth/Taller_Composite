package tallerisw2;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	public Composite(String name, int identificador) {
		super(name, identificador);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addComponente(Component a) {
		// TODO Auto-generated method stub

		hijos.add(a);

	}

	@Override
	void remove(Component a) {
		// TODO Auto-generated method stub

		hijos.remove(a);
	}

	@Override
	void operation(int a) {
		// TODO Auto-generated method stub
		System.out.println("El nombre es: " + name + " " + identificador);

		for (int i = 0; i < hijos.size(); i++) {

			hijos.get(i).operation(a++);

		}

	}

	public void listarRama(Composite c) {
		System.out.println("El nombre: " + name + " id:" + identificador);
		for (int i = 0; i < hijos.size(); i++) {

			System.out.println(hijos.get((i-1)/2).name);

		}
	}

	private List<Component> hijos = new ArrayList<Component>();

}
