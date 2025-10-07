import java.util.Scanner;

public class mainVozac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("vnesi broj na vozaci: ");
        int n= input.nextInt();
        input.nextLine();
        Vozac [] vozaci=new Vozac[n];
        for(int i=0;i<n;i++){
            System.out.println("vnesi tip na vozac za avtomobilist 'A', za motociklist 'M' ");
            String tip= input.nextLine().toUpperCase();
            System.out.println("vnesi ime na vozac: ");
            String ime= input.nextLine();
            System.out.println("vnesi godini na vozac: ");
            int godini=input.nextInt();
            input.nextLine();
            System.out.println("Broj na trki: ");
            int brojTrki = input.nextInt();
            input.nextLine();
            System.out.print("Veteran? (true/false): ");
            boolean veteran = input.nextBoolean();
            input.nextLine();
            if(tip.equals("A")){
                System.out.println("vnesi cena na avtomobilot: ");
                double cenaavtomobil=input.nextInt();
                vozaci[i]=new Avtomobilist(ime,godini,veteran,brojTrki,cenaavtomobil);
            }else if(tip.equals("M")){
                System.out.println("vnesi moknost na motociklot");
                int power= input.nextInt();
                vozaci[i]=new Motociklist(ime,godini,veteran,brojTrki,power);
            }
            input.nextLine();
        }
        for(Vozac v : vozaci){
            System.out.println(v);
            System.out.printf("Zarabotuvacka po trka: %.2f | Danok: %.2f\n", v.zarabotuvacka(), v.danok());
            System.out.println("--------------------------------");
        }
        System.out.println("isti so prviot vozac: ");
        System.out.println(utility.SoIstaZarabotuvacka(vozaci,vozaci.length,vozaci[0]));
    }
}
