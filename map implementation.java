//open the build.gradle file for your app and add the following lines to the dependencies section:
implementation 'com.google.firebase:firebase-core:16.0.9'
implementation 'com.google.firebase:firebase-database:18.0.0'
//initialize Firebase by adding the following lines of code:
FirebaseApp.initializeApp(this);
DatabaseReference database = FirebaseDatabase.getInstance().getReference();
//To display a map in your app, you will need to add a MapView to your layout file. You can do this by adding the following code to your layout file:
<com.google.android.gms.maps.MapView
    android:id="@+id/mapView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
 //In your activity, you can then get a reference to the MapView and set it up like this:
 MapView mapView = findViewById(R.id.mapView);
mapView.onCreate(savedInstanceState);
mapView.getMapAsync(new OnMapReadyCallback() {
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Do something with the map here
    }
});
//To add a marker to the map, you can use the following code:
LatLng location = new LatLng(latitude, longitude);
googleMap.addMarker(new MarkerOptions().position(location));
//https://developers.google.com/maps/documentation/android-sdk/overview
//needs futher encoding
