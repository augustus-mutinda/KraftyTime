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
        switch (style) {
            case KRAFT.YYYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getYYYYMMDD(date);
            case KRAFT.YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getYYYYDDMM(date);
            case KRAFT.DDMMYYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getDDMMYYYY(date);
            case KRAFT.SHORT_WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getShortYYYYMMDD(date);
            case KRAFT.SHORT_WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getShortYYYYDDMM(date);
            case KRAFT.SHORT_WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getShortDDMMYYYY(date);
            case KRAFT.WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getWordYYYYMMDD(date);
            case KRAFT.WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getWordYYYYDDMM(date);
            case KRAFT.WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    return "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    return String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    return getWordDDMMYYYY(date);
            default:
                return null;
        }
    }

    public void setDate(Date date, String style) {
        switch (style) {
            case KRAFT.YYYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getYYYYMMDD(date);
            case KRAFT.YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getYYYYDDMM(date);
            case KRAFT.DDMMYYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getDDMMYYYY(date);
            case KRAFT.SHORT_WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getShortYYYYMMDD(date);
            case KRAFT.SHORT_WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getShortYYYYDDMM(date);
            case KRAFT.SHORT_WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getShortDDMMYYYY(date);
            case KRAFT.WORD_YYYMMDD:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getWordYYYYMMDD(date);
            case KRAFT.WORD_YYYYDDMM:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getWordYYYYDDMM(date);
            case KRAFT.WORD_DDMMYYY:
                if ((Calendar.getInstance().getTime().getTime() - 48 * 60 * 60 * 1000L) < date.getTime() && (Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) > date.getTime()) {
                    this.date = "yesterday " + new SimpleDateFormat("HH:mm");
                } else if ((Calendar.getInstance().getTime().getTime() - 24 * 60 * 60 * 1000L) < date.getTime()) {
                    this.date = String.valueOf(new SimpleDateFormat("HH:mm"));
                } else
                    this.date = getWordDDMMYYYY(date);
            default:
                this.date = null;
        }
    }

    public void into(TextView textView) {
        textView.setText(date);
    }

    private String getYYYYMMDD(Date date) {
        return date.getYear() + "/" + getNumMonth(date) + "/" + date.getDate();
    }

    private String getYYYYDDMM(Date date) {
        return date.getYear() + "/" + date.getDate() + "/" + getNumMonth(date);
    }

    private String getDDMMYYYY(Date date) {
        return date.getDate() + "/" + getNumMonth(date) + "/" + date.getYear();
    }

    private String getShortYYYYMMDD(Date date) {
        return date.getYear() + ", " + getShortMonth(date) + ", " + date.getDate();
    }

    private String getShortYYYYDDMM(Date date) {
        return date.getYear() + ", " + date.getDate() + ", " + getShortMonth(date);
    }

    private String getShortDDMMYYYY(Date date) {
        return date.getDate() + ", " + getShortMonth(date) + ", " + date.getYear();
    }

    private String getWordYYYYMMDD(Date date) {
        return date.getYear() + ", " + getFullMonth(date) + ", " + date.getDate();
    }

    private String getWordYYYYDDMM(Date date) {
        return date.getYear() + ", " + date.getDate() + ", " + getFullMonth(date);
    }

    private String getWordDDMMYYYY(Date date) {
        return date.getDate() + ", " + getFullMonth(date) + ", " + date.getYear();
    }

    private String getFullMonth(Date date) {
        switch (date.getMonth()) {
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

    private String getShortMonth(Date date) {
        switch (date.getMonth()) {
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

    private String getNumMonth(Date date) {
        return String.valueOf(date.getMonth() + 1);
    }
}
