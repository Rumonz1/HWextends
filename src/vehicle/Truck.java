package vehicle;

public class Truck extends Transport implements Competing{




    private WeightLoad weightLoad;
    public Truck(String brand, String model, double engineVolume, WeightLoad weightLoad) {
        super(brand, model, engineVolume );
        this.weightLoad = weightLoad;
    }

    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println("Нужен пит-стоп!");
        } else {
            System.out.println("Едем дальше!");
        }

    }
    @Override
    public void goService() {
        System.out.println("Грузвоик "+getBrand()+" "+getModel()+" проходит диагностику");
    }

    @Override
    public void bestLapTime(int minutes , int seconds) {
        System.out.println("Лучшее время круга: "+minutes+" минут "+seconds+" секунд. Поздравляем!");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость: "+speed+" км/ч");
    }
    @Override
    public void printType() {
        if (weightLoad == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        String minLoad = weightLoad.getMinLoad() == 0 ? "" : " От " + weightLoad.getMinLoad() + " тонн.";
        String maxLoad = weightLoad.getMaxLoad() == 0 ? "" : " До " + weightLoad.getMaxLoad() + " тонн.";
        System.out.println("Грузоподъемность авто: "+getBrand()+" "+getModel()+ " " + minLoad + maxLoad);
//            if(minLoad < 0){
//                return "Грузоподъемность:  до "+maxLoad+" тонн";
//            }
//            return "Грузоподъемность: от "+minLoad+" тонн до "+maxLoad+" тонн";
        }





}
