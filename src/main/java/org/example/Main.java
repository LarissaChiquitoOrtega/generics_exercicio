package org.example;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Teste usando a classe para comparar e ordenar String
        String[] arrayNomes = {"Larissa", "Gabriela", "Marcelo", "Lucimary"};
        List<String> nomesOrdenados;
        nomesOrdenados = MyOwnLists.asListedSorted(arrayNomes,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(nomesOrdenados);

        //Teste usando a classe para comparar e ordenar Integer
        Integer[] arrayNumerico = {5, 10, 5, 1};
        List<Integer> numerosOrdenados;
        numerosOrdenados = MyOwnLists.asListedSorted(arrayNumerico,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(numerosOrdenados);
    }
}