package tallerisw2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iniciar();
	}

	public static void iniciar() {
		Component raiz = new Composite("Raiz", 0);

		Component animalia = new Composite("Animalia", 0);
		raiz.addComponente(animalia);

		Composite chordate = new Composite("Chordate", 1);
		Composite arthropoda = new Composite("Arthropoda", 2);

		animalia.addComponente(chordate);
		animalia.addComponente(arthropoda);

		Composite mammal = new Composite("Mammal", 3);
		Composite insect = new Composite("Insect", 4);

		chordate.addComponente(mammal);
		arthropoda.addComponente(insect);

		Composite primate = new Composite("Primate", 5);
		Composite carnivora = new Composite("Carnivora", 6);
		Composite diptera = new Composite("Diptera", 7);

		mammal.addComponente(primate);
		mammal.addComponente(carnivora);
		insect.addComponente(diptera);

		Composite hominidae = new Composite("Hominidae", 8);
		Composite pongidae = new Composite("Pongidae", 9);
		Composite felidae = new Composite("Felidae", 10);
		Composite muscidae = new Composite("Muscidae", 11);

		primate.addComponente(hominidae);
		primate.addComponente(pongidae);
		carnivora.addComponente(felidae);
		diptera.addComponente(muscidae);

		Composite homo = new Composite("Homo", 12);
		Composite pan = new Composite("Pan", 13);
		Composite felis = new Composite("Felis", 14);
		Composite musca = new Composite("Musca", 15);

		hominidae.addComponente(homo);
		pongidae.addComponente(pan);
		felidae.addComponente(felis);
		muscidae.addComponente(musca);

		Composite sapiens = new Composite("Sapiens", 16);
		Composite troglodytes = new Composite("Troglodytes", 17);
		Composite domestica_felis = new Composite("Domestica-Felis", 18);
		Composite leo = new Composite("Leo", 19);
		Composite domestica_musca = new Composite("Domestica-Musca", 20);

		homo.addComponente(sapiens);
		pan.addComponente(troglodytes);
		felis.addComponente(domestica_felis);
		felis.addComponente(leo);
		musca.addComponente(domestica_musca);

		Component human = new Leaf("Human", 21);
		Component chimpanzee = new Leaf("Chimpanzee", 22);
		Component houseCat = new Leaf("House Cat", 23);
		Component lion = new Leaf("Lion", 24);
		Component housefly = new Leaf("Housefly", 25);

		sapiens.addComponente(human);
		troglodytes.addComponente(chimpanzee);
		domestica_felis.addComponente(houseCat);
		leo.addComponente(lion);
		domestica_musca.addComponente(housefly);

		raiz.operation(0);
		
		System.out.println("\n");
		chordate.listarRama(chordate);

	}

}
