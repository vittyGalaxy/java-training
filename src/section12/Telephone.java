package section12;

public class Telephone extends Product {
    @Override
    @Deprecated
    public double calculateVAT(double percentageVAT){
        return super.calculateVAT(percentageVAT);
    }
}
