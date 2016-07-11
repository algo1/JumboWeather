package com.lokesh.jumboweather.apiresponseobjects;

/**
 * Created by lokeshponnada on 7/11/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FlickrInterestingPhotosResponse {

    @SerializedName("query")
    @Expose
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

    public class Photo {

        @SerializedName("farm")
        @Expose
        private String farm;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("isfamily")
        @Expose
        private String isfamily;
        @SerializedName("isfriend")
        @Expose
        private String isfriend;
        @SerializedName("ispublic")
        @Expose
        private String ispublic;
        @SerializedName("owner")
        @Expose
        private String owner;
        @SerializedName("secret")
        @Expose
        private String secret;
        @SerializedName("server")
        @Expose
        private String server;
        @SerializedName("title")
        @Expose
        private String title;

        /**
         * @return The farm
         */
        public String getFarm() {
            return farm;
        }

        /**
         * @param farm The farm
         */
        public void setFarm(String farm) {
            this.farm = farm;
        }

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The isfamily
         */
        public String getIsfamily() {
            return isfamily;
        }

        /**
         * @param isfamily The isfamily
         */
        public void setIsfamily(String isfamily) {
            this.isfamily = isfamily;
        }

        /**
         * @return The isfriend
         */
        public String getIsfriend() {
            return isfriend;
        }

        /**
         * @param isfriend The isfriend
         */
        public void setIsfriend(String isfriend) {
            this.isfriend = isfriend;
        }

        /**
         * @return The ispublic
         */
        public String getIspublic() {
            return ispublic;
        }

        /**
         * @param ispublic The ispublic
         */
        public void setIspublic(String ispublic) {
            this.ispublic = ispublic;
        }

        /**
         * @return The owner
         */
        public String getOwner() {
            return owner;
        }

        /**
         * @param owner The owner
         */
        public void setOwner(String owner) {
            this.owner = owner;
        }

        /**
         * @return The secret
         */
        public String getSecret() {
            return secret;
        }

        /**
         * @param secret The secret
         */
        public void setSecret(String secret) {
            this.secret = secret;
        }

        /**
         * @return The server
         */
        public String getServer() {
            return server;
        }

        /**
         * @param server The server
         */
        public void setServer(String server) {
            this.server = server;
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

    }

    public class Query {

        @SerializedName("count")
        @Expose
        private int count;
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
        public int getCount() {
            return count;
        }

        /**
         * @param count The count
         */
        public void setCount(int count) {
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

        @SerializedName("photo")
        @Expose
        private List<Photo> photo = new ArrayList<Photo>();

        /**
         * @return The photo
         */
        public List<Photo> getPhoto() {
            return photo;
        }

        /**
         * @param photo The photo
         */
        public void setPhoto(List<Photo> photo) {
            this.photo = photo;
        }

    }

}

