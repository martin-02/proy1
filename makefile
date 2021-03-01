compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin	
ejecutar:compilar
	java -cp bin aplicacion.Principal 1000000
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm ap-personas.jar Manifest.txt -C bin .
