public class vehicle {
    
    private String manufacturer;
    private int year;
  
    
     public vehicle(String manufacturer, int year) {
      this.manufacturer = manufacturer;
      this.year = year;
    }
  
    // Methods
    public void accelerate() {
      System.out.println("The vehicle is accelerating.");
    }
  
    public void brake() {
      System.out.println("The vehicle is braking.");
    }
  }

  