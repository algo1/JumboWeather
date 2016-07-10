package com.lokesh.jumboweather.apiresponseobjects;

/**
 * Created by lokeshponnada on 7/10/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class AccuWeatherFivedayForecastResponse {

    @SerializedName("Headline")
    @Expose
    private Headline headline;
    @SerializedName("DailyForecasts")
    @Expose
    private List<DailyForecast> dailyForecasts = new ArrayList<DailyForecast>();

    /**
     * @return The headline
     */
    public Headline getHeadline() {
        return headline;
    }

    /**
     * @param headline The Headline
     */
    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public AccuWeatherFivedayForecastResponse withHeadline(Headline headline) {
        this.headline = headline;
        return this;
    }

    /**
     * @return The dailyForecasts
     */
    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    /**
     * @param dailyForecasts The DailyForecasts
     */
    public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    public AccuWeatherFivedayForecastResponse withDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
        return this;
    }

    public class DailyForecast {

        @SerializedName("Date")
        @Expose
        private String date;
        @SerializedName("EpochDate")
        @Expose
        private String epochDate;
        @SerializedName("Temperature")
        @Expose
        private Temperature temperature;
        @SerializedName("Day")
        @Expose
        private Day day;
        @SerializedName("Night")
        @Expose
        private Night night;
        @SerializedName("Sources")
        @Expose
        private List<String> sources = new ArrayList<String>();
        @SerializedName("MobileLink")
        @Expose
        private String mobileLink;
        @SerializedName("Link")
        @Expose
        private String link;

        /**
         * @return The date
         */
        public String getDate() {
            return date;
        }

        /**
         * @param date The Date
         */
        public void setDate(String date) {
            this.date = date;
        }

        public DailyForecast withDate(String date) {
            this.date = date;
            return this;
        }

        /**
         * @return The epochDate
         */
        public String getEpochDate() {
            return epochDate;
        }

        /**
         * @param epochDate The EpochDate
         */
        public void setEpochDate(String epochDate) {
            this.epochDate = epochDate;
        }

        public DailyForecast withEpochDate(String epochDate) {
            this.epochDate = epochDate;
            return this;
        }

        /**
         * @return The temperature
         */
        public Temperature getTemperature() {
            return temperature;
        }

        /**
         * @param temperature The Temperature
         */
        public void setTemperature(Temperature temperature) {
            this.temperature = temperature;
        }

        public DailyForecast withTemperature(Temperature temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * @return The day
         */
        public Day getDay() {
            return day;
        }

        /**
         * @param day The Day
         */
        public void setDay(Day day) {
            this.day = day;
        }

        public DailyForecast withDay(Day day) {
            this.day = day;
            return this;
        }

        /**
         * @return The night
         */
        public Night getNight() {
            return night;
        }

        /**
         * @param night The Night
         */
        public void setNight(Night night) {
            this.night = night;
        }

        public DailyForecast withNight(Night night) {
            this.night = night;
            return this;
        }

        /**
         * @return The sources
         */
        public List<String> getSources() {
            return sources;
        }

        /**
         * @param sources The Sources
         */
        public void setSources(List<String> sources) {
            this.sources = sources;
        }

        public DailyForecast withSources(List<String> sources) {
            this.sources = sources;
            return this;
        }

        /**
         * @return The mobileLink
         */
        public String getMobileLink() {
            return mobileLink;
        }

        /**
         * @param mobileLink The MobileLink
         */
        public void setMobileLink(String mobileLink) {
            this.mobileLink = mobileLink;
        }

        public DailyForecast withMobileLink(String mobileLink) {
            this.mobileLink = mobileLink;
            return this;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The Link
         */
        public void setLink(String link) {
            this.link = link;
        }

        public DailyForecast withLink(String link) {
            this.link = link;
            return this;
        }

    }

    public class Day {

        @SerializedName("Icon")
        @Expose
        private String icon;
        @SerializedName("IconPhrase")
        @Expose
        private String iconPhrase;

        /**
         * @return The icon
         */
        public String getIcon() {
            return icon;
        }

        /**
         * @param icon The Icon
         */
        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Day withIcon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * @return The iconPhrase
         */
        public String getIconPhrase() {
            return iconPhrase;
        }

        /**
         * @param iconPhrase The IconPhrase
         */
        public void setIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
        }

        public Day withIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
            return this;
        }

    }

    public class Headline {

        @SerializedName("EffectiveDate")
        @Expose
        private String effectiveDate;
        @SerializedName("EffectiveEpochDate")
        @Expose
        private String effectiveEpochDate;
        @SerializedName("Severity")
        @Expose
        private String severity;
        @SerializedName("Text")
        @Expose
        private String text;
        @SerializedName("Category")
        @Expose
        private String category;
        @SerializedName("EndDate")
        @Expose
        private String endDate;
        @SerializedName("EndEpochDate")
        @Expose
        private String endEpochDate;
        @SerializedName("MobileLink")
        @Expose
        private String mobileLink;
        @SerializedName("Link")
        @Expose
        private String link;

        /**
         * @return The effectiveDate
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * @param effectiveDate The EffectiveDate
         */
        public void setEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public Headline withEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * @return The effectiveEpochDate
         */
        public String getEffectiveEpochDate() {
            return effectiveEpochDate;
        }

        /**
         * @param effectiveEpochDate The EffectiveEpochDate
         */
        public void setEffectiveEpochDate(String effectiveEpochDate) {
            this.effectiveEpochDate = effectiveEpochDate;
        }

        public Headline withEffectiveEpochDate(String effectiveEpochDate) {
            this.effectiveEpochDate = effectiveEpochDate;
            return this;
        }

        /**
         * @return The severity
         */
        public String getSeverity() {
            return severity;
        }

        /**
         * @param severity The Severity
         */
        public void setSeverity(String severity) {
            this.severity = severity;
        }

        public Headline withSeverity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * @return The text
         */
        public String getText() {
            return text;
        }

        /**
         * @param text The Text
         */
        public void setText(String text) {
            this.text = text;
        }

        public Headline withText(String text) {
            this.text = text;
            return this;
        }

        /**
         * @return The category
         */
        public String getCategory() {
            return category;
        }

        /**
         * @param category The Category
         */
        public void setCategory(String category) {
            this.category = category;
        }

        public Headline withCategory(String category) {
            this.category = category;
            return this;
        }

        /**
         * @return The endDate
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * @param endDate The EndDate
         */
        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Headline withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * @return The endEpochDate
         */
        public String getEndEpochDate() {
            return endEpochDate;
        }

        /**
         * @param endEpochDate The EndEpochDate
         */
        public void setEndEpochDate(String endEpochDate) {
            this.endEpochDate = endEpochDate;
        }

        public Headline withEndEpochDate(String endEpochDate) {
            this.endEpochDate = endEpochDate;
            return this;
        }

        /**
         * @return The mobileLink
         */
        public String getMobileLink() {
            return mobileLink;
        }

        /**
         * @param mobileLink The MobileLink
         */
        public void setMobileLink(String mobileLink) {
            this.mobileLink = mobileLink;
        }

        public Headline withMobileLink(String mobileLink) {
            this.mobileLink = mobileLink;
            return this;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The Link
         */
        public void setLink(String link) {
            this.link = link;
        }

        public Headline withLink(String link) {
            this.link = link;
            return this;
        }

    }

    public class Maximum {

        @SerializedName("Value")
        @Expose
        private String value;
        @SerializedName("Unit")
        @Expose
        private String unit;
        @SerializedName("UnitType")
        @Expose
        private String unitType;

        /**
         * @return The value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value The Value
         */
        public void setValue(String value) {
            this.value = value;
        }

        public Maximum withValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * @return The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         * @param unit The Unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Maximum withUnit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * @return The unitType
         */
        public String getUnitType() {
            return unitType;
        }

        /**
         * @param unitType The UnitType
         */
        public void setUnitType(String unitType) {
            this.unitType = unitType;
        }

        public Maximum withUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }

    }

    public class Minimum {

        @SerializedName("Value")
        @Expose
        private String value;
        @SerializedName("Unit")
        @Expose
        private String unit;
        @SerializedName("UnitType")
        @Expose
        private String unitType;

        /**
         * @return The value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value The Value
         */
        public void setValue(String value) {
            this.value = value;
        }

        public Minimum withValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * @return The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         * @param unit The Unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Minimum withUnit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * @return The unitType
         */
        public String getUnitType() {
            return unitType;
        }

        /**
         * @param unitType The UnitType
         */
        public void setUnitType(String unitType) {
            this.unitType = unitType;
        }

        public Minimum withUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }

    }


    public class Night {

        @SerializedName("Icon")
        @Expose
        private String icon;
        @SerializedName("IconPhrase")
        @Expose
        private String iconPhrase;

        /**
         * @return The icon
         */
        public String getIcon() {
            return icon;
        }

        /**
         * @param icon The Icon
         */
        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Night withIcon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * @return The iconPhrase
         */
        public String getIconPhrase() {
            return iconPhrase;
        }

        /**
         * @param iconPhrase The IconPhrase
         */
        public void setIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
        }

        public Night withIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
            return this;
        }

    }

    public class Temperature {

        @SerializedName("Minimum")
        @Expose
        private Minimum minimum;
        @SerializedName("Maximum")
        @Expose
        private Maximum maximum;

        /**
         * @return The minimum
         */
        public Minimum getMinimum() {
            return minimum;
        }

        /**
         * @param minimum The Minimum
         */
        public void setMinimum(Minimum minimum) {
            this.minimum = minimum;
        }

        public Temperature withMinimum(Minimum minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * @return The maximum
         */
        public Maximum getMaximum() {
            return maximum;
        }

        /**
         * @param maximum The Maximum
         */
        public void setMaximum(Maximum maximum) {
            this.maximum = maximum;
        }

        public Temperature withMaximum(Maximum maximum) {
            this.maximum = maximum;
            return this;
        }

    }


}

