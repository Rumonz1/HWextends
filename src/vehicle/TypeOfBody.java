package vehicle;

public enum TypeOfBody {
    SEDAN("СЕДАН"),
    HATCHBACK("ХЭТЧБЭК"),
    COUPE("КУПЕ"),
    STATION_WAGON("УНИВЕРСАЛ"),
    SUV("ВНЕДОРОЖНИК"),
    CROSSOVER("КРОССОВЕР"),
    PICKUP("ПИКАП"),
    VAN("ФУРГОН"),
    MINIVAN("МИНИВЭН");


    private  String typeOfBody;

    TypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
    public String getTypeOfBody() {
        return typeOfBody;
    }

}

