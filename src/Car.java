public class Car {
    public class Car extends Transport {
        private Integer pitStopTime;
        private Integer maxSpeed;
        private Integer bestLapTime;
        private bodyType bodyType;




        public Car(String brand, String model, int year, String country, String color, Integer maxSpeed, Integer pitStopTime, Integer maxSpeed1, Integer bestLapTime) {
            super(brand, model, year, country, color, maxSpeed);
            this.pitStopTime = pitStopTime;
            this.maxSpeed = maxSpeed1;
            this.bestLapTime = bestLapTime;
            this.bodyType = bodyType;
        }
            public bodyType getBodyType() {
                return bodyType;
            }

            public void setBodyType(bodyType bodyType) {
                this.bodyType = bodyType;
            }
            public void printType (){
            if (getBodyType()==null) {
                System.out.println(" Недостаточно данных");
            }    else  {
                System.out.println(getBodyType());
            }
            }
        public boolean passDiagnostics() {return this.isDiagnosticsPassed();}

        }
    }

