import java.util.Scanner;

class Contador {
	private int c;
	public Contador() {

		this.c = 0;
	}

	public synchronized void suma() {
		c++;
	}

	public synchronized int value() {
		return c;
	}

}

class Suma extends Thread {
	private Contador miCont;

	public Suma(Contador miCont) {
		this.miCont = miCont;
	}

	public void run() {
		for (int i = 0; i < 1000; i++)
			miCont.suma();
	}
}

class Oveja1 extends Thread {
	private Contador miCont;

	public Oveja1(Contador miCont) {
		this.miCont = miCont;

	}

	public void run() {
		String Palabra = "Mario come patatas";
		for (int x = 0; x < Palabra.length(); x++) {
			if ((Palabra.charAt(x) == 'a')) {
				miCont.suma();
			}

		}
	}
}

class Oveja2 extends Thread {
	private Contador miCont;

	public Oveja2(Contador miCont) {
		this.miCont = miCont;

	}

	public void run() {
		String Palabra = "Mario come patatas";
		for (int x = 0; x < Palabra.length(); x++) {
			if ((Palabra.charAt(x) == 'e')) {
				miCont.suma();
			}

		}
	}
}

class Oveja3 extends Thread {
	private Contador miCont;

	public Oveja3(Contador miCont) {
		this.miCont = miCont;

	}

	public void run() {
		String Palabra = "Mario come patatas";
		for (int x = 0; x < Palabra.length(); x++) {
			if ((Palabra.charAt(x) == 'i')) {
				miCont.suma();
			}

		}
	}
}

class Oveja4 extends Thread {
	private Contador miCont;

	public Oveja4(Contador miCont) {
		this.miCont = miCont;

	}

	public void run() {
		String Palabra = "Mario come patatas";
		for (int x = 0; x < Palabra.length(); x++) {
			if ((Palabra.charAt(x) == 'o')) {
				miCont.suma();
			}

		}
	}
}

class Oveja5 extends Thread {
	private Contador miCont;

	public Oveja5(Contador miCont) {
		this.miCont = miCont;

	}

	public void run() {
		String Palabra = "Mario come patatas";
		for (int x = 0; x < Palabra.length(); x++) {
			if ((Palabra.charAt(x) == 'u')) {
				miCont.suma();
			}

		}
	}
}

 
public class Ovejas {
	public static void main(String[] args) throws InterruptedException {
		String Palabra = "Mario come patatas";
		Contador miContador = new Contador();
		Oveja1 a = new Oveja1(miContador);
		Oveja2 e = new Oveja2(miContador);
		Oveja3 i = new Oveja3(miContador);
		Oveja4 o = new Oveja4(miContador);
		Oveja5 u = new Oveja5(miContador);
		a.start();
		e.start();
		i.start();
		o.start();
		u.start();
		a.join();
		e.join();
		i.join();
		o.join();
		u.join();
		System.out.println("El resultado final es: " + miContador.value());
	}
}