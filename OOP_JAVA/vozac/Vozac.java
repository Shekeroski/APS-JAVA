public class Vozac {
    protected String name;
    protected Integer years;
    protected boolean isVeteran;
    protected Integer numberOfRaces;

    public Vozac(String name,Integer years,boolean isVeteran,Integer numberOfRaces){
        this.name=name;
        this.years=years;
        this.isVeteran=isVeteran;
        this.numberOfRaces=numberOfRaces;
    }
    public double zarabotuvacka(){
        return 0;
    }
    public double danok(){
        return 0;
    }

    @Override
    public String toString() {
        return "Vozac" +
                " " + name + '\'' +
                ", years " + years +
                (isVeteran ? "Veteran":"")+" "+
                ", numberOfRaces=" + numberOfRaces + " ";
    }
    public boolean IstaZarabotuvacka(Vozac v){
        return Double.compare(this.zarabotuvacka(),v.zarabotuvacka())==0;
    }
}
class utility{
    public static int SoIstaZarabotuvacka(Vozac[] vozaci,int n,Vozac v){
        int count=0;
        for(int i=0;i<n;i++){
            if(vozaci[i].IstaZarabotuvacka(v)){
                count++;
            }
        }
        return count;
    }
}
