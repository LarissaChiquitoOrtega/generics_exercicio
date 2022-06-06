package org.example;

import java.util.*;

public class MyOwnLists <T extends Comparable<T>>{

    public static <T extends Comparable<T>>List<T> asListedSorted(T[] valores, Comparator<T> comparator){
        //transformando o array em uma lista
        List<T> lista = Arrays.asList(valores);
        //usando o comparator na ordenação da lista
        lista.sort(comparator);

        return lista;
    }

}
