package com.kraftropic.kraftytime.core;

import android.annotation.SuppressLint;
import android.widget.TextView;

import com.kraftropic.kraftytime.utils.KRAFTY;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KraftyTime {

    private static Calendar finalCalendar;
    private String clockMode = KRAFTY.MODE_24_HOUR;
    private String dateMode = KRAFTY.DDMMYYYY;

    public static KraftyTime with(Date date) {
        finalCalendar = Calendar.getInstance();
        finalCalendar.setTime(date);
        return new KraftyTime();
    }

    public KraftyTime setClockMode(String clockMode) {
        this.clockMode = clockMode;
        return this;
    }

    public KraftyTime setDateMode(String dateMode) {
        this.dateMode = dateMode;
        return this;
    }

    public void setDateText(TextView dateTextView) {
        dateTextView.setText(getDate(finalCalendar, dateMode));
    }

    private String getDate(Calendar calendar, String style) {

        Date date = calendar.getTime();

        if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
            return "yesterday " + (clockMode.equals(KRAFTY.MODE_12_HOUR) ? get12HourDate(date) : get24HourDate(date));
        } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
            return clockMode.equals(KRAFTY.MODE_12_HOUR) ? get12HourDate(date) : get24HourDate(date);
        } else {
            switch (style) {
                case KRAFTY.YYYYMMDD:
                    return getYYYYMMDD(calendar);
                case KRAFTY.YYYYDDMM:
                    return getYYYYDDMM(calendar);
                case KRAFTY.DDMMYYYY:
                    return getDDMMYYYY(calendar);
                case KRAFTY.SHORT_WORD_YYYMMDD:
                    return getShortYYYYMMDD(calendar);
                case KRAFTY.SHORT_WORD_YYYYDDMM:
                    return getShortYYYYDDMM(calendar);
                case KRAFTY.SHORT_WORD_DDMMYYY:
                    return getShortDDMMYYYY(calendar);
                case KRAFTY.WORD_YYYMMDD:
                    return getWordYYYYMMDD(calendar);
                case KRAFTY.WORD_YYYYDDMM:
                    return getWordYYYYDDMM(calendar);
                case KRAFTY.WORD_DDMMYYY:
                    return getWordDDMMYYYY(calendar);
                default:
                    return null;
            }
        }
    }

    private String getYYYYMMDD(Calendar date) {
        return date.get(Calendar.YEAR) + "/" + getNumMonth(date) + "/" + date.get(Calendar.DATE);
    }

    private String getYYYYDDMM(Calendar date) {
        return date.get(Calendar.YEAR) + "/" + date.get(Calendar.DATE) + "/" + getNumMonth(date);
    }

    private String getDDMMYYYY(Calendar date) {
        return date.get(Calendar.DATE) + "/" + getNumMonth(date) + "/" + date.get(Calendar.YEAR);
    }

    private String getShortYYYYMMDD(Calendar date) {
        return date.get(Calendar.YEAR) + ", " + getShortMonth(date) + ", " + date.get(Calendar.DATE);
    }

    private String getShortYYYYDDMM(Calendar date) {
        return date.get(Calendar.YEAR) + ", " + date.get(Calendar.DATE) + ", " + getShortMonth(date);
    }

    private String getShortDDMMYYYY(Calendar date) {
        return date.get(Calendar.DATE) + ", " + getShortMonth(date) + ", " + date.get(Calendar.YEAR);
    }

    private String getWordYYYYMMDD(Calendar date) {
        return date.get(Calendar.YEAR) + ", " + getFullMonth(date) + ", " + date.get(Calendar.DATE);
    }

    private String getWordYYYYDDMM(Calendar date) {
        return date.get(Calendar.YEAR) + ", " + date.get(Calendar.DATE) + ", " + getFullMonth(date);
    }

    private String getWordDDMMYYYY(Calendar date) {
        return date.get(Calendar.DATE) + ", " + getFullMonth(date) + ", " + date.get(Calendar.YEAR);
    }

    private String getFullMonth(Calendar date) {
        switch (date.get(Calendar.MONTH)) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return null;
        }
    }

    private String getShortMonth(Calendar date) {
        switch (date.get(Calendar.MONTH)) {
            case 0:
                return "Jan";
            case 1:
                return "Feb";
            case 2:
                return "Mar";
            case 3:
                return "Apr";
            case 4:
                return "May";
            case 5:
                return "Jun";
            case 6:
                return "Jul";
            case 7:
                return "Aug";
            case 8:
                return "Sep";
            case 9:
                return "Oct";
            case 10:
                return "Nov";
            case 11:
                return "Dec";
            default:
                return null;
        }
    }

    private String getNumMonth(Calendar date) {
        return String.valueOf(date.get(Calendar.MONTH) + 1);
    }

    private String get12HourDate(Date date) {
        @SuppressLint("SimpleDateFormat") DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        return dateFormat.format(date);
    }

    private String get24HourDate(Date date) {
        @SuppressLint("SimpleDateFormat") DateFormat dateFormat = new SimpleDateFormat("hh:mm");
        return dateFormat.format(date);
    }


}
