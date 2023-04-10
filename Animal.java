import java.util.ArrayList;

public class Animal {
	String name;
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.giveName();
		ввввйцвцйв
			алцджалжуцал
			алзуцлазщуцлазщуцлацу
		Kitten v = null;
		
		Dog a = new Dog();
		a.mas[0]=c;
		a.mas[0].sound();
		
		for (int i=0; i<3; i++){
			v = new Kitten();
			v.name="Котенок "+i;
			c.children[i]=v;
		}

		for (int i=0; i<3; i++){
			System.out.println(c.children[i].name);
		}
		
		Animal[] mas = new Animal[3]; // статический массив
		
		mas[0]=c;
		mas[1]=v;
		
		((Cat)mas[0]).sound();
		((Kitten)mas[1]).sound();
		
		ArrayList<Animal> al = new ArrayList<Animal>(); // Действительно динамический массив Java
		
		al.add(c);
		al.add(v);
		al.add(a);
		
		((Cat)al.get(0)).sound();
		((Kitten)al.get(1)).sound();
	
		//1. скачать VMbox
		// 2. установить linux
		//3. скопировать .class file на эту машину
		//4. java Animal
	}
}
