package com.hotel.f_travel_hotel.Enum;

public enum City {
    HANOI("Hà Nội"),
    HO_CHI_MINH_CITY("Thành phố Hồ Chí Minh"),
    HAI_PHONG("Hải Phòng"),
    DA_NANG("Đà Nẵng"),
    CAN_THO("Cần Thơ"),
    NHA_TRANG("Nha Trang"),
    HUE("Huế"),
    VUNG_TAU("Vũng Tàu"),
    RACH_GIA("Rạch Giá"),
    BIEN_HOA("Biên Hòa"),
    BUON_MA_THUOT("Buôn Ma Thuột"),
    PLEIKU("Pleiku"),
    VINH("Vinh"),
    THANH_HOA("Thanh Hóa"),
    HA_LONG("Hạ Long"),
    PHAN_THIET("Phan Thiết"),
    CAM_RANH("Cam Ranh"),
    TAM_KY("Tam Kỳ"),
    QUY_NHON("Quy Nhơn"),
    PHU_QUOC("Phú Quốc");

    private final String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
