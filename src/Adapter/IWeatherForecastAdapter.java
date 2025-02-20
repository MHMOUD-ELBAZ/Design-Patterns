package Adapter;

//Any class will implement this interface must return the weather status in standard units

public interface IWeatherForecastAdapter {
    double temperature(String location);
    double windSpeed(String location);
}
