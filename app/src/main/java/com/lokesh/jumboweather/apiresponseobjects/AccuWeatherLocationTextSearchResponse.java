package com.lokesh.jumboweather.apiresponseobjects;

/**
 * Created by lokeshponnada on 7/11/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AccuWeatherLocationTextSearchResponse {

    @SerializedName("Version")
    @Expose
    private Integer version;
    @SerializedName("Key")
    @Expose
    private String key;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Rank")
    @Expose
    private Integer rank;
    @SerializedName("LocalizedName")
    @Expose
    private String localizedName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;
    @SerializedName("PrimaryPostalCode")
    @Expose
    private String primaryPostalCode;
    @SerializedName("Region")
    @Expose
    private Region region;
    @SerializedName("Country")
    @Expose
    private Country country;
    @SerializedName("AdministrativeArea")
    @Expose
    private AdministrativeArea administrativeArea;
    @SerializedName("TimeZone")
    @Expose
    private TimeZone timeZone;
    @SerializedName("GeoPosition")
    @Expose
    private GeoPosition geoPosition;
    @SerializedName("IsAlias")
    @Expose
    private Boolean isAlias;
    @SerializedName("SupplementalAdminAreas")
    @Expose
    private List<SupplementalAdminArea> supplementalAdminAreas = new ArrayList<SupplementalAdminArea>();

    /**
     * @return The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version The Version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return The key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key The Key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank The Rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return The localizedName
     */
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * @param localizedName The LocalizedName
     */
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    /**
     * @return The englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName The EnglishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * @return The primaryPostalCode
     */
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    /**
     * @param primaryPostalCode The PrimaryPostalCode
     */
    public void setPrimaryPostalCode(String primaryPostalCode) {
        this.primaryPostalCode = primaryPostalCode;
    }

    /**
     * @return The region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * @param region The Region
     */
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
     * @return The country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country The Country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return The administrativeArea
     */
    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * @param administrativeArea The AdministrativeArea
     */
    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    /**
     * @return The timeZone
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone The TimeZone
     */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return The geoPosition
     */
    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    /**
     * @param geoPosition The GeoPosition
     */
    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    /**
     * @return The isAlias
     */
    public Boolean getIsAlias() {
        return isAlias;
    }

    /**
     * @param isAlias The IsAlias
     */
    public void setIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
    }

    /**
     * @return The supplementalAdminAreas
     */
    public List<SupplementalAdminArea> getSupplementalAdminAreas() {
        return supplementalAdminAreas;
    }

    /**
     * @param supplementalAdminAreas The SupplementalAdminAreas
     */
    public void setSupplementalAdminAreas(List<SupplementalAdminArea> supplementalAdminAreas) {
        this.supplementalAdminAreas = supplementalAdminAreas;
    }

    public class AdministrativeArea {

        @SerializedName("ID")
        @Expose
        private String iD;
        @SerializedName("LocalizedName")
        @Expose
        private String localizedName;
        @SerializedName("EnglishName")
        @Expose
        private String englishName;
        @SerializedName("Level")
        @Expose
        private Integer level;
        @SerializedName("LocalizedType")
        @Expose
        private String localizedType;
        @SerializedName("EnglishType")
        @Expose
        private String englishType;
        @SerializedName("CountryID")
        @Expose
        private String countryID;

        /**
         * @return The iD
         */
        public String getID() {
            return iD;
        }

        /**
         * @param iD The ID
         */
        public void setID(String iD) {
            this.iD = iD;
        }

        /**
         * @return The localizedName
         */
        public String getLocalizedName() {
            return localizedName;
        }

        /**
         * @param localizedName The LocalizedName
         */
        public void setLocalizedName(String localizedName) {
            this.localizedName = localizedName;
        }

        /**
         * @return The englishName
         */
        public String getEnglishName() {
            return englishName;
        }

        /**
         * @param englishName The EnglishName
         */
        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }

        /**
         * @return The level
         */
        public Integer getLevel() {
            return level;
        }

        /**
         * @param level The Level
         */
        public void setLevel(Integer level) {
            this.level = level;
        }

        /**
         * @return The localizedType
         */
        public String getLocalizedType() {
            return localizedType;
        }

        /**
         * @param localizedType The LocalizedType
         */
        public void setLocalizedType(String localizedType) {
            this.localizedType = localizedType;
        }

        /**
         * @return The englishType
         */
        public String getEnglishType() {
            return englishType;
        }

        /**
         * @param englishType The EnglishType
         */
        public void setEnglishType(String englishType) {
            this.englishType = englishType;
        }

        /**
         * @return The countryID
         */
        public String getCountryID() {
            return countryID;
        }

        /**
         * @param countryID The CountryID
         */
        public void setCountryID(String countryID) {
            this.countryID = countryID;
        }

    }

    public class Country {

        @SerializedName("ID")
        @Expose
        private String iD;
        @SerializedName("LocalizedName")
        @Expose
        private String localizedName;
        @SerializedName("EnglishName")
        @Expose
        private String englishName;

        /**
         * @return The iD
         */
        public String getID() {
            return iD;
        }

        /**
         * @param iD The ID
         */
        public void setID(String iD) {
            this.iD = iD;
        }

        /**
         * @return The localizedName
         */
        public String getLocalizedName() {
            return localizedName;
        }

        /**
         * @param localizedName The LocalizedName
         */
        public void setLocalizedName(String localizedName) {
            this.localizedName = localizedName;
        }

        /**
         * @return The englishName
         */
        public String getEnglishName() {
            return englishName;
        }

        /**
         * @param englishName The EnglishName
         */
        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }

    }

    public class Elevation {

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

    public class GeoPosition {

        @SerializedName("Latitude")
        @Expose
        private Float latitude;
        @SerializedName("Longitude")
        @Expose
        private Float longitude;
        @SerializedName("Elevation")
        @Expose
        private Elevation elevation;

        /**
         * @return The latitude
         */
        public Float getLatitude() {
            return latitude;
        }

        /**
         * @param latitude The Latitude
         */
        public void setLatitude(Float latitude) {
            this.latitude = latitude;
        }

        /**
         * @return The longitude
         */
        public Float getLongitude() {
            return longitude;
        }

        /**
         * @param longitude The Longitude
         */
        public void setLongitude(Float longitude) {
            this.longitude = longitude;
        }

        /**
         * @return The elevation
         */
        public Elevation getElevation() {
            return elevation;
        }

        /**
         * @param elevation The Elevation
         */
        public void setElevation(Elevation elevation) {
            this.elevation = elevation;
        }

    }

    public class Imperial {

        @SerializedName("Value")
        @Expose
        private Integer value;
        @SerializedName("Unit")
        @Expose
        private String unit;
        @SerializedName("UnitType")
        @Expose
        private Integer unitType;

        /**
         * @return The value
         */
        public Integer getValue() {
            return value;
        }

        /**
         * @param value The Value
         */
        public void setValue(Integer value) {
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
        public Integer getUnitType() {
            return unitType;
        }

        /**
         * @param unitType The UnitType
         */
        public void setUnitType(Integer unitType) {
            this.unitType = unitType;
        }

    }

    public class Metric {

        @SerializedName("Value")
        @Expose
        private Integer value;
        @SerializedName("Unit")
        @Expose
        private String unit;
        @SerializedName("UnitType")
        @Expose
        private Integer unitType;

        /**
         * @return The value
         */
        public Integer getValue() {
            return value;
        }

        /**
         * @param value The Value
         */
        public void setValue(Integer value) {
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
        public Integer getUnitType() {
            return unitType;
        }

        /**
         * @param unitType The UnitType
         */
        public void setUnitType(Integer unitType) {
            this.unitType = unitType;
        }

    }

    public class Region {

        @SerializedName("ID")
        @Expose
        private String iD;
        @SerializedName("LocalizedName")
        @Expose
        private String localizedName;
        @SerializedName("EnglishName")
        @Expose
        private String englishName;

        /**
         * @return The iD
         */
        public String getID() {
            return iD;
        }

        /**
         * @param iD The ID
         */
        public void setID(String iD) {
            this.iD = iD;
        }

        /**
         * @return The localizedName
         */
        public String getLocalizedName() {
            return localizedName;
        }

        /**
         * @param localizedName The LocalizedName
         */
        public void setLocalizedName(String localizedName) {
            this.localizedName = localizedName;
        }

        /**
         * @return The englishName
         */
        public String getEnglishName() {
            return englishName;
        }

        /**
         * @param englishName The EnglishName
         */
        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }

    }

    public class SupplementalAdminArea {

        @SerializedName("Level")
        @Expose
        private Integer level;
        @SerializedName("LocalizedName")
        @Expose
        private String localizedName;
        @SerializedName("EnglishName")
        @Expose
        private String englishName;

        /**
         * @return The level
         */
        public Integer getLevel() {
            return level;
        }

        /**
         * @param level The Level
         */
        public void setLevel(Integer level) {
            this.level = level;
        }

        /**
         * @return The localizedName
         */
        public String getLocalizedName() {
            return localizedName;
        }

        /**
         * @param localizedName The LocalizedName
         */
        public void setLocalizedName(String localizedName) {
            this.localizedName = localizedName;
        }

        /**
         * @return The englishName
         */
        public String getEnglishName() {
            return englishName;
        }

        /**
         * @param englishName The EnglishName
         */
        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }

    }

    public class TimeZone {

        @SerializedName("Code")
        @Expose
        private String code;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("GmtOffset")
        @Expose
        private Float gmtOffset;
        @SerializedName("IsDaylightSaving")
        @Expose
        private Boolean isDaylightSaving;
        @SerializedName("NextOffsetChange")
        @Expose
        private Object nextOffsetChange;

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

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The Name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The gmtOffset
         */
        public Float getGmtOffset() {
            return gmtOffset;
        }

        /**
         * @param gmtOffset The GmtOffset
         */
        public void setGmtOffset(Float gmtOffset) {
            this.gmtOffset = gmtOffset;
        }

        /**
         * @return The isDaylightSaving
         */
        public Boolean getIsDaylightSaving() {
            return isDaylightSaving;
        }

        /**
         * @param isDaylightSaving The IsDaylightSaving
         */
        public void setIsDaylightSaving(Boolean isDaylightSaving) {
            this.isDaylightSaving = isDaylightSaving;
        }

        /**
         * @return The nextOffsetChange
         */
        public Object getNextOffsetChange() {
            return nextOffsetChange;
        }

        /**
         * @param nextOffsetChange The NextOffsetChange
         */
        public void setNextOffsetChange(Object nextOffsetChange) {
            this.nextOffsetChange = nextOffsetChange;
        }

    }

}


