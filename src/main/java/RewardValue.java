public class RewardValue {
    private final double CONVERSION_RATE = 0.0035;
    double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = round(miles * CONVERSION_RATE, 1);;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(double cashValue){
        return round(cash/CONVERSION_RATE, 1);
    }

    static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }}