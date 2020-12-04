package objects;

import engine.window.GameObject;
import engine.window.OpenGLWindow;
import engine.window.State;
import engine.window.*;

public class Pointer implements GameObject {

    @Override
    public void draw(OpenGLWindow window) {
        window.setColor(1, 1, 255);
        window.fillRect(0.5, -1, 0.005, 2);
    }

    @Override
    public void update(State state) {

    }
}