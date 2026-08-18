# reflection points (18/08/2026) 
1. the unit of length in code is pixels
2. programming has sensible defaults
3. if the centre and length are given, the first thing we do is figure out the starting point (usually, top-left or upper-left point)
4. to find the upper-left coordinate, given that the centre is c, we calculate *(cx - l/2, cy - l/2)*
5. to find the lower-left coordinate, given that centre is c, we calculate *(cx - l/2, cy + l/2)*
6. to find the upper-right coordinate, given that centre is c, we calculate *(cx + l/2, cy - l/2)*
7. to find the lower-right coordinate, given that centre is c, we calculate *(cx + l/2, cy + l/2)*
8. pom is project object model
9. A .gitignore file tells git which files or folders to ignore, meaning they won't get tracked, added, or pushed to github even if they're sitting in your project folder.
10. under src folder on github, we have test and main. we do not ship test, but we do so with main
11. under main, we have java
12. why java? because we can potentially have other languages
13. under java, we have the actual package
14. under main, where we have java, we can also have resources. these are files which can be bundled with the application
15. an object field (also called an instance field) belongs to each individual object you create. every object gets its own separate copy
16. a static field belongs to the class itself, not to any one object. all objects share the same single copy
