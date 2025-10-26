package Listi.SLL;

import java.util.Scanner;

public class RazdeliLista {
    public static void Razdeli(SLL<Integer> lista){
        SLL<Integer> lista1 = new SLL<Integer>();
        SLL<Integer> lista2= new SLL<Integer>();
        SLLNode<Integer> tmp = lista.getFirst();
        while(tmp!=null && tmp.succ!=null){
            if(tmp.element%2==0){
                if(tmp.succ.element%2!=0){
                    lista2.insertLast(tmp.element);
                }else{
                    lista2.insertLast(tmp.succ.element);
                }
            }else{
                if(tmp.succ.element%2==0){
                    lista1.insertLast(tmp.element);
                }else{
                    lista1.insertLast(tmp.succ.element);
                }
            }
            tmp=tmp.succ.succ;
        }
        System.out.println("neparni: "+lista1.toString());
        System.out.println("parni: "+lista2.toString());
    }
    public static void main(String[] args){
        SLL<Integer> lista = new SLL<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            lista.insertLast(input.nextInt());
        }
        Razdeli(lista);
    }
}
