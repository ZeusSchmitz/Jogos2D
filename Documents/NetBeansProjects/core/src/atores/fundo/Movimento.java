package atores.fundo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Movimento extends Actor
{
  NaveJog nave;
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
  
  int x = (int) getX();
  int y = (int) getY();
  public int sobeNave(Texture img, int pos)
  {
    if ((pos + img.getHeight()) <= (Gdx.graphics.getHeight() - 10))
    {
      return pos += 10;
    }
    return Gdx.graphics.getHeight() - 58; 
  }

  public int desceNave(Texture img, int pos)
  {
    if ((pos + img.getHeight()) >= (img.getHeight() + 10))
    {
      return pos -= 10;
    }
    return 0;
  }

  public int dirNave(Texture img, int pos)
  {
    if (pos + img.getWidth() <= Gdx.graphics.getWidth())
    {
      return pos += 10;
    }
    return Gdx.graphics.getWidth()-90;
  }
  public int esqNave(Texture img, int pos)
  {
    if (pos + img.getWidth() >= (img.getWidth()+10))
    {
      return pos -= 10;
    }
    return 0;
  }
}
