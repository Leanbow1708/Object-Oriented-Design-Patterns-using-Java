public class HeatIndexDisplay implements Observer, DisplayElement{

    private float temperature;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The Heat is for "+temperature+"F degrees");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        display();
    }
}
