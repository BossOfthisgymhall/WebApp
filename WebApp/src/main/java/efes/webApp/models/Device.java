package efes.webApp.models;

import java.time.LocalDate;

public class Device {
    private String name;
    private int sapNumber;
    private String serialNumber;
    private LocalDate lastCalibrationDate;
    private LocalDate nextCalibrationDate;
    private Subdivision subdivision;
    private DeviceType deviceType;
    private ExpiryStatus expiryStatus;
}
