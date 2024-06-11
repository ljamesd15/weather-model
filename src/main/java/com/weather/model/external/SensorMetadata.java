package com.weather.model.external;

import java.util.List;
import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record SensorMetadata(
        Double longitude,
        Double latitude,
        @NonNull String sensorId,
        List<String> tags,
        @NonNull String location
) {}
