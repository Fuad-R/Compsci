class motorcycle extends vehicle {
 
    private boolean hasSideCar;
    private int numWheels;

        public motorcycle(boolean hasSideCar, int numWheels, String manufacturer, int year) {
            super(manufacturer, year);

        this.hasSideCar = true;
        this.numWheels = numWheels;
      }
    
      //methods
      public void wheelie() {
        System.out.println("The motorcycle is doing a wheelie.");
      }
    
    }
