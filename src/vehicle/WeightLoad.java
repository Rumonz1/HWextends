package vehicle;

public enum WeightLoad {
    N1(0, 3.5),
    N2(3.5, 12),
    N3(12, 99),
    ;

    private  double minLoad;
    private  double maxLoad;


    public void setMinLoad(double minLoad) {
        this.minLoad = minLoad;
    }
    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getMinLoad() {
        return minLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }


    WeightLoad(double minLoad, double maxLoad) {
        this.minLoad = minLoad;
        this.maxLoad = maxLoad;

    }

}
