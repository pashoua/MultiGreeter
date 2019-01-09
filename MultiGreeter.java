package edu.metrostate.ics240.fx1.ppv393.greeter;

public class MultiGreeter {

	private String[] greetingString;
	private int greetCount;

	/**
	 * No-argument constructor
	 */
	public MultiGreeter() {
		greetingString = new String[5];
		greetCount = 0;
	}

	/**
	 * Returns the actual number of greetings added to this greeter.
	 * 
	 */
	public int getNumGreetings() {

		return greetCount;
	}

	/**
	 * Adds a greeting to this Greeter.
	 * 
	 * @param greeting
	 */
	public void addGreeting(String greeting) {

		if (greetCount<=5) {
			greetingString[greetCount] = greeting;
			greetCount++;
		}

	}

	/**
	 * Returns an array containing the greeting strings added to this Greeter
	 * 
	 * @return
	 */
	public String[] getGreetings() {

		return greetingString;
	}

	/**
	 * Returns a salutation in the form "greetingString, name!" where
	 * greetingString is one of the greeting strings displayed in sequence. If
	 * no greetings were added to the multiGreeter, the default greeting of
	 * "Hello" will be used. name is a provided name.
	 * 
	 * @param name
	 * @return
	 */
	public String greet(String name) {
		int i = 0;
		StringBuilder greeting = new StringBuilder();
		if (greetCount == 0) {
			greeting.append("Hello, " + name + "!");
		}
		if (greetCount > 0) {
			greeting.append(greetingString[i] + ", " + name + "!");
			i++;
		}
		return greeting.toString();
	}

	/**
	 * Returns salutation with default name of "World."
	 * 
	 * @return
	 */
	public String greet() {
		int i = 0;
		StringBuilder greeting = new StringBuilder();
		if (greetCount == 0) {
			greeting.append("Hello, World!");
		}
		if (greetCount > 0) {
			greeting.append(greetingString[i] + ", World!");
			i++;
		}
		return greeting.toString();

	}

	public static void main(String[] args) {
		MultiGreeter m = new MultiGreeter();
		m.addGreeting("Nyob Zoo");
		m.addGreeting("Hola");
		m.addGreeting("Nee How");
		m.addGreeting("Sup");
		m.addGreeting("Hey There");
		System.out.println(m.greet("Paty"));
		System.out.println(m.greet("Bob"));
		System.out.println(m.greet());
		System.out.println(m.getNumGreetings());
		for (String str : m.getGreetings()) {
			System.out.println(str);
		}
	}
}
