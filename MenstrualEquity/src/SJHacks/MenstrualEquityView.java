package SJHacks;

import MVCFramework.Model;
import MVCFramework.View;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.Coordinate;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class MenstrualEquityView extends View {
    public MenstrualEquityView(Model model) {
        super(model);
        System.setProperty("http.agent", "MenstrualEquityApp/1.0 (japji.batra@sjsu.edu)");

        // Set layout so components display correctly
        this.setLayout(new BorderLayout());

        // Create map viewer and configure it
        JMapViewer mapViewer = new JMapViewer();
        mapViewer.setDisplayPosition(new Coordinate(37.3394, -121.8863), 12);
        mapViewer.addMapMarker(new MapMarkerDot(37.3394, -121.8863));

        // Add the map to this view panel
        this.add(mapViewer, BorderLayout.CENTER);

        JTextField addressField = new JTextField();
        JButton searchButton = new JButton("Search");

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.add(addressField, BorderLayout.CENTER);
        searchPanel.add(searchButton, BorderLayout.EAST);

        this.add(searchPanel, BorderLayout.NORTH);
/*
        // Sample locations (to be dynamically fetched or added)
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Almaden Lake Park - 6099 Winfield Blvd", new Coordinate(37.2530, -121.8644)));
        locations.add(new Location("Almaden Community Center - 6445 Camden Ave", new Coordinate(37.2535, -121.8785)));
        locations.add(new Location("Almaden Branch Library - 6445 Camden Ave", new Coordinate(37.2518, -121.8801)));

        // Add buttons for locations and markers to the map
        for (Location loc : locations) {
            JButton button = new JButton(loc.getAddress());
            button.setActionCommand(loc.getAddress());
            button.addActionListener(e -> {
                // Zoom to location when button is clicked
                mapViewer.setDisplayPosition(loc.getCoordinate(), 14);
                mapViewer.addMapMarker(new MapMarkerDot(loc.getCoordinate()));
            });
            searchPanel.add(button, BorderLayout.SOUTH);
        }
*/

        searchButton.addActionListener(e -> {
            try {
                String address = URLEncoder.encode(addressField.getText(), "UTF-8");
                String urlStr = "https://nominatim.openstreetmap.org/search?q=" + address + "&format=json";

                URL url = new URL(urlStr);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("User-Agent", "MenstrualEquityApp/1.0 (japji.batra@sjsu.edu)");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                String json = response.toString();
                int latIndex = json.indexOf("\"lat\":\"");
                int lonIndex = json.indexOf("\"lon\":\"");
                if (latIndex != -1 && lonIndex != -1) {
                    int latEnd = json.indexOf("\"", latIndex + 7);
                    int lonEnd = json.indexOf("\"", lonIndex + 7);

                    double lat = Double.parseDouble(json.substring(latIndex + 7, latEnd));
                    double lon = Double.parseDouble(json.substring(lonIndex + 7, lonEnd));

                    Coordinate coord = new Coordinate(lat, lon);
                    mapViewer.setDisplayPosition(coord, 12);
                    mapViewer.addMapMarker(new MapMarkerDot(coord));
                } else {
                    JOptionPane.showMessageDialog(this, "Address not found.");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error searching address.");
            }
        });
    }
}
