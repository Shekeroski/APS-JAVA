public class SLLNode <E>{
    protected E element;
    protected SLLNode<E> succ;
    public SLLNode(E elem,SLLNode<E> succ){
        this.element=elem;
        this.succ=succ;
    }
    public static class SLL<E>{
        private SLLNode<E> first;
        public SLL(){
            this.first= null;
        }

        public void insertFirst(E o){
            SLLNode<E> ins = new SLLNode<E>(o,null);
            ins.succ = first;
            first=ins;
        }

        public void insertLast(E o){
            if(first!=null){
                SLLNode<E> tmp=first;
                while(tmp.succ!=null){
                    tmp=tmp.succ;
                }
                tmp.succ=new SLLNode<E>(o,null);
            }else{
                insertFirst(o);
            }
        }

        public void insertAfter(E o,SLLNode<E> node){
            if(node!=null){
                SLLNode<E> ins = new SLLNode<E>(o,node.succ);
                node.succ=ins;
            }else{
                System.out.println("Dadeniot jazel e null");
            }
        }

        public void insertBefore(E o, SLLNode<E> before){
            if(first!=null){
                SLLNode<E> tmp=first;
                if(first==before){
                    this.insertFirst(o);
                    return;
                }
                while(tmp.succ!=before && tmp.succ!=null){
                    tmp=tmp.succ;
                    if(tmp.succ==before){
                        tmp.succ = new SLLNode<E>(o,before);
                    }else{
                        System.out.println("Elementot ne postoi vo listata");
                    }
                }
            }else{
                System.out.println("Listata e prazna");
            }
        }

        public E deleteFirst(){
            if(first!=null){
                SLLNode<E> tmp = first;
                first=first.succ;
                return tmp.element;
            }else{
                System.out.println("Listata e prazna");
            }
            return null;
        }

        public E delete(SLLNode<E> node){
            if(first!=null){
                SLLNode<E> tmp = first;
                if(first==node){
                    return this.deleteFirst();
                }
                while(tmp.succ != node && tmp.succ.succ!=null){
                    tmp=tmp.succ;
                    if(tmp.succ==node){
                        tmp.succ=tmp.succ.succ;
                        return node.element;
                    }else{
                        System.out.println("Elementot ne postoi");
                        return null;
                    }
                }
            }else{
                System.out.println("Listata e prazna");
            }
            return null;
        }

        public int size(){
            int listSize=0;
            SLLNode<E> tmp = first;
            while(tmp!= null){
                listSize++;
                tmp=tmp.succ;
            }
            return listSize;
        }

        public SLLNode<E> find(E o){
            if(first!=null){
                SLLNode<E> tmp = first;
                while(!tmp.element.equals(o) && tmp.succ!=null){
                    tmp=tmp.succ;
                }
                if(tmp.element.equals(o)){
                    return tmp;
                }else{
                    System.out.println("Elementot ne postoi vo listata");
                }
            }else{
                System.out.println("listata e prazna");
            }
            return null;
        }

        public String toString(){
            String result="[";
            SLLNode<E> tmp = first;
            while(tmp!=null){
                result+=tmp.element;
                if(tmp.succ!=null){
                    result+=",";
                }
                tmp=tmp.succ;
            }
            result+="]";
            return result;
        }

    }
    public static void main(String[] args){
        SLL<Integer> lista = new SLL<Integer>();
        lista.insertLast(5);
        System.out.println("Listata po vmetnuvanje na 5 kako posleden element");
        System.out.println(lista.toString());
        lista.insertFirst(3);
        System.out.println("Listata po vmetnuvanje na 3 kako prv element");
        System.out.println(lista.toString());
        lista.insertLast(1);
        System.out.println("Listata po vmetnuvanje na 1 kako posleden element");
        System.out.println(lista.toString());
        lista.deleteFirst();
        System.out.println("Listata po brisenje na 1-iot element");
        System.out.println(lista.toString());
        SLLNode<Integer> pom = lista.find(5);
        lista.insertBefore(2,pom);
        System.out.println("Listata po vmetnuvanje na 2 pred 5");
        System.out.println(lista.toString());
    }
}