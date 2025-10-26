package Listi.SLL;
import java.util.Scanner;
public class NaizmenicnoSpoiListi {
    public static void SpoiListi(SLL<Integer> lista1,SLL<Integer> lista2){
        SLLNode<Integer> tmp1 = lista1.getFirst();
        SLLNode<Integer> tmp2 = lista2.getFirst();
        SLL<Integer> lista3 = new SLL<Integer>();
        while(tmp1!=null && tmp1.succ!=null && tmp2!=null && tmp2.succ!=null){
            lista3.insertLast(tmp1.element);
            lista3.insertLast(tmp1.succ.element);
            lista3.insertLast(tmp2.element);
            lista3.insertLast(tmp2.succ.element);
            tmp1=tmp1.succ.succ;
            tmp2=tmp2.succ.succ;
        }
        while(tmp1!=null){
            lista3.insertLast(tmp1.element);
            tmp1=tmp1.succ;
        }
        while(tmp2!=null){
            lista3.insertLast(tmp2.element);
            tmp2=tmp2.succ;
        }
        System.out.println(lista3.toString());
    }
    public static void main(String[] args){
        SLL<Integer> lista1 = new SLL<Integer>();
        SLL<Integer> lista2 = new SLL<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            lista1.insertLast(input.nextInt());
        }
        int m = input.nextInt();
        for(int i=0;i<m;i++){
            lista2.insertLast(input.nextInt());
        }
        SpoiListi(lista1,lista2);
    }
}
