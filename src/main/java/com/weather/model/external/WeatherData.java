package com.weather.model.external;

import com.weather.model.external.enums.Direction;
import java.time.ZonedDateTime;
import lombok.Builder;
import lombok.NonNull;

/**
 * Weather data structure holding all available data.
 *
 * @param time Time the weather data was captured
 * @param temperature Temperature measured in Celsius
 * @param pressure Pressure measured in millibars
 * @param humidity Humidity of the air, 1-100%
 * @param windSpeed Speed of the wind in kilometers per hour
 * @param windDirection Direction of the wind
 * @param luminosity Level of illuminance measured in lux
 * @param uvIndex UV Index, 0-11+
 * @param sensorMetadata Metadata of the sensor sending the weather data
 */
@Builder
public record WeatherData(
        @NonNull ZonedDateTime time,
        Double temperature,
        Double pressure,
        Double humidity,
        Double windSpeed,
        Direction windDirection,
        Double luminosity,
        Double uvIndex,
        @NonNull SensorMetadata sensorMetadata) {}
