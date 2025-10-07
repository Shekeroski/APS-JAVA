public class Motociklist extends Vozac {
    private Integer power;

    public Motociklist (String name,Integer years,boolean isVeteran,Integer numberOfRaces,Integer power){
        super(name,years,isVeteran,numberOfRaces);
        this.power=power;
    }

    @Override
    public double zarabotuvacka() {
        return power*20.0;
    }

    @Override
    public double danok() {
        double s=zarabotuvacka();
        if(isVeteran){
            return s*0.25;
        }else{
            return s*0.20;
        }
    }
    @Override
    public String toString() {
        return "Motociklist: " + super.toString() + "power of engine is: "+power;
    }
}
