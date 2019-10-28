package com.kraftropic.kraftytime.core;

import android.content.Context;
import android.widget.TextView;

import com.kraftropic.kraftytime.utils.KRAFT;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KraftTime {

    Context context;
    String date;

    public static KraftTime with(Context context) {
        return new KraftTime();
    }

    public String getDate(Date date, String style) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        switch (style) {
            case KRAFT.YYYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getYYYYMMDD(calendar);
            case KRAFT.YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getYYYYDDMM(calendar);
            case KRAFT.DDMMYYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getDDMMYYYY(calendar);
            case KRAFT.SHORT_WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getShortYYYYMMDD(calendar);
            case KRAFT.SHORT_WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getShortYYYYDDMM(calendar);
            case KRAFT.SHORT_WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getShortDDMMYYYY(calendar);
            case KRAFT.WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getWordYYYYMMDD(calendar);
            case KRAFT.WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getWordYYYYDDMM(calendar);
            case KRAFT.WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getWordDDMMYYYY(calendar);
            default:
                return null;
        }
    }

    public void setDate(Date date, String style) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        switch (style) {
            case KRAFT.YYYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getYYYYMMDD(calendar);
            case KRAFT.YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getYYYYDDMM(calendar);
            case KRAFT.DDMMYYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getDDMMYYYY(calendar);
            case KRAFT.SHORT_WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getShortYYYYMMDD(calendar);
            case KRAFT.SHORT_WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getShortYYYYDDMM(calendar);
            case KRAFT.SHORT_WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getShortDDMMYYYY(calendar);
            case KRAFT.WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getWordYYYYMMDD(calendar);
            case KRAFT.WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getWordYYYYDDMM(calendar);
            case KRAFT.WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getWordDDMMYYYY(calendar);
            default:
                this.date = null;
        }
    }

    public void into(TextView textView) {
        textView.setText(date);
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
}
