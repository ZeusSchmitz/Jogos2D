package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

class TiroJog extends Actor
{
  Texture tiroJog;

  public TiroJog(Texture tiroJog)
  {
    this.tiroJog = new Texture("tiro.png");
  }  

  TiroJog()
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void draw(Batch batch, float parentAlpha)
  {
    super.draw(batch, parentAlpha);
    
    batch.draw(tiroJog, this.getX(), this.getY());
  }

  @Override
  public void act(float delta)
  {
    super.act(delta); 
    this.setX(this.getX()+15);
  }
}
