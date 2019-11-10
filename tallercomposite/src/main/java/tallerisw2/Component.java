package tallerisw2;

public  abstract  class Component  {
	
	 protected String  name;
	 
	 protected int identificador;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdentidicador() {
		return identificador;
	}

	public void setIdentidicador(int identidicador) {
		this.identificador = identidicador;
	}

	public Component(String name, int identidicador) {
		
		this.name = name;
		this.identificador = identidicador;
	}
	
	
	abstract  void  addComponente(Component a);
	
	
	abstract void remove(Component a);
	
	
	abstract void operation(int a);

}
