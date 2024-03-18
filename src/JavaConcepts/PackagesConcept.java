package JavaConcepts;

// Packages : collection of classes, its just a folder, compartments for our classes

import ArraysAndArraylists.Practice;
// for using methods from other classes, from other packages, we need to import that class into our program
// the methods or classes that are decalred as public, only those methods we can be able to be access outside the package

// BUT -> if files are in the same package then we don't have to import it

public class PackagesConcept {
    public static void main(String[] args) {
        A a = new A("Abhi");
        Practice practice = new Practice();
    }
}
