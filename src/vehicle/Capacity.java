package vehicle;

public enum Capacity {
    XS(10),
    S(25),
    M(40, 50),
    L(60, 80),
    XL(100, 120);

    private int capacityFrom;

    private int capacityTo;
    Capacity(int capacityTo ) {
        this.capacityTo = capacityTo;
    }
    Capacity(int capacityFrom, int capacityTo) {
        if (capacityFrom == 0){
            this.capacityFrom = 1;
        } else {
        this.capacityFrom =capacityFrom;
        this.capacityTo= capacityTo;
        }
    }
    public int getCapacityFrom() {
        return capacityFrom;
    }

    public void setCapacityFrom(int capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    public int getCapacityTo() {
        return capacityTo;
    }

    public void setCapacityTo(int capacityTo) {
        this.capacityTo = capacityTo;
    }
}
