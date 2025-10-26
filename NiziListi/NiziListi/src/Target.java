package Listi.SLL;

public class Target {
    public static void dodadiTarget(SLL<String> list,int l){
       SLLNode<String> tmp = list.getFirst();
       String s = "Target";
       while(tmp!=null){
           if(tmp.element.length()==l){
               list.insertAfter(s,tmp);
           }
           tmp=tmp.succ;
       }
        SLLNode<String> first = list.getFirst();
       String rez="";
       while(first!=null){
           rez+= first.element;
           if(first.succ!=null){
               rez+="->";
           }
           first=first.succ;
       }
       System.out.println(rez);
    }
    public static void main(String [] args){
        SLL<String> lista = new SLL<>();
        lista.insertLast("Sky");
        lista.insertLast("Cloud");
        lista.insertLast("Cloud");
        int n=5;
        dodadiTarget(lista,5);
    }
}
