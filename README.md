
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

1. Run "java insertTables.java > inserts.sql" in a terminal inside the dbms repository

2. Run Main.java in IntelliJ to both create the tables and insert the tests.

3. Run "java insertSelections.java > commands.sql" to create both a commands.sql file with log statements for the modified H2 and a statements.sql file which just has the select statements

4. Using the H2 console, copy and paste the commands.sql file context into the console.

5. Enter "eval log" and view the terminal for suggestions on the index.

6. Use "clear log to clear the logged statements from the log file to reset for a fresh run."
