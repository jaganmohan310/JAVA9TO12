# JAVA9VTO12V
java features
-----------------
Java 9 Features :
---------------
Try with Resource Enhancement
Private Methods interfaces
Factory Methods for Collections 
Stream Enhancement
JPMS/jigsaw : for modularity
Jlink (Java linker)
SafeVarags Enhancement
Process API updated

Private Methods interfaces:
---------------------------
Inroduced in Java 9
By deafault all methods in an interface are public
From Java9 , we can declare private methods
Why private method in ineterface

Try with Resource Enhancement :
-----------------------------
What is the enhancement in java 9
  - Resource can be delcare outside try

Stream Enhancement :
-----------------------
Streams Introduced in Java8
Java 9 has introduced new methods 
    -takeWhile
	-dropWhile
	-ofNullable
takeWhile :
   -It will stop if condition is false for any value
   -It may or may not take all values in the collections
dropWhile :
    -It will start if conditionis false for any value
ofNullable :
    -It prevents the Nullpointer Exception	
	
	
Process API updates :
--------------------
Before Java9 :
-------------
  -Communicating to processor / OS from java program was difficult 
  -we have to write lenghty code
  -we have to depend on native code or 3rd Party APIs
  -Hence Java was not the best choice for system programing 

From Java 9:
------------
  -communicating to the processor / OS from java program is very easy
  -we have to write couple of lines of code
  - No need to depend on native code or 3rd Party APIs
  - Java is the best choice for system programing

-Get PID of process from java
-Create process from java
-Destory Process from java
-Get process Handle from java
-Wait for process to terminate
-Get Process information
-Get the Parent deatils of the process
-Get the children deatils of the process


Jshell :
-------
Jshell is toll for writing a small program directly on coomand prompt without creating any class

System.out.println("hello");

import class :

import java.time.LocalDate;
LocalDate localDate =  LocalDate.now();

JPMS :
-----------
- Java PlatForm Module System
- JigSaw is a project name of JPMS
-introduced in Java9 -2017
-development was started in the year 2005

The main purpose of JPMS is modularity
Before jav9 , java application development was based on jars
From java 9, java application development is based on modules

UseCase 1# :
--------
Suppose we are creating a java application which requires only 5 java classes from rt.jars

 we need complete rt.jar
 
 rt.jar around 61000 kb 

It is difficult to run on small devices, for this reason rt.jar multipule modules here which modules 
we require that particular modules


UseCase # 2
-------------

-Suppose your application contains 500 java classes
-From java9
  - Divide 500 java classes into small modules(50,10,5)
  -Third party wants to use 1 java class from our jar file, then ?
  
Jar is group of packages

jar ->
    classes + interfaces
Module ->
      classes + Interfaces + configuration Data
module-info.java	  
	 module helloModule {
          requires java.base;
		  requires java.sql;
		  exports com.xyz;
		  
}	 
	
compile :
       --module-path out -m helloModule/mypackage.HelloDemo
	   javac --module-source-path -d out -m helloModule/mypackage.HelloDemo
JLink :
----------

jlink : Java Linker
Inroduced in Java9
Jlink allow us to create custom/own JRE

WHY Custom JRE :

-Suppose your application conatains only 5 java files
- To run this small application , we need to install complete JRE which conatins hundreds of classes

- Size of the deafault JRE is about 200mb 

Problems with deafault JRE :
------------------------------
-Memory Wastage 
-Default JRE is not recomended for small devices or IOT devices
-java is not the best choice for small devices until java8

jlink --module-path out --add-modules helloModule,java.base --output jretest2



Java 10 introduction :
-------------------
-Released in March 2018
-Most of the changes in Java 10 are housekeeping releated and performance related
From a Java program perspective, there are no significant chnages except var type inference

- Type inference with with local varibale 'var'
- Consolidate the JDK forest into a single repository 
-Garbage-Collector Interface
-Parallel Full GC for G1
-Heap Allocation on Alternative Memory Devices 
-Removed javah
-Root Certificates

Type Inference with var :
--------------------------
- It reduces the verbosity of the java language
- It helps to infer data type implicity


Refer Version Demo :
------------------
Evry 6 months java new version will be released 
JAVA Version - LTS

