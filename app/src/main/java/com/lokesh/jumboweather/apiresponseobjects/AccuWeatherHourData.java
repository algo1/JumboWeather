package com.lokesh.jumboweather.apiresponseobjects;

/**
 * Created by lokeshponnada on 7/10/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AccuWeatherHourData {

    @SerializedName("DateTime")
    @Expose
    private String dateTime;
    @SerializedName("EpochDateTime")
    @Expose
    private String epochDateTime;
    @SerializedName("WeatherIcon")
    @Expose
    private String weatherIcon;
    @SerializedName("IconPhrase")
    @Expose
    private String iconPhrase;
    @SerializedName("IsDaylight")
    @Expose
    private Boolean isDaylight;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("PrecipitationProbability")
    @Expose
    private String precipitationProbability;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * @return The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime The DateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public AccuWeatherHourData withDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * @return The epochDateTime
     */
    public String getEpochDateTime() {
        return epochDateTime;
    }

    /**
     * @param epochDateTime The EpochDateTime
     */
    public void setEpochDateTime(String epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    public AccuWeatherHourData withEpochDateTime(String epochDateTime) {
        this.epochDateTime = epochDateTime;
        return this;
    }

    /**
     * @return The weatherIcon
     */
    public String getWeatherIcon() {
        return weatherIcon;
    }

    /**
     * @param weatherIcon The WeatherIcon
     */
    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public AccuWeatherHourData withWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
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

    public AccuWeatherHourData withIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
        return this;
    }

    /**
     * @return The isDaylight
     */
    public Boolean getIsDaylight() {
        return isDaylight;
    }

    /**
     * @param isDaylight The IsDaylight
     */
    public void setIsDaylight(Boolean isDaylight) {
        this.isDaylight = isDaylight;
    }

    public AccuWeatherHourData withIsDaylight(Boolean isDaylight) {
        this.isDaylight = isDaylight;
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

    public AccuWeatherHourData withTemperature(Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * @return The precipitationProbability
     */
    public String getPrecipitationProbability() {
        return precipitationProbability;
    }

    /**
     * @param precipitationProbability The PrecipitationProbability
     */
    public void setPrecipitationProbability(String precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public AccuWeatherHourData withPrecipitationProbability(String precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
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

    public AccuWeatherHourData withMobileLink(String mobileLink) {
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

    public AccuWeatherHourData withLink(String link) {
        this.link = link;
        return this;
    }

    public class Temperature {

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

        public Temperature withValue(String value) {
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

        public Temperature withUnit(String unit) {
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

        public Temperature withUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }

    }


}


