guesser.class: guesser.java
	javac guesser.java

clean:
	rm guesser.class

run: guesser.class
	java guesser
