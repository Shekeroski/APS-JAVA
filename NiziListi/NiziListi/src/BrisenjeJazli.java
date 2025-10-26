package Listi.SLL;
import java.util.Scanner;
public class BrisenjeJazli {
    public static void Brisenje(SLL<Integer> lista){
        SLLNode<Integer> tmp = lista.getFirst();
        SLL<Integer> listanova = new SLL<Integer>();
        int cekor=1;
        int t=cekor;
        boolean flag=false;
        while(tmp!=null && tmp.succ!=null) {
            for (int i = 0; i < cekor; i++) {
                listanova.insertLast(tmp.element);
                if (t == 1) {
                    flag = true;
                }else{
                    flag=false;
                }
                if (!flag) {
                    if(t>0){
                        t--;
                        tmp=tmp.succ;
                    }
                }
            }
            tmp = tmp.succ.succ;
            cekor++;
            t=cekor;
        }
        System.out.println(listanova.toString());
    }
    public static void main(String[] args){
        SLL<Integer> lista = new SLL<Integer>();
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            lista.insertLast(input.nextInt());
        }
        Brisenje(lista);
    }
}
