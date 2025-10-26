package Listi.SLL;

import java.util.Scanner;

public class ZameniSosedi {
    public static void ZamenaNaDvaSosedi(SLL<Integer> lista){
        SLLNode<Integer> tmp = lista.getFirst();
        while(tmp!=null && tmp.succ!=null){
            Integer swap=tmp.element;
            tmp.element=tmp.succ.element;
            tmp.succ.element=swap;
            tmp=tmp.succ.succ;
        }
        System.out.println(lista.toString());
    }
    public static void main(String [] args){
        SLL<Integer> list = new SLL<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            list.insertLast(input.nextInt());
        }
        ZamenaNaDvaSosedi(list);
    }
}
