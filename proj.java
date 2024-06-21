public class Car {
        //instance variables
int noOfWheels;
String color;
float maxSpeed;
float currentFuelInLiters;
int noOfSeats;
//instance methods
        public Car start(){
                if(currentFuelInLiters ==0){
                        System.out.println("Car is out of fuel,can not start`");
                }
                else if (currentFuelInLiters<5){
                        System.out.println("Car is in reserved mode,please refuel");
                        currentFuelInLiters--;
                }
                else {
                        System.out.println("The Car is started....bruhhhh");
                        currentFuelInLiters--;
                }
                return this;//returning current instance(objects)
        }
        public void drive(){
                currentFuelInLiters--;
                System.out.println("The Car is driving");
        }



        public void addFuel(float currentFuelInLiters){
                this.currentFuelInLiters +=currentFuelInLiters;
        }
        public float getCurrentFuelLevel(){
                return currentFuelInLiters;

        }

        public static void main(String[] args) {
                return;
        }
}

