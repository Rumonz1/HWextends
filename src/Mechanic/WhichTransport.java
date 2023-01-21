package Mechanic;

public enum WhichTransport {
    ONLY_CARS("Легковые автомобили"),
    ONLY_BUSES("Автобусы"),
    ONLY_TRUCKS("Грузовики"),
    ALL_TRANSPORT("Все типы транспорта");
    private final String WhichTransport;

    WhichTransport(String whichTransport) {
        WhichTransport = whichTransport;
    }

    public String getWhichTransport() {
        return WhichTransport;
    }

    @Override
    public String toString() {
        return WhichTransport;
    }
}
