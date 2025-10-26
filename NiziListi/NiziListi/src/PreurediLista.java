package Listi.SLL;

import java.util.Scanner;

public class PreurediLista {
    public static void Preuredi(SLL<Integer> lista){
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> curr = tmp;
        SLL<Integer> listamin = new SLL<Integer>();
        SLL<Integer> listamax = new SLL<Integer>();
        int max=0,min=99;
        while(tmp!=null){
            if(tmp.element<min){
                min=tmp.element;
            }
            if(tmp.element>max){
                max=tmp.element;
            }
            tmp=tmp.succ;
        }
        while(curr!=null){
            if(curr.element-min<=max-curr.element){
                listamin.insertLast(curr.element);
            }else{
                listamax.insertLast(curr.element);
            }
            curr=curr.succ;
        }
        System.out.println(listamin.toString());
        System.out.println(listamax.toString());
    }
    public static void main(String[] args){
        SLL<Integer> lista = new SLL<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            lista.insertLast(input.nextInt());
        }
        Preuredi(lista);
    }
}
