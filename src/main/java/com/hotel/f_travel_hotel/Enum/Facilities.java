package com.hotel.f_travel_hotel.Enum;

public enum Facilities {
    WIFI("Wi-Fi"),
    AIR_CONDITIONING("Air Conditioning"),
    TV("Television"),
    MINI_BAR("Mini Bar"),
    ROOM_SERVICE("Room Service"),
    SAFE("Safe"),
    HAIR_DRYER("Hair Dryer"),
    COFFEE_MACHINE("Coffee Machine"),
    BALCONY("Balcony"),
    SEA_VIEW("Sea View"),
    MOUNTAIN_VIEW("Mountain View"),
    CITY_VIEW("City View"),
    BATH_TUB("Bath Tub"),
    SHOWER("Shower"),
    DESK("Desk"),
    SOFA("Sofa"),
    KITCHENETTE("Kitchenette"),
    IRON("Iron"),
    BATHROBE("Bathrobe"),
    SLIPPERS("Slippers"),
    TELEPHONE("Telephone"),
    HEATING("Heating"),
    FAN("Fan"),
    EXTRA_BED("Extra Bed");

    private final String facilityName;

    private Facilities(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityName() {
        return facilityName;
    }
}
