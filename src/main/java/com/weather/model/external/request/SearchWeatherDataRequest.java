package com.weather.model.external.request;

import java.time.ZonedDateTime;
import lombok.Builder;

@Builder(toBuilder = true)
public record SearchWeatherDataRequest(
        String sensorId,
        String location,
        ZonedDateTime minTime,
        ZonedDateTime maxTime) {}
