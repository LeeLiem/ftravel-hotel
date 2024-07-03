package com.hotel.f_travel_hotel.Enum;

public class EnumStatus {
    public enum PaymentStatus {
        PENDING(0), CANCELED(1), PAIDED(2);
        private final int value;
        private PaymentStatus(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public enum CouponStatus {
        ONGOING(0), EXPIRED(1), USED(2);
        private final int value;
        private CouponStatus(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public enum AccountStatus {
        ACTIVE(0), INACTIVE(1), BANNED(2) ;
        private final int value;
        private AccountStatus(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
}
