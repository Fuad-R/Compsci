class Car extends vehicle {
 
    private String fuelType;
    private int numDoors;

        public Car(String fuelType, int numDoors, String manufacturer, int year) {
            super(manufacturer, year);

        this.fuelType = fuelType;
        this.numDoors = numDoors;
      }
    
      //methods
      public void openDoor() {
        System.out.println("The door is opened.");
      }
    
    }
