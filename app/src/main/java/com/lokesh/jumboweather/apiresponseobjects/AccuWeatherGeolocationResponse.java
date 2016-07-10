package com.lokesh.jumboweather.apiresponseobjects;

/**
 * Created by lokeshponnada on 7/10/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AccuWeatherGeolocationResponse {

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

    public AccuWeatherGeolocationResponse withVersion(Integer version) {
        this.version = version;
        return this;
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

    public AccuWeatherGeolocationResponse withKey(String key) {
        this.key = key;
        return this;
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

    public AccuWeatherGeolocationResponse withType(String type) {
        this.type = type;
        return this;
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

    public AccuWeatherGeolocationResponse withRank(Integer rank) {
        this.rank = rank;
        return this;
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

    public AccuWeatherGeolocationResponse withLocalizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
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

    public AccuWeatherGeolocationResponse withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
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

    public AccuWeatherGeolocationResponse withPrimaryPostalCode(String primaryPostalCode) {
        this.primaryPostalCode = primaryPostalCode;
        return this;
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

    public AccuWeatherGeolocationResponse withRegion(Region region) {
        this.region = region;
        return this;
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

    public AccuWeatherGeolocationResponse withCountry(Country country) {
        this.country = country;
        return this;
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

    public AccuWeatherGeolocationResponse withAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
        return this;
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

    public AccuWeatherGeolocationResponse withTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
        return this;
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

    public AccuWeatherGeolocationResponse withGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
        return this;
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

    public AccuWeatherGeolocationResponse withIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
        return this;
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

    public AccuWeatherGeolocationResponse withSupplementalAdminAreas(List<SupplementalAdminArea> supplementalAdminAreas) {
        this.supplementalAdminAreas = supplementalAdminAreas;
        return this;
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

        public AdministrativeArea withID(String iD) {
            this.iD = iD;
            return this;
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

        public AdministrativeArea withLocalizedName(String localizedName) {
            this.localizedName = localizedName;
            return this;
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

        public AdministrativeArea withEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
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

        public AdministrativeArea withLevel(Integer level) {
            this.level = level;
            return this;
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

        public AdministrativeArea withLocalizedType(String localizedType) {
            this.localizedType = localizedType;
            return this;
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

        public AdministrativeArea withEnglishType(String englishType) {
            this.englishType = englishType;
            return this;
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

        public AdministrativeArea withCountryID(String countryID) {
            this.countryID = countryID;
            return this;
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

        public Country withID(String iD) {
            this.iD = iD;
            return this;
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

        public Country withLocalizedName(String localizedName) {
            this.localizedName = localizedName;
            return this;
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

        public Country withEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
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

        public Elevation withMetric(Metric metric) {
            this.metric = metric;
            return this;
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

        public Elevation withImperial(Imperial imperial) {
            this.imperial = imperial;
            return this;
        }

    }

    public class GeoPosition {

        @SerializedName("Latitude")
        @Expose
        private Double latitude;
        @SerializedName("Longitude")
        @Expose
        private Double longitude;
        @SerializedName("Elevation")
        @Expose
        private Elevation elevation;

        /**
         * @return The latitude
         */
        public Double getLatitude() {
            return latitude;
        }

        /**
         * @param latitude The Latitude
         */
        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public GeoPosition withLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * @return The longitude
         */
        public Double getLongitude() {
            return longitude;
        }

        /**
         * @param longitude The Longitude
         */
        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public GeoPosition withLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
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

        public GeoPosition withElevation(Elevation elevation) {
            this.elevation = elevation;
            return this;
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

        public Imperial withValue(Integer value) {
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

        public Imperial withUnit(String unit) {
            this.unit = unit;
            return this;
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

        public Imperial withUnitType(Integer unitType) {
            this.unitType = unitType;
            return this;
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

        public Metric withValue(Integer value) {
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

        public Metric withUnit(String unit) {
            this.unit = unit;
            return this;
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

        public Metric withUnitType(Integer unitType) {
            this.unitType = unitType;
            return this;
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

        public Region withID(String iD) {
            this.iD = iD;
            return this;
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

        public Region withLocalizedName(String localizedName) {
            this.localizedName = localizedName;
            return this;
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

        public Region withEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
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

        public SupplementalAdminArea withLevel(Integer level) {
            this.level = level;
            return this;
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

        public SupplementalAdminArea withLocalizedName(String localizedName) {
            this.localizedName = localizedName;
            return this;
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

        public SupplementalAdminArea withEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
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
        private Double gmtOffset;
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

        public TimeZone withCode(String code) {
            this.code = code;
            return this;
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

        public TimeZone withName(String name) {
            this.name = name;
            return this;
        }

        /**
         * @return The gmtOffset
         */
        public Double getGmtOffset() {
            return gmtOffset;
        }

        /**
         * @param gmtOffset The GmtOffset
         */
        public void setGmtOffset(Double gmtOffset) {
            this.gmtOffset = gmtOffset;
        }

        public TimeZone withGmtOffset(Double gmtOffset) {
            this.gmtOffset = gmtOffset;
            return this;
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

        public TimeZone withIsDaylightSaving(Boolean isDaylightSaving) {
            this.isDaylightSaving = isDaylightSaving;
            return this;
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

        public TimeZone withNextOffsetChange(Object nextOffsetChange) {
            this.nextOffsetChange = nextOffsetChange;
            return this;
        }

    }

}


