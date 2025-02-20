package Adapter;

//The external library (We don't have this source code)
public class WeatherForecast {

    public double getTemperature(String location) {
        //This method will call an external API and return the temperature in Fahrenheit
        return 25.685;
    }

    public double getWindSpeed(String location){
        //This method will call an external API and return the wind speed in Mile/Sec
        return 890.0568;
    }
}
