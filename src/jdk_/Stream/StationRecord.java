package jdk_.Stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class StationRecord {
    private String band;
    private String serialNumber;
    private String stationName;
    private String location;
    private LocalDate localDate;

    public StationRecord(String band, String serialNumber, String stationName, String location, LocalDate localDate) {
        this.band = band;
        this.serialNumber = serialNumber;
        this.stationName = stationName;
        this.location = location;
        this.localDate = localDate;
    }

    public String getBand() {
        return band;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "StationRecord{band='" + band + "', serialNumber='" + serialNumber + "', stationName='" + stationName + "', location='" + location + "', localDate=" + localDate + '}';
    }
}