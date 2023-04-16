#!/bin/bash

####****** COMPILE JAVA PROGRAM WITH JAVAC ******####
# YOU CAN RUN:
#  bash w.sh file.java
#  bash w.sh file1.java file2.java ...
#  bash w.sh *.java



set -e 
javac $@
# execute the program
java Main
