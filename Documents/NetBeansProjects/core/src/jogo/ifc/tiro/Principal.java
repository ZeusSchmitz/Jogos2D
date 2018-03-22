package jogo.ifc.tiro;

import atores.fundo.MenuJogo;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Principal extends ApplicationAdapter
{

  Stage mundo;
  MenuJogo menu;
  Sound somFase1;
          

  @Override
  public void create()
  {
    mundo = new Stage();
    menu = new MenuJogo();
//    somFase1  = Gdx.audio.newSound(Gdx.files.absolute("Sons/SomFase1.mp3"));
    mundo.addActor(menu);
  }

  @Override
  public void render()
  {
    Gdx.gl.glClearColor(1, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    mundo.draw();
    mundo.act(Gdx.graphics.getDeltaTime());
    if(Gdx.input.isKeyJustPressed(Keys.P))
    {
      somFase1.play();      
    }
  }

  @Override
  public void dispose()
  {
    mundo.dispose();
  }
}
