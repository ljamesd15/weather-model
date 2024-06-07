package com.weather.model.external.request;

import com.weather.model.external.WeatherData;
import lombok.Builder;

@Builder
public record SaveWeatherDataRequest(WeatherData weatherData) {}
