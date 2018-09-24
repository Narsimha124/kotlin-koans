package i_introduction._1_Java_To_Kotlin_Converter;

import util.JavaCode;

import java.util.Collection;
import java.util.Iterator;

public class JavaCode1 extends JavaCode {
    public String task1(Collection<Integer> collection) {
        System.out.print(collection);

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<Integer> iterator = collection.iterator();
        System.out.print("iterator is: "+iterator .toString());
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("}");
       // System.out.print("Add list of Set elements:  "+sb.toString());
        return sb.toString();
    }
}