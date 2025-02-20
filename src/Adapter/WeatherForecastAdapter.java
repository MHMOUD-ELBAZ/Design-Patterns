package Adapter;

public class WeatherForecastAdapter implements IWeatherForecastAdapter {
    private WeatherForecast weatherForecast;

    public WeatherForecastAdapter(WeatherForecast weatherForecast) {
        this.weatherForecast = weatherForecast;
    }


    @Override
    public double temperature(String location) {
        double feh = weatherForecast.getTemperature(location);
        return (5.0/9.0) * (feh - 32);
    }

    @Override
    public double windSpeed(String location) {
        return 1.609344 * weatherForecast.getWindSpeed(location);
    }
}
