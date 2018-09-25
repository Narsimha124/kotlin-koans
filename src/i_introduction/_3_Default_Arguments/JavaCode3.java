package i_introduction._3_Default_Arguments;

import util.JavaCode;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class JavaCode3 extends JavaCode {
    private int defaultNumber = 42;

    public String foo(String name, int number, boolean toUpperCase) {
        System.out.print("name is: "+name+ "number is: "+number+ "toUpperCase is: "+toUpperCase);
        return (toUpperCase ? name.toUpperCase() : name) + number;
    }

    public String foo(String name, int number) {
        System.out.print("name is: "+name+ "number is: "+number);
        return foo(name, number, false);
    }

    public String foo(String name, boolean toUpperCase) {
        System.out.print("name is: "+name+ "toUpperCase is: "+toUpperCase);
        return foo(name, defaultNumber, toUpperCase);
    }

    public String foo(String name) {
        return foo(name, defaultNumber);
    }
}