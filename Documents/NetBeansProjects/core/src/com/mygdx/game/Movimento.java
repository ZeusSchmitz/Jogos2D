package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Movimento extends Actor
{

  private int posX;
  private int posY;

  public int getPosX()
  {
    return posX;
  }

  public void setPosX(int posX)
  {
    this.posX = posX;
  }

  public int getPosY()
  {
    return posY;
  }

  public void setPosY(int posY)
  {
    this.posY = posY;
  }
  
  int x = getPosX();
  int y = getPosY();
  public void sobeNave(Texture img)
  {
    if ((getPosY() + img.getHeight()) <= (Gdx.graphics.getHeight() - 10))
    {
      setPosY(y += 10);
    }
  }

  public void desceNave(Texture img)
  {
    if ((getPosY() + img.getHeight()) >= (img.getHeight() + 10))
    {
      setPosY(y -= 10);
    }
  }

  public void dirNave(Texture img)
  {
    if (getPosX() + img.getWidth() <= Gdx.graphics.getWidth())
    {
      setPosX(x += 10);
    }
  }
  public void esqNave(Texture img)
  {
    if (getPosX() + img.getWidth() >= (img.getWidth()+10))
    {
      setPosX(x -= 10);
    }
  }
}
