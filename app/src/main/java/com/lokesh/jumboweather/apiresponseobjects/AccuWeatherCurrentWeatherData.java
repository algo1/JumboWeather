package com.lokesh.jumboweather.apiresponseobjects;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AccuWeatherCurrentWeatherData {

    @SerializedName("LocalObservationDateTime")
    @Expose
    private String localObservationDateTime;
    @SerializedName("EpochTime")
    @Expose
    private String epochTime;
    @SerializedName("WeatherText")
    @Expose
    private String weatherText;
    @SerializedName("WeatherIcon")
    @Expose
    private float weatherIcon;
    @SerializedName("IsDayTime")
    @Expose
    private Boolean isDayTime;
    @SerializedName("Temperature")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.Temperature temperature;
    @SerializedName("RealFeelTemperature")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.RealFeelTemperature realFeelTemperature;
    @SerializedName("RealFeelTemperatureShade")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.RealFeelTemperatureShade realFeelTemperatureShade;
    @SerializedName("RelativeHumidity")
    @Expose
    private float relativeHumidity;
    @SerializedName("DewPofloat")
    @Expose
    private ApparentTemperature.DewPofloat dewPofloat;
    @SerializedName("Wind")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.Wind wind;
    @SerializedName("WindGust")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.WindGust windGust;
    @SerializedName("UVIndex")
    @Expose
    private float uVIndex;
    @SerializedName("UVIndexText")
    @Expose
    private String uVIndexText;
    @SerializedName("Visibility")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.Visibility visibility;
    @SerializedName("ObstructionsToVisibility")
    @Expose
    private String obstructionsToVisibility;
    @SerializedName("CloudCover")
    @Expose
    private float cloudCover;
    @SerializedName("Ceiling")
    @Expose
    private ApparentTemperature.Ceiling ceiling;
    @SerializedName("Pressure")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.Pressure pressure;
    @SerializedName("PressureTendency")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.PressureTendency pressureTendency;
    @SerializedName("Past24HourTemperatureDeparture")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.Past24HourTemperatureDeparture past24HourTemperatureDeparture;
    @SerializedName("ApparentTemperature")
    @Expose
    private ApparentTemperature apparentTemperature;
    @SerializedName("WindChillTemperature")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.WindChillTemperature windChillTemperature;
    @SerializedName("WetBulbTemperature")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.WetBulbTemperature wetBulbTemperature;
    @SerializedName("Precip1hr")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.Precip1hr precip1hr;
    @SerializedName("PrecipitationSummary")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.PrecipitationSummary precipitationSummary;
    @SerializedName("TemperatureSummary")
    @Expose
    private ApparentTemperature.Imperial_____.Imperial_________.TemperatureSummary temperatureSummary;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * @return The localObservationDateTime
     */
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    /**
     * @param localObservationDateTime The LocalObservationDateTime
     */
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    /**
     * @return The epochTime
     */
    public String getEpochTime() {
        return epochTime;
    }

    /**
     * @param epochTime The EpochTime
     */
    public void setEpochTime(String epochTime) {
        this.epochTime = epochTime;
    }

    /**
     * @return The weatherText
     */
    public String getWeatherText() {
        return weatherText;
    }

    /**
     * @param weatherText The WeatherText
     */
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    /**
     * @return The weatherIcon
     */
    public float getWeatherIcon() {
        return weatherIcon;
    }

    /**
     * @param weatherIcon The WeatherIcon
     */
    public void setWeatherIcon(float weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    /**
     * @return The isDayTime
     */
    public Boolean getIsDayTime() {
        return isDayTime;
    }

    /**
     * @param isDayTime The IsDayTime
     */
    public void setIsDayTime(Boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    /**
     * @return The temperature
     */
    public ApparentTemperature.Imperial_____.Imperial_________.Temperature getTemperature() {
        return temperature;
    }

    /**
     * @param temperature The Temperature
     */
    public void setTemperature(ApparentTemperature.Imperial_____.Imperial_________.Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * @return The realFeelTemperature
     */
    public ApparentTemperature.Imperial_____.Imperial_________.RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    /**
     * @param realFeelTemperature The RealFeelTemperature
     */
    public void setRealFeelTemperature(ApparentTemperature.Imperial_____.Imperial_________.RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    /**
     * @return The realFeelTemperatureShade
     */
    public ApparentTemperature.Imperial_____.Imperial_________.RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    /**
     * @param realFeelTemperatureShade The RealFeelTemperatureShade
     */
    public void setRealFeelTemperatureShade(ApparentTemperature.Imperial_____.Imperial_________.RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
    }

    /**
     * @return The relativeHumidity
     */
    public float getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * @param relativeHumidity The RelativeHumidity
     */
    public void setRelativeHumidity(float relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    /**
     * @return The dewPofloat
     */
    public ApparentTemperature.DewPofloat getDewPofloat() {
        return dewPofloat;
    }

    /**
     * @param dewPofloat The DewPofloat
     */
    public void setDewPofloat(ApparentTemperature.DewPofloat dewPofloat) {
        this.dewPofloat = dewPofloat;
    }

    /**
     * @return The wind
     */
    public ApparentTemperature.Imperial_____.Imperial_________.Wind getWind() {
        return wind;
    }

    /**
     * @param wind The Wind
     */
    public void setWind(ApparentTemperature.Imperial_____.Imperial_________.Wind wind) {
        this.wind = wind;
    }

    /**
     * @return The windGust
     */
    public ApparentTemperature.Imperial_____.Imperial_________.WindGust getWindGust() {
        return windGust;
    }

    /**
     * @param windGust The WindGust
     */
    public void setWindGust(ApparentTemperature.Imperial_____.Imperial_________.WindGust windGust) {
        this.windGust = windGust;
    }

    /**
     * @return The uVIndex
     */
    public float getUVIndex() {
        return uVIndex;
    }

    /**
     * @param uVIndex The UVIndex
     */
    public void setUVIndex(float uVIndex) {
        this.uVIndex = uVIndex;
    }

    /**
     * @return The uVIndexText
     */
    public String getUVIndexText() {
        return uVIndexText;
    }

    /**
     * @param uVIndexText The UVIndexText
     */
    public void setUVIndexText(String uVIndexText) {
        this.uVIndexText = uVIndexText;
    }

    /**
     * @return The visibility
     */
    public ApparentTemperature.Imperial_____.Imperial_________.Visibility getVisibility() {
        return visibility;
    }

    /**
     * @param visibility The Visibility
     */
    public void setVisibility(ApparentTemperature.Imperial_____.Imperial_________.Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     * @return The obstructionsToVisibility
     */
    public String getObstructionsToVisibility() {
        return obstructionsToVisibility;
    }

    /**
     * @param obstructionsToVisibility The ObstructionsToVisibility
     */
    public void setObstructionsToVisibility(String obstructionsToVisibility) {
        this.obstructionsToVisibility = obstructionsToVisibility;
    }

    /**
     * @return The cloudCover
     */
    public float getCloudCover() {
        return cloudCover;
    }

    /**
     * @param cloudCover The CloudCover
     */
    public void setCloudCover(float cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     * @return The ceiling
     */
    public ApparentTemperature.Ceiling getCeiling() {
        return ceiling;
    }

    /**
     * @param ceiling The Ceiling
     */
    public void setCeiling(ApparentTemperature.Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    /**
     * @return The pressure
     */
    public ApparentTemperature.Imperial_____.Imperial_________.Pressure getPressure() {
        return pressure;
    }

    /**
     * @param pressure The Pressure
     */
    public void setPressure(ApparentTemperature.Imperial_____.Imperial_________.Pressure pressure) {
        this.pressure = pressure;
    }

    /**
     * @return The pressureTendency
     */
    public ApparentTemperature.Imperial_____.Imperial_________.PressureTendency getPressureTendency() {
        return pressureTendency;
    }

    /**
     * @param pressureTendency The PressureTendency
     */
    public void setPressureTendency(ApparentTemperature.Imperial_____.Imperial_________.PressureTendency pressureTendency) {
        this.pressureTendency = pressureTendency;
    }

    /**
     * @return The past24HourTemperatureDeparture
     */
    public ApparentTemperature.Imperial_____.Imperial_________.Past24HourTemperatureDeparture getPast24HourTemperatureDeparture() {
        return past24HourTemperatureDeparture;
    }

    /**
     * @param past24HourTemperatureDeparture The Past24HourTemperatureDeparture
     */
    public void setPast24HourTemperatureDeparture(ApparentTemperature.Imperial_____.Imperial_________.Past24HourTemperatureDeparture past24HourTemperatureDeparture) {
        this.past24HourTemperatureDeparture = past24HourTemperatureDeparture;
    }

    /**
     * @return The apparentTemperature
     */
    public ApparentTemperature getApparentTemperature() {
        return apparentTemperature;
    }

    /**
     * @param apparentTemperature The ApparentTemperature
     */
    public void setApparentTemperature(ApparentTemperature apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    /**
     * @return The windChillTemperature
     */
    public ApparentTemperature.Imperial_____.Imperial_________.WindChillTemperature getWindChillTemperature() {
        return windChillTemperature;
    }

    /**
     * @param windChillTemperature The WindChillTemperature
     */
    public void setWindChillTemperature(ApparentTemperature.Imperial_____.Imperial_________.WindChillTemperature windChillTemperature) {
        this.windChillTemperature = windChillTemperature;
    }

    /**
     * @return The wetBulbTemperature
     */
    public ApparentTemperature.Imperial_____.Imperial_________.WetBulbTemperature getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    /**
     * @param wetBulbTemperature The WetBulbTemperature
     */
    public void setWetBulbTemperature(ApparentTemperature.Imperial_____.Imperial_________.WetBulbTemperature wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    /**
     * @return The precip1hr
     */
    public ApparentTemperature.Imperial_____.Imperial_________.Precip1hr getPrecip1hr() {
        return precip1hr;
    }

    /**
     * @param precip1hr The Precip1hr
     */
    public void setPrecip1hr(ApparentTemperature.Imperial_____.Imperial_________.Precip1hr precip1hr) {
        this.precip1hr = precip1hr;
    }

    /**
     * @return The precipitationSummary
     */
    public ApparentTemperature.Imperial_____.Imperial_________.PrecipitationSummary getPrecipitationSummary() {
        return precipitationSummary;
    }

    /**
     * @param precipitationSummary The PrecipitationSummary
     */
    public void setPrecipitationSummary(ApparentTemperature.Imperial_____.Imperial_________.PrecipitationSummary precipitationSummary) {
        this.precipitationSummary = precipitationSummary;
    }

    /**
     * @return The temperatureSummary
     */
    public ApparentTemperature.Imperial_____.Imperial_________.TemperatureSummary getTemperatureSummary() {
        return temperatureSummary;
    }

    /**
     * @param temperatureSummary The TemperatureSummary
     */
    public void setTemperatureSummary(ApparentTemperature.Imperial_____.Imperial_________.TemperatureSummary temperatureSummary) {
        this.temperatureSummary = temperatureSummary;
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

    public class ApparentTemperature {

        @SerializedName("Metric")
        @Expose
        private Imperial_____.Imperial_________.Metric__________ metric;
        @SerializedName("Imperial")
        @Expose
        private Imperial_____.Imperial_________.Imperial__________ imperial;

        /**
         * @return The metric
         */
        public Imperial_____.Imperial_________.Metric__________ getMetric() {
            return metric;
        }

        /**
         * @param metric The Metric
         */
        public void setMetric(Imperial_____.Imperial_________.Metric__________ metric) {
            this.metric = metric;
        }

        /**
         * @return The imperial
         */
        public Imperial_____.Imperial_________.Imperial__________ getImperial() {
            return imperial;
        }

        /**
         * @param imperial The Imperial
         */
        public void setImperial(Imperial_____.Imperial_________.Imperial__________ imperial) {
            this.imperial = imperial;
        }


        public class Ceiling {

            @SerializedName("Metric")
            @Expose
            private Imperial_____.Imperial_________.Metric_______ metric;
            @SerializedName("Imperial")
            @Expose
            private Imperial_____.Imperial_______ imperial;

            /**
             * @return The metric
             */
            public Imperial_____.Imperial_________.Metric_______ getMetric() {
                return metric;
            }

            /**
             * @param metric The Metric
             */
            public void setMetric(Imperial_____.Imperial_________.Metric_______ metric) {
                this.metric = metric;
            }

            /**
             * @return The imperial
             */
            public Imperial_____.Imperial_______ getImperial() {
                return imperial;
            }

            /**
             * @param imperial The Imperial
             */
            public void setImperial(Imperial_____.Imperial_______ imperial) {
                this.imperial = imperial;
            }

        }


        public class DewPofloat {

            @SerializedName("Metric")
            @Expose
            private Imperial_____.Imperial_________.Metric___ metric;
            @SerializedName("Imperial")
            @Expose
            private Imperial___ imperial;

            /**
             * @return The metric
             */
            public Imperial_____.Imperial_________.Metric___ getMetric() {
                return metric;
            }

            /**
             * @param metric The Metric
             */
            public void setMetric(Imperial_____.Imperial_________.Metric___ metric) {
                this.metric = metric;
            }

            /**
             * @return The imperial
             */
            public Imperial___ getImperial() {
                return imperial;
            }

            /**
             * @param imperial The Imperial
             */
            public void setImperial(Imperial___ imperial) {
                this.imperial = imperial;
            }

        }


        public class Direction {

            @SerializedName("Degrees")
            @Expose
            private float degrees;
            @SerializedName("Localized")
            @Expose
            private String localized;
            @SerializedName("English")
            @Expose
            private String english;

            /**
             * @return The degrees
             */
            public float getDegrees() {
                return degrees;
            }

            /**
             * @param degrees The Degrees
             */
            public void setDegrees(float degrees) {
                this.degrees = degrees;
            }

            /**
             * @return The localized
             */
            public String getLocalized() {
                return localized;
            }

            /**
             * @param localized The Localized
             */
            public void setLocalized(String localized) {
                this.localized = localized;
            }

            /**
             * @return The english
             */
            public String getEnglish() {
                return english;
            }

            /**
             * @param english The English
             */
            public void setEnglish(String english) {
                this.english = english;
            }

        }


        public class Imperial {

            @SerializedName("Value")
            @Expose
            private float value;
            @SerializedName("Unit")
            @Expose
            private String unit;
            @SerializedName("UnitType")
            @Expose
            private float unitType;

            /**
             * @return The value
             */
            public float getValue() {
                return value;
            }

            /**
             * @param value The Value
             */
            public void setValue(float value) {
                this.value = value;
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

            /**
             * @return The unitType
             */
            public float getUnitType() {
                return unitType;
            }

            /**
             * @param unitType The UnitType
             */
            public void setUnitType(float unitType) {
                this.unitType = unitType;
            }

        }


        public class Imperial_ {

            @SerializedName("Value")
            @Expose
            private float value;
            @SerializedName("Unit")
            @Expose
            private String unit;
            @SerializedName("UnitType")
            @Expose
            private float unitType;

            /**
             * @return The value
             */
            public float getValue() {
                return value;
            }

            /**
             * @param value The Value
             */
            public void setValue(float value) {
                this.value = value;
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

            /**
             * @return The unitType
             */
            public float getUnitType() {
                return unitType;
            }

            /**
             * @param unitType The UnitType
             */
            public void setUnitType(float unitType) {
                this.unitType = unitType;
            }

        }

        public class Imperial__ {

            @SerializedName("Value")
            @Expose
            private float value;
            @SerializedName("Unit")
            @Expose
            private String unit;
            @SerializedName("UnitType")
            @Expose
            private float unitType;

            /**
             * @return The value
             */
            public float getValue() {
                return value;
            }

            /**
             * @param value The Value
             */
            public void setValue(float value) {
                this.value = value;
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

            /**
             * @return The unitType
             */
            public float getUnitType() {
                return unitType;
            }

            /**
             * @param unitType The UnitType
             */
            public void setUnitType(float unitType) {
                this.unitType = unitType;
            }

        }

        public class Imperial___ {

            @SerializedName("Value")
            @Expose
            private float value;
            @SerializedName("Unit")
            @Expose
            private String unit;
            @SerializedName("UnitType")
            @Expose
            private float unitType;

            /**
             * @return The value
             */
            public float getValue() {
                return value;
            }

            /**
             * @param value The Value
             */
            public void setValue(float value) {
                this.value = value;
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

            /**
             * @return The unitType
             */
            public float getUnitType() {
                return unitType;
            }

            /**
             * @param unitType The UnitType
             */
            public void setUnitType(float unitType) {
                this.unitType = unitType;
            }

        }

        public class Imperial____ {

            @SerializedName("Value")
            @Expose
            private Double value;
            @SerializedName("Unit")
            @Expose
            private String unit;
            @SerializedName("UnitType")
            @Expose
            private float unitType;

            /**
             * @return The value
             */
            public Double getValue() {
                return value;
            }

            /**
             * @param value The Value
             */
            public void setValue(Double value) {
                this.value = value;
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

            /**
             * @return The unitType
             */
            public float getUnitType() {
                return unitType;
            }

            /**
             * @param unitType The UnitType
             */
            public void setUnitType(float unitType) {
                this.unitType = unitType;
            }

        }


        public class Imperial_____ {

            @SerializedName("Value")
            @Expose
            private Double value;
            @SerializedName("Unit")
            @Expose
            private String unit;
            @SerializedName("UnitType")
            @Expose
            private float unitType;

            /**
             * @return The value
             */
            public Double getValue() {
                return value;
            }

            /**
             * @param value The Value
             */
            public void setValue(Double value) {
                this.value = value;
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

            /**
             * @return The unitType
             */
            public float getUnitType() {
                return unitType;
            }

            /**
             * @param unitType The UnitType
             */
            public void setUnitType(float unitType) {
                this.unitType = unitType;
            }


            public class Imperial______ {

                @SerializedName("Value")
                @Expose
                private float value;
                @SerializedName("Unit")
                @Expose
                private String unit;
                @SerializedName("UnitType")
                @Expose
                private float unitType;

                /**
                 * @return The value
                 */
                public float getValue() {
                    return value;
                }

                /**
                 * @param value The Value
                 */
                public void setValue(float value) {
                    this.value = value;
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

                /**
                 * @return The unitType
                 */
                public float getUnitType() {
                    return unitType;
                }

                /**
                 * @param unitType The UnitType
                 */
                public void setUnitType(float unitType) {
                    this.unitType = unitType;
                }

            }

            public class Imperial_______ {

                @SerializedName("Value")
                @Expose
                private float value;
                @SerializedName("Unit")
                @Expose
                private String unit;
                @SerializedName("UnitType")
                @Expose
                private float unitType;

                /**
                 * @return The value
                 */
                public float getValue() {
                    return value;
                }

                /**
                 * @param value The Value
                 */
                public void setValue(float value) {
                    this.value = value;
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

                /**
                 * @return The unitType
                 */
                public float getUnitType() {
                    return unitType;
                }

                /**
                 * @param unitType The UnitType
                 */
                public void setUnitType(float unitType) {
                    this.unitType = unitType;
                }

            }


            public class Imperial________ {

                @SerializedName("Value")
                @Expose
                private Double value;
                @SerializedName("Unit")
                @Expose
                private String unit;
                @SerializedName("UnitType")
                @Expose
                private float unitType;

                /**
                 * @return The value
                 */
                public Double getValue() {
                    return value;
                }

                /**
                 * @param value The Value
                 */
                public void setValue(Double value) {
                    this.value = value;
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

                /**
                 * @return The unitType
                 */
                public float getUnitType() {
                    return unitType;
                }

                /**
                 * @param unitType The UnitType
                 */
                public void setUnitType(float unitType) {
                    this.unitType = unitType;
                }

            }

            public class Imperial_________ {

                @SerializedName("Value")
                @Expose
                private float value;
                @SerializedName("Unit")
                @Expose
                private String unit;
                @SerializedName("UnitType")
                @Expose
                private float unitType;

                /**
                 * @return The value
                 */
                public float getValue() {
                    return value;
                }

                /**
                 * @param value The Value
                 */
                public void setValue(float value) {
                    this.value = value;
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

                /**
                 * @return The unitType
                 */
                public float getUnitType() {
                    return unitType;
                }

                /**
                 * @param unitType The UnitType
                 */
                public void setUnitType(float unitType) {
                    this.unitType = unitType;
                }


                public class Imperial__________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial___________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }

                public class Imperial____________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial_____________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial______________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial_______________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }

                public class Imperial________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial_________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial__________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }

                public class Imperial___________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }

                public class Imperial____________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial_____________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial______________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial_______________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial________________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial_________________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial__________________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Imperial___________________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Maximum {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_______________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_______________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_______________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_______________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_______________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_______________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Maximum_ {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_________________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_________________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_________________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_________________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_________________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_________________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Maximum__ {

                    @SerializedName("Metric")
                    @Expose
                    private Metric___________________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial___________________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric___________________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric___________________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial___________________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial___________________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Metric {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric__ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric___ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric____ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_____ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric______ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_______ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric__________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric___________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric____________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_____________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric______________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_______________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric__________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric___________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric____________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_____________________ {

                    @SerializedName("Value")
                    @Expose
                    private float value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public float getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(float value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric______________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_______________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric________________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric_________________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric__________________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Metric___________________________ {

                    @SerializedName("Value")
                    @Expose
                    private Double value;
                    @SerializedName("Unit")
                    @Expose
                    private String unit;
                    @SerializedName("UnitType")
                    @Expose
                    private float unitType;

                    /**
                     * @return The value
                     */
                    public Double getValue() {
                        return value;
                    }

                    /**
                     * @param value The Value
                     */
                    public void setValue(Double value) {
                        this.value = value;
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

                    /**
                     * @return The unitType
                     */
                    public float getUnitType() {
                        return unitType;
                    }

                    /**
                     * @param unitType The UnitType
                     */
                    public void setUnitType(float unitType) {
                        this.unitType = unitType;
                    }

                }


                public class Minimum {

                    @SerializedName("Metric")
                    @Expose
                    private Metric______________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial______________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric______________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric______________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial______________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial______________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Minimum_ {

                    @SerializedName("Metric")
                    @Expose
                    private Metric________________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial________________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric________________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric________________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial________________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial________________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Minimum__ {

                    @SerializedName("Metric")
                    @Expose
                    private Metric__________________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial__________________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric__________________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric__________________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial__________________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial__________________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past12HourRange {

                    @SerializedName("Minimum")
                    @Expose
                    private Minimum_ minimum;
                    @SerializedName("Maximum")
                    @Expose
                    private Maximum_ maximum;

                    /**
                     * @return The minimum
                     */
                    public Minimum_ getMinimum() {
                        return minimum;
                    }

                    /**
                     * @param minimum The Minimum
                     */
                    public void setMinimum(Minimum_ minimum) {
                        this.minimum = minimum;
                    }

                    /**
                     * @return The maximum
                     */
                    public Maximum_ getMaximum() {
                        return maximum;
                    }

                    /**
                     * @param maximum The Maximum
                     */
                    public void setMaximum(Maximum_ maximum) {
                        this.maximum = maximum;
                    }

                }


                public class Past12Hours {

                    @SerializedName("Metric")
                    @Expose
                    private Metric___________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial___________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric___________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric___________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial___________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial___________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past18Hours {

                    @SerializedName("Metric")
                    @Expose
                    private Metric____________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial____________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric____________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric____________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial____________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial____________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past24HourRange {

                    @SerializedName("Minimum")
                    @Expose
                    private Minimum__ minimum;
                    @SerializedName("Maximum")
                    @Expose
                    private Maximum__ maximum;

                    /**
                     * @return The minimum
                     */
                    public Minimum__ getMinimum() {
                        return minimum;
                    }

                    /**
                     * @param minimum The Minimum
                     */
                    public void setMinimum(Minimum__ minimum) {
                        this.minimum = minimum;
                    }

                    /**
                     * @return The maximum
                     */
                    public Maximum__ getMaximum() {
                        return maximum;
                    }

                    /**
                     * @param maximum The Maximum
                     */
                    public void setMaximum(Maximum__ maximum) {
                        this.maximum = maximum;
                    }

                }


                public class Past24HourTemperatureDeparture {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past24Hours {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_____________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_____________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_____________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_____________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_____________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_____________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past3Hours {

                    @SerializedName("Metric")
                    @Expose
                    private Metric________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past6HourRange {

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

                }


                public class Past6Hours {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Past9Hours {

                    @SerializedName("Metric")
                    @Expose
                    private Metric__________________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial__________________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric__________________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric__________________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial__________________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial__________________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class PastHour {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_______________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_______________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_______________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_______________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_______________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_______________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Precip1hr {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_____________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_____________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_____________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_____________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_____________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_____________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Precipitation {

                    @SerializedName("Metric")
                    @Expose
                    private Metric______________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial______________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric______________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric______________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial______________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial______________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class PrecipitationSummary {

                    @SerializedName("Precipitation")
                    @Expose
                    private Precipitation precipitation;
                    @SerializedName("PastHour")
                    @Expose
                    private PastHour pastHour;
                    @SerializedName("Past3Hours")
                    @Expose
                    private Past3Hours past3Hours;
                    @SerializedName("Past6Hours")
                    @Expose
                    private Past6Hours past6Hours;
                    @SerializedName("Past9Hours")
                    @Expose
                    private Past9Hours past9Hours;
                    @SerializedName("Past12Hours")
                    @Expose
                    private Past12Hours past12Hours;
                    @SerializedName("Past18Hours")
                    @Expose
                    private Past18Hours past18Hours;
                    @SerializedName("Past24Hours")
                    @Expose
                    private Past24Hours past24Hours;

                    /**
                     * @return The precipitation
                     */
                    public Precipitation getPrecipitation() {
                        return precipitation;
                    }

                    /**
                     * @param precipitation The Precipitation
                     */
                    public void setPrecipitation(Precipitation precipitation) {
                        this.precipitation = precipitation;
                    }

                    /**
                     * @return The pastHour
                     */
                    public PastHour getPastHour() {
                        return pastHour;
                    }

                    /**
                     * @param pastHour The PastHour
                     */
                    public void setPastHour(PastHour pastHour) {
                        this.pastHour = pastHour;
                    }

                    /**
                     * @return The past3Hours
                     */
                    public Past3Hours getPast3Hours() {
                        return past3Hours;
                    }

                    /**
                     * @param past3Hours The Past3Hours
                     */
                    public void setPast3Hours(Past3Hours past3Hours) {
                        this.past3Hours = past3Hours;
                    }

                    /**
                     * @return The past6Hours
                     */
                    public Past6Hours getPast6Hours() {
                        return past6Hours;
                    }

                    /**
                     * @param past6Hours The Past6Hours
                     */
                    public void setPast6Hours(Past6Hours past6Hours) {
                        this.past6Hours = past6Hours;
                    }

                    /**
                     * @return The past9Hours
                     */
                    public Past9Hours getPast9Hours() {
                        return past9Hours;
                    }

                    /**
                     * @param past9Hours The Past9Hours
                     */
                    public void setPast9Hours(Past9Hours past9Hours) {
                        this.past9Hours = past9Hours;
                    }

                    /**
                     * @return The past12Hours
                     */
                    public Past12Hours getPast12Hours() {
                        return past12Hours;
                    }

                    /**
                     * @param past12Hours The Past12Hours
                     */
                    public void setPast12Hours(Past12Hours past12Hours) {
                        this.past12Hours = past12Hours;
                    }

                    /**
                     * @return The past18Hours
                     */
                    public Past18Hours getPast18Hours() {
                        return past18Hours;
                    }

                    /**
                     * @param past18Hours The Past18Hours
                     */
                    public void setPast18Hours(Past18Hours past18Hours) {
                        this.past18Hours = past18Hours;
                    }

                    /**
                     * @return The past24Hours
                     */
                    public Past24Hours getPast24Hours() {
                        return past24Hours;
                    }

                    /**
                     * @param past24Hours The Past24Hours
                     */
                    public void setPast24Hours(Past24Hours past24Hours) {
                        this.past24Hours = past24Hours;
                    }

                }


                public class Pressure {

                    @SerializedName("Metric")
                    @Expose
                    private Metric________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class PressureTendency {

                    @SerializedName("LocalizedText")
                    @Expose
                    private String localizedText;
                    @SerializedName("Code")
                    @Expose
                    private String code;

                    /**
                     * @return The localizedText
                     */
                    public String getLocalizedText() {
                        return localizedText;
                    }

                    /**
                     * @param localizedText The LocalizedText
                     */
                    public void setLocalizedText(String localizedText) {
                        this.localizedText = localizedText;
                    }

                    /**
                     * @return The code
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * @param code The Code
                     */
                    public void setCode(String code) {
                        this.code = code;
                    }

                }


                public class RealFeelTemperature {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class RealFeelTemperatureShade {

                    @SerializedName("Metric")
                    @Expose
                    private Metric__ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial__ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric__ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric__ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial__ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial__ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Speed {

                    @SerializedName("Metric")
                    @Expose
                    private Metric____ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial____ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric____ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric____ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial____ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial____ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Speed_ {

                    @SerializedName("Metric")
                    @Expose
                    private Metric_____ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial_____ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric_____ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric_____ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial_____ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial_____ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Temperature {

                    @SerializedName("Metric")
                    @Expose
                    private Metric metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial imperial;

                    /**
                     * @return The metric
                     */
                    public Metric getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial imperial) {
                        this.imperial = imperial;
                    }

                }


                public class TemperatureSummary {

                    @SerializedName("Past6HourRange")
                    @Expose
                    private Past6HourRange past6HourRange;
                    @SerializedName("Past12HourRange")
                    @Expose
                    private Past12HourRange past12HourRange;
                    @SerializedName("Past24HourRange")
                    @Expose
                    private Past24HourRange past24HourRange;

                    /**
                     * @return The past6HourRange
                     */
                    public Past6HourRange getPast6HourRange() {
                        return past6HourRange;
                    }

                    /**
                     * @param past6HourRange The Past6HourRange
                     */
                    public void setPast6HourRange(Past6HourRange past6HourRange) {
                        this.past6HourRange = past6HourRange;
                    }

                    /**
                     * @return The past12HourRange
                     */
                    public Past12HourRange getPast12HourRange() {
                        return past12HourRange;
                    }

                    /**
                     * @param past12HourRange The Past12HourRange
                     */
                    public void setPast12HourRange(Past12HourRange past12HourRange) {
                        this.past12HourRange = past12HourRange;
                    }

                    /**
                     * @return The past24HourRange
                     */
                    public Past24HourRange getPast24HourRange() {
                        return past24HourRange;
                    }

                    /**
                     * @param past24HourRange The Past24HourRange
                     */
                    public void setPast24HourRange(Past24HourRange past24HourRange) {
                        this.past24HourRange = past24HourRange;
                    }

                }


                public class Visibility {

                    @SerializedName("Metric")
                    @Expose
                    private Metric______ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial______ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric______ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric______ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial______ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial______ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class WetBulbTemperature {

                    @SerializedName("Metric")
                    @Expose
                    private Metric____________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial____________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric____________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric____________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial____________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial____________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class Wind {

                    @SerializedName("Direction")
                    @Expose
                    private Direction direction;
                    @SerializedName("Speed")
                    @Expose
                    private Speed speed;

                    /**
                     * @return The direction
                     */
                    public Direction getDirection() {
                        return direction;
                    }

                    /**
                     * @param direction The Direction
                     */
                    public void setDirection(Direction direction) {
                        this.direction = direction;
                    }

                    /**
                     * @return The speed
                     */
                    public Speed getSpeed() {
                        return speed;
                    }

                    /**
                     * @param speed The Speed
                     */
                    public void setSpeed(Speed speed) {
                        this.speed = speed;
                    }

                }


                public class WindChillTemperature {

                    @SerializedName("Metric")
                    @Expose
                    private Metric___________ metric;
                    @SerializedName("Imperial")
                    @Expose
                    private Imperial___________ imperial;

                    /**
                     * @return The metric
                     */
                    public Metric___________ getMetric() {
                        return metric;
                    }

                    /**
                     * @param metric The Metric
                     */
                    public void setMetric(Metric___________ metric) {
                        this.metric = metric;
                    }

                    /**
                     * @return The imperial
                     */
                    public Imperial___________ getImperial() {
                        return imperial;
                    }

                    /**
                     * @param imperial The Imperial
                     */
                    public void setImperial(Imperial___________ imperial) {
                        this.imperial = imperial;
                    }

                }


                public class WindGust {

                    @SerializedName("Speed")
                    @Expose
                    private Speed_ speed;

                    /**
                     * @return The speed
                     */
                    public Speed_ getSpeed() {
                        return speed;
                    }

                    /**
                     * @param speed The Speed
                     */
                    public void setSpeed(Speed_ speed) {
                        this.speed = speed;
                    }

                }

            }
        }
    }
}




