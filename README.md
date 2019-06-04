
## Welcome to H4
### To build and run 
0. Set JAVA_HOME environment variable

    a) (Windows) Follow directions at https://javatutorial.net/set-java-home-windows-10
    
    b) (OSX) add the following to your ~/.bash_profile
        `export JAVA_HOME=$(/usr/libexec/java_home)` 
1.  `cd h2`
2.  a) (Windows) `build jar`

    b) (Unix/Windows) `./build.sh jar`
    
    c) (OSX) `./build.sh` then `./build.sh jar`
3. `cd bin`
4. `java -jar h2-1.4.199.jar`

### To Test
0. Use IntelliJ IDEA to open the repository.

1. Run "java insertTables.java > commands.sql" in a terminal inside the dbms repository

2. Run Main.java in IntelliJ and the time will be output below 

Notes:
*** Index recommendations ***
Features to implement:
1. Log sql statements
2. Parse sql statements and check for frequent table and column
