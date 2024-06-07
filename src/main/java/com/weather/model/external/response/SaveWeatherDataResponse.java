package com.weather.model.external.response;

import com.weather.model.external.WeatherData;
import lombok.Builder;

@Builder
public record SaveWeatherDataResponse(WeatherData weatherData) {}
