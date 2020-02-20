import java.util.*;
class SimpleInterestCalculator{
    double principal,amount;
    int years;
    public void calculateSimpleInterest(double p,int y){
        principal = p;
        years = y;

        if(years > 10){
            amount = 10;
            System.out.println("The interest amount for a principal of " + p + " and years "+ y +" is  " + (p*y*(10/100)));
        }
        else{
            
        }
    }
}