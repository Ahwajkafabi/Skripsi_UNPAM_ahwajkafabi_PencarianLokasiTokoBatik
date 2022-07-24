package com.ahwajkafabi.tokobatikpekalongan;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PetabatikActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petabatik);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng museumbatik = new LatLng(-6.87861, 109.67547);
        mMap.addMarker(new MarkerOptions().position(museumbatik).title("Pekalongan's Batik Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museumbatik));

        // Add a marker in Sydney and move the camera
        LatLng ibc = new LatLng(-6.89159, 109.62511);
        mMap.addMarker(new MarkerOptions().position(ibc).title("Internasional Batik Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ibc));

        // Add a marker in Sydney and move the camera
        LatLng batikjlamprang = new LatLng(-6.88207, 109.67967);
        mMap.addMarker(new MarkerOptions().position(batikjlamprang).title("Batik monument Jlamprang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batikjlamprang));

        // Add a marker in Sydney and move the camera
        LatLng batikkauman = new LatLng(-6.88977, 109.67323);
        mMap.addMarker(new MarkerOptions().position(batikkauman).title("Kampoeng Batik Kauman - Pekalongan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batikkauman));

        // Add a marker in Sydney and move the camera
        LatLng batikpesindon = new LatLng(-6.88836, 109.671);
        mMap.addMarker(new MarkerOptions().position(batikpesindon).title("KAMPUNG BATIK PESINDON PEKALONGAN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batikpesindon));

        // Add a marker in Sydney and move the camera
        LatLng batiksumilir = new LatLng(-6.89479, 109.61673);
        mMap.addMarker(new MarkerOptions().position(batiksumilir).title("Kampung Batik Gemah Sumilir"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batiksumilir));

        // Add a marker in Sydney and move the camera
        LatLng batikwiradesa = new LatLng(-6.89133, 109.61737);
        mMap.addMarker(new MarkerOptions().position(batikwiradesa).title("KAMPUNG BATIK WIRADESA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batikwiradesa));

        // Add a marker in Sydney and move the camera
        LatLng batikmedono = new LatLng(-6.90259, 109.66975);
        mMap.addMarker(new MarkerOptions().position(batikmedono).title("tenun ATBM medono"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(batikmedono));

        // Add a marker in Sydney and move the camera
        LatLng sapuro = new LatLng(-6.89735, 109.67394);
        mMap.addMarker(new MarkerOptions().position(sapuro).title("Makam Al Habib Ahmad bin Abdullah bin Thalib Alatas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sapuro));

        // Add a marker in Sydney and move the camera
        LatLng pasarsetono = new LatLng(-6.90271, 109.6902);
        mMap.addMarker(new MarkerOptions().position(pasarsetono).title("Pasar Grosir Batik Setono Kota Pekalongan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pasarsetono));

        // Add a marker in Grosir and move the camera
        LatLng grosir = new LatLng(-6.90082, 109.66721);
        mMap.addMarker(new MarkerOptions().position(grosir).title("PUSAT GROSIR BATIK PEKALONGAN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(grosir));

        // Add a marker in Plaza Matahari and move the camera
        LatLng plazamatahari = new LatLng(-6.89045, 109.67787);
        mMap.addMarker(new MarkerOptions().position(plazamatahari).title("Matahari Department Store Pekalongan Plaza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(plazamatahari));

        // Add a marker in Pekalongan Square and move the camera
        LatLng square = new LatLng(-6.90145, 109.68226);
        mMap.addMarker(new MarkerOptions().position(square).title("Pekalongan Square"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(square));

    }
}