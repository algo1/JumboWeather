package com.lokesh.jumboweather.apiresponseobjects;

/**
 * Created by lokeshponnada on 7/9/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class YahooTenDayWeatherResponse {


    private Query query;

    /**
     * @return The query
     */
    public Query getQuery() {
        return query;
    }

    /**
     * @param query The query
     */
    public void setQuery(Query query) {
        this.query = query;
    }

    public class Astronomy {

        @SerializedName("sunrise")
        @Expose
        private String sunrise;
        @SerializedName("sunset")
        @Expose
        private String sunset;

        /**
         * @return The sunrise
         */
        public String getSunrise() {
            return sunrise;
        }

        /**
         * @param sunrise The sunrise
         */
        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        /**
         * @return The sunset
         */
        public String getSunset() {
            return sunset;
        }

        /**
         * @param sunset The sunset
         */
        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

    }


    public class Atmosphere {

        @SerializedName("humidity")
        @Expose
        private String humidity;
        @SerializedName("pressure")
        @Expose
        private String pressure;
        @SerializedName("rising")
        @Expose
        private String rising;
        @SerializedName("visibility")
        @Expose
        private String visibility;

        /**
         * @return The humidity
         */
        public String getHumidity() {
            return humidity;
        }

        /**
         * @param humidity The humidity
         */
        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        /**
         * @return The pressure
         */
        public String getPressure() {
            return pressure;
        }

        /**
         * @param pressure The pressure
         */
        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        /**
         * @return The rising
         */
        public String getRising() {
            return rising;
        }

        /**
         * @param rising The rising
         */
        public void setRising(String rising) {
            this.rising = rising;
        }

        /**
         * @return The visibility
         */
        public String getVisibility() {
            return visibility;
        }

        /**
         * @param visibility The visibility
         */
        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

    }


    public class Channel {

        @SerializedName("units")
        @Expose
        private Units units;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("lastBuildDate")
        @Expose
        private String lastBuildDate;
        @SerializedName("ttl")
        @Expose
        private String ttl;
        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("wind")
        @Expose
        private Wind wind;
        @SerializedName("atmosphere")
        @Expose
        private Atmosphere atmosphere;
        @SerializedName("astronomy")
        @Expose
        private Astronomy astronomy;
        @SerializedName("image")
        @Expose
        private Image image;
        @SerializedName("item")
        @Expose
        private Item item;

        /**
         * @return The units
         */
        public Units getUnits() {
            return units;
        }

        /**
         * @param units The units
         */
        public void setUnits(Units units) {
            this.units = units;
        }

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * @return The description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         * @return The language
         */
        public String getLanguage() {
            return language;
        }

        /**
         * @param language The language
         */
        public void setLanguage(String language) {
            this.language = language;
        }

        /**
         * @return The lastBuildDate
         */
        public String getLastBuildDate() {
            return lastBuildDate;
        }

        /**
         * @param lastBuildDate The lastBuildDate
         */
        public void setLastBuildDate(String lastBuildDate) {
            this.lastBuildDate = lastBuildDate;
        }

        /**
         * @return The ttl
         */
        public String getTtl() {
            return ttl;
        }

        /**
         * @param ttl The ttl
         */
        public void setTtl(String ttl) {
            this.ttl = ttl;
        }

        /**
         * @return The location
         */
        public Location getLocation() {
            return location;
        }

        /**
         * @param location The location
         */
        public void setLocation(Location location) {
            this.location = location;
        }

        /**
         * @return The wind
         */
        public Wind getWind() {
            return wind;
        }

        /**
         * @param wind The wind
         */
        public void setWind(Wind wind) {
            this.wind = wind;
        }

        /**
         * @return The atmosphere
         */
        public Atmosphere getAtmosphere() {
            return atmosphere;
        }

        /**
         * @param atmosphere The atmosphere
         */
        public void setAtmosphere(Atmosphere atmosphere) {
            this.atmosphere = atmosphere;
        }

        /**
         * @return The astronomy
         */
        public Astronomy getAstronomy() {
            return astronomy;
        }

        /**
         * @param astronomy The astronomy
         */
        public void setAstronomy(Astronomy astronomy) {
            this.astronomy = astronomy;
        }

        /**
         * @return The image
         */
        public Image getImage() {
            return image;
        }

        /**
         * @param image The image
         */
        public void setImage(Image image) {
            this.image = image;
        }

        /**
         * @return The item
         */
        public Item getItem() {
            return item;
        }

        /**
         * @param item The item
         */
        public void setItem(Item item) {
            this.item = item;
        }

    }


    public class Condition {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("temp")
        @Expose
        private String temp;
        @SerializedName("text")
        @Expose
        private String text;

        /**
         * @return The code
         */
        public String getCode() {
            return code;
        }

        /**
         * @param code The code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         * @return The date
         */
        public String getDate() {
            return date;
        }

        /**
         * @param date The date
         */
        public void setDate(String date) {
            this.date = date;
        }

        /**
         * @return The temp
         */
        public String getTemp() {
            return temp;
        }

        /**
         * @param temp The temp
         */
        public void setTemp(String temp) {
            this.temp = temp;
        }

        /**
         * @return The text
         */
        public String getText() {
            return text;
        }

        /**
         * @param text The text
         */
        public void setText(String text) {
            this.text = text;
        }

    }

    public class Forecast {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("day")
        @Expose
        private String day;
        @SerializedName("high")
        @Expose
        private String high;
        @SerializedName("low")
        @Expose
        private String low;
        @SerializedName("text")
        @Expose
        private String text;

        /**
         * @return The code
         */
        public String getCode() {
            return code;
        }

        /**
         * @param code The code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         * @return The date
         */
        public String getDate() {
            return date;
        }

        /**
         * @param date The date
         */
        public void setDate(String date) {
            this.date = date;
        }

        /**
         * @return The day
         */
        public String getDay() {
            return day;
        }

        /**
         * @param day The day
         */
        public void setDay(String day) {
            this.day = day;
        }

        /**
         * @return The high
         */
        public String getHigh() {
            return high;
        }

        /**
         * @param high The high
         */
        public void setHigh(String high) {
            this.high = high;
        }

        /**
         * @return The low
         */
        public String getLow() {
            return low;
        }

        /**
         * @param low The low
         */
        public void setLow(String low) {
            this.low = low;
        }

        /**
         * @return The text
         */
        public String getText() {
            return text;
        }

        /**
         * @param text The text
         */
        public void setText(String text) {
            this.text = text;
        }

    }

    public class Guid {

        @SerializedName("isPermaLink")
        @Expose
        private String isPermaLink;

        /**
         * @return The isPermaLink
         */
        public String getIsPermaLink() {
            return isPermaLink;
        }

        /**
         * @param isPermaLink The isPermaLink
         */
        public void setIsPermaLink(String isPermaLink) {
            this.isPermaLink = isPermaLink;
        }

    }


    public class Image {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("url")
        @Expose
        private String url;

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The width
         */
        public String getWidth() {
            return width;
        }

        /**
         * @param width The width
         */
        public void setWidth(String width) {
            this.width = width;
        }

        /**
         * @return The height
         */
        public String getHeight() {
            return height;
        }

        /**
         * @param height The height
         */
        public void setHeight(String height) {
            this.height = height;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

    }


    public class Item {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("lat")
        @Expose
        private String lat;
        @SerializedName("long")
        @Expose
        private String _long;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("pubDate")
        @Expose
        private String pubDate;
        @SerializedName("condition")
        @Expose
        private Condition condition;
        @SerializedName("forecast")
        @Expose
        private List<Forecast> forecast = new ArrayList<Forecast>();
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("guid")
        @Expose
        private Guid guid;

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The lat
         */
        public String getLat() {
            return lat;
        }

        /**
         * @param lat The lat
         */
        public void setLat(String lat) {
            this.lat = lat;
        }

        /**
         * @return The _long
         */
        public String getLong() {
            return _long;
        }

        /**
         * @param _long The long
         */
        public void setLong(String _long) {
            this._long = _long;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * @return The pubDate
         */
        public String getPubDate() {
            return pubDate;
        }

        /**
         * @param pubDate The pubDate
         */
        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        /**
         * @return The condition
         */
        public Condition getCondition() {
            return condition;
        }

        /**
         * @param condition The condition
         */
        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        /**
         * @return The forecast
         */
        public List<Forecast> getForecast() {
            return forecast;
        }

        /**
         * @param forecast The forecast
         */
        public void setForecast(List<Forecast> forecast) {
            this.forecast = forecast;
        }

        /**
         * @return The description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         * @return The guid
         */
        public Guid getGuid() {
            return guid;
        }

        /**
         * @param guid The guid
         */
        public void setGuid(Guid guid) {
            this.guid = guid;
        }

    }

    public class Location {

        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("region")
        @Expose
        private String region;

        /**
         * @return The city
         */
        public String getCity() {
            return city;
        }

        /**
         * @param city The city
         */
        public void setCity(String city) {
            this.city = city;
        }

        /**
         * @return The country
         */
        public String getCountry() {
            return country;
        }

        /**
         * @param country The country
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         * @return The region
         */
        public String getRegion() {
            return region;
        }

        /**
         * @param region The region
         */
        public void setRegion(String region) {
            this.region = region;
        }

    }


    public class Query {

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("created")
        @Expose
        private String created;
        @SerializedName("lang")
        @Expose
        private String lang;
        @SerializedName("results")
        @Expose
        private Results results;

        /**
         * @return The count
         */
        public Integer getCount() {
            return count;
        }

        /**
         * @param count The count
         */
        public void setCount(Integer count) {
            this.count = count;
        }

        /**
         * @return The created
         */
        public String getCreated() {
            return created;
        }

        /**
         * @param created The created
         */
        public void setCreated(String created) {
            this.created = created;
        }

        /**
         * @return The lang
         */
        public String getLang() {
            return lang;
        }

        /**
         * @param lang The lang
         */
        public void setLang(String lang) {
            this.lang = lang;
        }

        /**
         * @return The results
         */
        public Results getResults() {
            return results;
        }

        /**
         * @param results The results
         */
        public void setResults(Results results) {
            this.results = results;
        }

    }


    public class Results {

        @Expose
        private Channel channel;

        /**
         * @return The channel
         */
        public Channel getChannel() {
            return channel;
        }

        /**
         * @param channel The channel
         */
        public void setChannel(Channel channel) {
            this.channel = channel;
        }

    }

    public class Units {

        @SerializedName("distance")
        @Expose
        private String distance;
        @SerializedName("pressure")
        @Expose
        private String pressure;
        @SerializedName("speed")
        @Expose
        private String speed;
        @SerializedName("temperature")
        @Expose
        private String temperature;

        /**
         * @return The distance
         */
        public String getDistance() {
            return distance;
        }

        /**
         * @param distance The distance
         */
        public void setDistance(String distance) {
            this.distance = distance;
        }

        /**
         * @return The pressure
         */
        public String getPressure() {
            return pressure;
        }

        /**
         * @param pressure The pressure
         */
        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        /**
         * @return The speed
         */
        public String getSpeed() {
            return speed;
        }

        /**
         * @param speed The speed
         */
        public void setSpeed(String speed) {
            this.speed = speed;
        }

        /**
         * @return The temperature
         */
        public String getTemperature() {
            return temperature;
        }

        /**
         * @param temperature The temperature
         */
        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

    }

    public class Wind {

        @SerializedName("chill")
        @Expose
        private String chill;
        @SerializedName("direction")
        @Expose
        private String direction;
        @SerializedName("speed")
        @Expose
        private String speed;

        /**
         * @return The chill
         */
        public String getChill() {
            return chill;
        }

        /**
         * @param chill The chill
         */
        public void setChill(String chill) {
            this.chill = chill;
        }

        /**
         * @return The direction
         */
        public String getDirection() {
            return direction;
        }

        /**
         * @param direction The direction
         */
        public void setDirection(String direction) {
            this.direction = direction;
        }

        /**
         * @return The speed
         */
        public String getSpeed() {
            return speed;
        }

        /**
         * @param speed The speed
         */
        public void setSpeed(String speed) {
            this.speed = speed;
        }

    }

}
