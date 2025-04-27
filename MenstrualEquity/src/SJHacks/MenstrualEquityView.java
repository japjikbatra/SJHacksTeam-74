package SJHacks;

import MVCFramework.Model;
import MVCFramework.View;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.Coordinate;

import java.awt.*;

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
    }
}