Consolidate The JDK Forest Into Single Repository :
--------------------------------------------------
-corba
-jdk
-hotspot
-jaxp
-jaxws
-langtools
-nashorn
-oot --
This is mainly housekeeping activity


Experimental Java-Based JIT Compiler (Graal)
---------------------------------------------
- Avalible on Linux OS once it is success then it will avalible in windows and mac
-To improve the performance

Enabling Java-Based JIT compiler/Grall :
-----------------------------------------
-XX:+UnlockExperimentalVMOptions - XX:+UseJVMCICompiler 

Java 10 Other features :
------------------------------
- 1. Garbage-Collector Interface 
-------------------------------------
This interface improves the source code isolation of different garbage colletors 

- 2. Parallel Full GC for G1 :
--------------------------------
- This feature improves G1 worst-case latencies by making the full GC-parallel

-3. Heap Allocation on Alternative Memory Devices 
-----------------------------------------------
This feature enable HotSpot VM to allocate heap on alternative devices specified by the user
-4. Javah
-----------------------------------------------------
-Javah has been removed in java 10
-javac will do the task of javah

Note:
-------
The javah command generates C header and source files that are needed to implement native methods. The generated header and source files are used by C programs to reference an object's instance variables from native source code. The .h file contains a struct definition with a layout that parallels the layout of the corresponding class. The fields in the struct correspond to instance variables in the class.

The name of the header file and the structure declared within it are derived from the name of the class. When the class passed to the javah command is inside a package, the package name is added to the beginning of both the header file name and the structure name. Underscores (_) are used as name delimiters.

By default the javah command creates a header file for each class listed on the command line and puts the files in the current directory. Use the -stubs option to create source files. Use the -o option to concatenate the results for all listed classes into a single file.

The Java Native Interface (JNI) does not require header information or stub files. The javah command can still be used to generate native method function prototypes needed for JNI-style native methods. The javah command produces JNI-style output by default and places the result in the .h file.

Root Certificates :
-----------------------
- Java 10 provides a deafault set of root certification Authority (CA)

Features Removed in Java 11:
--------------------------------
I am categorized into 4 types:

1.modules
2.classes
3.methods
4.Tools

Modules Remved in Java 11:
-----------------------------
-java.corba
-jdk.snmp
-java.xml.ws
-java.xml.bind
-javaFx module

Classes Removed in Java 11 :
--------------------------------
 -com.sun.awt.AWTUtilities
 -sun.misc.Unsafe.defineClass -
 
Methods Removed in Java 11 :
-------------------------------
- Thread.destroy()
-Thread.stop(Throwable)

Tools Removed In Java 11 :
--------------------------
- appletviewer Launcher 
-wsimport
-wsgen
-schemagen
-xjc -


How to handle Strings In java 11 :
-----------------------------------
-repeat(n)
-isBlank()
-lines()
-strip()
-stripLeading()
-stripTrailing()

Nashorn :
------------
- Nashorn is a JavaScript Engine
- Nashorn is used for calling JavaScript Function from Java
- Nashorn has been deprecated in Java 11
- Intent is to remove Nashorn in a future release

HTTP Client :
-------------
- Introduced in Java9
- jdk.incubator.http --> java.net.http
- HTTPClient is used for calling webservices from Java

Calling Web Services From Java before Java 9 :
---------------------------------------------
- RestTemplate(Spring)
-HttpClient(Apche,Google)
-HttpURLConnection(Java) - Lots of problem


Refer code :

HttpClientDemo 

HTTP Client Avantages :
---------------------------
-Aviod dependency on third-party libraries 
-It is very Simple
-Can Send both text and binary data
-We can send multiple request 
-Supports both Synchronous and asynchronous communication


Lambda Enhancements In Java 11
-----------------------------------
Inroduced in Java8
Java 11 introduces couple of enhancement to Lambda expression

Java 12:
-----------------
SwitchExpressionDemo
SwitchExpressionWithoutBreakDemo
SwitchExpressionMultiCaseDemo
SwitchExpressionAssignment
SwitchExpressionAssignmentDemo
StringHandlingDemo




 




 

	
  