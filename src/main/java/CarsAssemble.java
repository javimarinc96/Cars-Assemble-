public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double res = 0.0;
        
        if(1 <= speed && speed <= 4){
            res = 221 * speed;
        }else if (5 <= speed && speed <= 8){
            res = 221 * speed * 0.90;
        }else if (speed == 9){
            res = 221 * speed * 0.80;
        }else if (speed == 10){
            res = 221 * speed * 0.77;
        }else{
            res = 0.0;
        }

        return res;
    }

    public int workingItemsPerMinute(int speed) {
        int res2 = 0;
        double res = productionRatePerHour(speed);
        res = res/60;
        res2 = (int) res;
        return res2;
    }
}
