package Adapter;

public class Client {
    public static void main(String[] args) {
        //Do the following to use it
        WeatherForecast forecast = new WeatherForecast();
        IWeatherForecastAdapter adapter = new WeatherForecastAdapter(forecast);

        System.out.println("Temp in celsius: " + adapter.temperature("012 0260 026"));
        System.out.println("Wind speed in m/s: " + adapter.windSpeed("012 0260 026"));
    }
}
