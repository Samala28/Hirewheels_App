package com.upgrad.hirewheels.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static int differenceBetweenTime(LocalDateTime pickupTime , LocalDateTime dropTime){
        long difference = ChronoUnit.SECONDS.between(pickupTime, dropTime);
        int timeBetween = (int) (difference / (60*60*24));
        return timeBetween;
    }
}
