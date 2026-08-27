# reflection points (27/08/2026)
1. swing is java's built-in toolkit for building desktop guis (windows, buttons, menus, etc). it's pure java, so it looks and works the same on any os.
2. `mvn javafx:run` is a maven command that compiles and launches a javafx app in one step, using the javafx maven plugin.
3. "install" copies your built project into your local maven repo (on your own machine), so other projects there can use it as a dependency.
4. a jar (java archive) is a zip file containing compiled java code (`.class` files), plus other resources like images or config files, packaged together so it can be run or shared as one file.
5. a `.class` file is the compiled version of your java code, created when you compile a `.java` file. it contains bytecode, which the java virtual machine (jvm) reads and runs.
6. a package in java groups related classes together, like a folder for code. it helps organize files and avoid naming conflicts.
7. a jar is the packaged output of your project, the actual compiled code bundled into one file that can run or be shared.

   a pom.xml is the config file for maven, it lists your project's dependencies, build settings, and instructions for how to build that jar. so pom.xml is the recipe, jar is the finished dish.
8. integration means combining different pieces of code or systems so they work together properly, like connecting your app to a database or joining code from different developers.
9. deployment means taking your finished app and putting it on a server or platform where real users can actually access and use it.
10. cd means "change directory", it's the terminal command to move into a different folder.
11. git pull downloads new changes from a remote repo and merges them into your local copy, so your files match the latest version.
12. an artifact usually means the file(s) produced by building a project, like a jar file, war file, or compiled binary. it's the "output" of your build process.
13. a character set (charset) is a system that maps characters (letters, numbers, symbols) to numeric codes, so computers can store and display text. example: utf-8 is a common charset that can represent almost every language's characters.
14. mainly history. older charsets like ascii were built early and only covered english letters. as computing spread worldwide, different countries made their own charsets for their languages/scripts.

    utf-8 was created later to try to unify everything into one standard that covers almost all languages, and it's now the most widely used. but older systems and files still use the older charsets, so multiple ones still exist and stick around.
15. backward compatibility means new versions of software still work with old files, code, or systems, so upgrading doesn't break old stuff.
16. runtime compatibility means code can actually run correctly on the system/environment it's given, matching the versions and requirements it needs (like java version, libraries, etc).
17. junit is a testing framework for java, used to write and run automated tests that check if your code works correctly.
