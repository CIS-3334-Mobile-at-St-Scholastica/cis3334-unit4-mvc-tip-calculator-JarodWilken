package css.cis3334.tipcalcrecord;

/**
 * Created by tgibbons on 2/7/2017.
 */
public class TipCalculator implements CalculatorInterface {
    private updateViewInterface mainView;
    private Double bill;
    private Integer numPeople;
    private Double totalTip;
    private Double tipPerPerson;
    public static final Double LOW_TIP_RATE = 0.10;
    public static final Double HIGH_TIP_RATE = 0.20;


    TipCalculator(updateViewInterface mainView){
        this.mainView = mainView;
    }

    @Override
    public void calculate(Double bill, Integer numPeople, boolean goodService) {
        this.bill = bill;
        this.numPeople = numPeople;
        if (goodService) {
            totalTip = HIGH_TIP_RATE * bill;
        } else {
            totalTip = LOW_TIP_RATE * bill;
        }
        //try without calculating tip per person
        mainView.updateView(totalTip,tipPerPerson);
    }
}
