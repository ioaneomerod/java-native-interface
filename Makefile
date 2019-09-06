hw9.class: hw9.java
	javac hw9.java

hw9.h: hw9.class
	javah hw9

libhw9.so: hw9.c hw9.h
	gcc -ansi -pedantic-errors -Wall -I/usr/java/jdk1.8.0_131/include -I/usr/java/jdk1.8.0_131/include/linux -shared hw9.c -fPIC -o libhw9.so

hw9: libhw9.so hw9.h hw9.class
	java -Djava.library.path=. hw9

clean:
	rm *.so
	rm *.h
	rm *.class


