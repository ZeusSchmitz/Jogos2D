package jogo.ifc.tiro.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import jogo.ifc.tiro.Principal;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Principal(), config);
                config.title = "Marte Ataca";
                config.width = 800;
                config.height = 600;
	}
}
