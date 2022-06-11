package com.java.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<String>();

        listOfNames.add("Java");
        listOfNames.add("Python");
        listOfNames.add("AI");

        boolean dublicateAdd = listOfNames.add("Java");
        System.out.println("dublicateAdd:"+dublicateAdd);

        listOfNames.add(1,"Spring");
        listOfNames.add(5,"ML");

        //listOfNames.add(7,"Blockchain") //IndexOutOfBoundsException;

        ArrayList<String>listOfNames1 = new ArrayList<>();
            listOfNames1.add("Learning");

        //public boolean addAll(java.util.Collection<? extends E>);
        listOfNames.addAll(listOfNames1);
        System.out.println("listOfNames ArrayList elements:"+listOfNames);
        //public boolean addAll(int, java.util.Collection<? extends E>);
        ArrayList<String>listOfNames2 = new ArrayList<String>();
        //    listOfNames2.addAll(1,listOfNames1);  //Exception
        listOfNames2.add("Java2");
        listOfNames2.addAll(1,listOfNames1);
        System.out.println("listOfNames1 ArrayList elements:"+listOfNames1);
        System.out.println("listOfNames2:"+listOfNames2);

   //remove methods
        //public boolean remove(java.lang.Object);
        System.out.println("listOfNames Before remove:"+listOfNames);
        listOfNames.remove("Java");
        System.out.println("listOfNames After remove:"+listOfNames);
        System.out.println("Trying to Remove non existing Object:"+listOfNames2.remove("abcd"));
        //public E remove(int);
        System.out.println("listOfNames Before Index remove:"+listOfNames);
        listOfNames.remove(0);
        listOfNames.remove(2);
        System.out.println("listOfNames After Index remove:"+listOfNames);
        //public boolean removeAll(java.util.Collection<?>);
        ArrayList<String> removeList = new ArrayList<>();
        listOfNames.add("Java");
        listOfNames.addAll(listOfNames1);
        System.out.println("listOfNames Before removeAll:"+listOfNames);
        removeList.add("Java");
        removeList.add("Learning");
        System.out.println("removeList :"+removeList);
        System.out.println(listOfNames.removeAll(removeList));
        System.out.println("listOfNames After removeAll:"+listOfNames);
        System.out.println("Trying to do  removeAll again:"+listOfNames.removeAll(removeList));
        //public boolean removeIf(java.util.function.Predicate<? super E>);
        //removeIf(Predicate<? super E> filter)
        listOfNames2.addAll(listOfNames);
        System.out.println("listOfNames2 Before removeIf:"+listOfNames2);
        System.out.println(listOfNames2.removeIf(name->(name.startsWith("A"))));//all String methods applicable for 'name'
        System.out.println("listOfNames2 After removeIf:"+listOfNames2);

        // public E get(int);
        System.out.println(listOfNames2.get(1));

        //public E set(int, E);??
            System.out.println("listOfNames2 before set:"+listOfNames2);
            System.out.println(listOfNames2.set(1,"Python2"));//o/p->Learning
            System.out.println("listOfNames2 after set:"+listOfNames2);

        //public int indexOf(java.lang.Object);
        System.out.println("indexOf:"+listOfNames2.indexOf("Python"));
        //public int lastIndexOf(java.lang.Object);
            listOfNames2.add("Java2");
            System.out.println("lastIndexOf:"+listOfNames2.lastIndexOf("Java2"));

        //public void sort(java.util.Comparator<? super E>);
            listOfNames2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
                }
            });
            System.out.println("listOfNames2 after sort:"+listOfNames2);

            ArrayList<String>listOfNames3 = new ArrayList<>();
                listOfNames3.add("D");
                listOfNames3.add("B");
                listOfNames3.add("A");
                listOfNames3.add("C");
   //         listOfNames3.sort(String::compareTo);
            listOfNames3.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return 0;
                }
            });
        System.out.println("After sort listOfNames3:"+ listOfNames3);
        //subList
        System.out.println("sublist:"+listOfNames3.subList(1,2));

        // public java.lang.Object[] toArray();
        Object[] namesArray = listOfNames2.toArray();
        System.out.println("namesArray:"+namesArray); //[Ljava.lang.Object;@5b480cf9
        for (Object obj:namesArray){
            System.out.println("namesArray Objects:"+obj);
        }
//       'Object' class can not be cast to 'String' class, because Object is top most class.
//        String[] namesArray1 = (String[]) listOfNames2.toArray();
//        System.out.println("namesArray1:"+namesArray1); //[Ljava.lang.Object;@5b480cf9
//        for (String str:namesArray1){
//            System.out.println("namesArray Objects:"+str);
//        }

        //  public <T> T[] toArray(T[]);public T[] toArray(T[] a)
        String[] namesArray2 = new String[listOfNames2.size()];
        namesArray2 = listOfNames2.toArray(namesArray2);
        System.out.println("String namesArray2:");
        for (String str:namesArray2){
            System.out.println(str);
        }
        //
        System.out.println("size:"+listOfNames2.size());
        listOfNames2.ensureCapacity(20);
        System.out.println("ensureCapacity:"+listOfNames2.size());
        ArrayList<String>listOfNames4 = new ArrayList<>(20);
        System.out.println("listOfNames4 size:"+listOfNames4.size());
        listOfNames4.add("Sreenivas"); listOfNames4.add("Patturi");
        listOfNames4.trimToSize();
        System.out.println("trimToSize:"+listOfNames4.size());
        System.out.println("isEmpty:"+listOfNames.isEmpty());
        System.out.println("contains:"+listOfNames2.contains("Python"));

     //??   System.out.println("indexOfRange:"+ listOfNames2.indexOfRange("Java2",0,3));

        //public void replaceAll(java.util.function.UnaryOperator<E>);
        listOfNames2.replaceAll(name->name.toUpperCase());
        System.out.println("After replaceALL:"+listOfNames2);
//        listOfNames2.replaceAll(names->names.replaceAll("J","Z"));
//        System.out.println("After replaceALL2:"+listOfNames2);

     //public boolean retainAll(java.util.Collection<?>);
        System.out.println("listOfNames:"+listOfNames);
        System.out.println("listOfNames2:"+listOfNames2);
        listOfNames2.retainAll(listOfNames);
        System.out.println("listOfNames2 after retainAll:"+listOfNames2);

     //public java.lang.Object clone();
        ArrayList<String>list2Clone = (ArrayList<String>) listOfNames2.clone();
        System.out.println("list2Clone:"+list2Clone);
    }
}
