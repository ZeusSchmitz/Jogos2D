package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends Game
{
  public static final int ALTURA = 600;
  public static final int LARGURA = 800;
  public SpriteBatch batch;
  
  @Override
  public void create()
  {
    batch = new SpriteBatch();
    this.setScreen(new Tela1(this));
  }

  @Override
  public void render()
  {
    super.render();
  }

  @Override
  public void dispose()
  {
    batch.dispose();
  }
}
