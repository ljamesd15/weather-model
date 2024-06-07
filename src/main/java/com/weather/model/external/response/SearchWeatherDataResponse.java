package com.weather.model.external.response;

import com.weather.model.external.WeatherData;
import java.util.List;
import lombok.Builder;

@Builder
public record SearchWeatherDataResponse(List<WeatherData> weatherDataList) {}
