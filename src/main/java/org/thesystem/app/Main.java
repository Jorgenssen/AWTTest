package org.thesystem.app;

import org.thesystem.app.core.Window;
import org.thesystem.app.sandbox.Example;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Window window = new Window("Window", 960, 640);
        window.addLayer(new Example("Layer 1", Color.BLUE));
        window.addLayer(new Example("Layer 2", Color.RED));
        window.addLayer(new Example("Layer 3", Color.GREEN));}
}
