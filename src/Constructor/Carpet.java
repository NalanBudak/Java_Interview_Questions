package Constructor;

public class Carpet {

    double width , length, unitPrice;
    boolean isPersian ;

    public void customOrder(double width,double length ,double unitPrice, boolean isPersian){

        this.width =width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian =isPersian;
    }

    public double calcCost(){
        double totalPrice =(width *length)*unitPrice;
        if (isPersian){
            totalPrice += 200;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
