package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Movimento;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.AddAction;
import java.util.ArrayList;
import java.util.List;

public class Jogo extends ApplicationAdapter
{

  SpriteBatch batch;
  Texture img, telaJogo, tiroImg;
  Sprite player;
  Sound som;
  
  @Override
  public void create()
  {
    batch = new SpriteBatch();
    img = new Texture("Nave.png");
    telaJogo = new Texture("fase_3.jpg");
    tiroImg = new Texture("tiro.png");
    som = Gdx.audio.newSound(Gdx.files.internal("tiro.mp3"));
  }
  Movimento pos = new Movimento();
  int y = pos.getPosY();
  int x = pos.getPosX();
  int h = 0;
  int xTiro, yTiro;
  int saiTiroX = 60;
  int saiTiroY = 22;

  boolean atirou = false;
  @Override
  public void render()
  {
    if (Gdx.input.isKeyPressed(Keys.UP))
    {
      pos.sobeNave(img);
    }
    if (Gdx.input.isKeyPressed(Keys.DOWN))
    {
      pos.desceNave(img);
    }
    if (Gdx.input.isKeyPressed(Keys.RIGHT))
    {
      pos.dirNave(img);
    }
    if (Gdx.input.isKeyPressed(Keys.LEFT))
    {
      pos.esqNave(img);
    }

    if (Gdx.input.isKeyPressed(Keys.SPACE)) 
    {
//      TiroJog tiroJog = new TiroJog();
//      getStage().addActor(tiroJog);
      atirou = true;
      xTiro = pos.getPosX() + saiTiroX;
      yTiro = pos.getPosY() + saiTiroY;
      som.play();
    }
    
    if (atirou){
      xTiro += 15;
    }
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    batch.begin();
    batch.draw(telaJogo, 0, 0);
    if (atirou){
      batch.draw(tiroImg, xTiro, yTiro);
    }
    batch.draw(img, pos.getPosX(), pos.getPosY());
    batch.end();
  }
  
  @Override
  public void dispose()
  {
    batch.dispose();
    img.dispose();
    tiroImg.dispose();
  }
}
