package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        
        List<String>list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Alex");
        list.add("Anna");
        list.add("Bob");
        list.add(4,"Novembro");
        
        System.out.println(list.size());
        
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("------------------");
        list.removeIf(x -> x.charAt(0)=='M');
         for (String x : list){
            System.out.println(x);
         }
         System.out.println("------------------");
         System.out.println("Index of Bob:"+ list.indexOf("Bob"));
         System.out.println("Index of Novembro:" + list.indexOf("Novembro"));
         
         System.out.println("------------------");
         List<String> resultado=list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
         for (String x : list){
            System.out.println(x);
         }
         System.out.println("------------------");
         String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElseGet(null);
         System.out.println(name);
        
      }
    }