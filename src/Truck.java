public class Truck {
    public class Truck extends Transport {
        private Integer pitStopTime;
        private Integer maxSpeed;
        private Integer bestLapTime;
        loadCapacity loadCapacity;

        public Truck(String brand, String model, int year, String country, String color, Integer maxSpeed, Integer pitStopTime, Integer maxSpeed1, Integer bestLapTime) {
            super(brand, model, year, country, color, maxSpeed);
            this.pitStopTime = pitStopTime;
            this.maxSpeed = maxSpeed1;
            this.bestLapTime = bestLapTime;
            this.loadCapacity= loadCapacity;
        }

        public loadCapacity getLoadCapacity() {
            return loadCapacity;
        }

        public void setLoadCapacity(loadCapacity loadCapacity) {
            this.loadCapacity = loadCapacity;
        }
        public void printType (){
            if (loadCapacity()==null) {
                System.out.println(" Недостаточно данных");
            }    else  {
                System.out.println(getLoadCapacity());
            }
        }
        public boolean passDiagnostics() {return this.isDiagnosticsPassed();}
    }
}
