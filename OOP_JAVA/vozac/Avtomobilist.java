public class Avtomobilist extends Vozac{
    private double priceAutomobile;

    public Avtomobilist(String name,Integer years,boolean isVeteran,Integer numberOfRaces,double priceAutomobile){
        super(name,years,isVeteran,numberOfRaces);
        this.priceAutomobile=priceAutomobile;
    }

    @Override
    public double zarabotuvacka() {
        return priceAutomobile/5.0;
    }

    @Override
    public double danok() {
        double s=zarabotuvacka();
        if(numberOfRaces>10){
            return s*0.15;
        }else{
            return s*0.20;
        }
    }

    @Override
    public String toString() {
        return "Avtomobilist: " + super.toString() + "priceOfAutomobile is: "+priceAutomobile ;
    }
}
