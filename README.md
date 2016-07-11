
Functionalities :

   All the functionalities discussed except 
   1. Deeplinking a location . Lat long deeplinking is done , location deeplinking needs some more boiler plate , so leaving it due to time constraint.
   2. 5 day  forecast instead of 7day.

Deeplinking url : 
					http://www.jumbotail.com/app/weather?lat=17.7389&lng=83.1225

Api used:
	AccuWeather Api for weather data and icons
	Flickr Api for background image

External Libs used:
	Volley - For network reqs and it's image loader for image fetching and caching 
	Volley takes care of caching provided the response headers has an expiry token

Optimization:
	All background image requests are made based on the combination of current network type and device resolution type .

Optimizations that can be made :
	Based on the device details such as network type , resolution , battery type and free memory , A variety of combinations can be tried out to make caching efficient and the app responsive.

Areas MORE focused : Modularity and readability 
					           Search for relevant Api

Areas NOT focused  : Null pointer checks
				             Animations and UI

Developed and tested on (FYI): Samsung Galaxy Note 4 , Android 23

