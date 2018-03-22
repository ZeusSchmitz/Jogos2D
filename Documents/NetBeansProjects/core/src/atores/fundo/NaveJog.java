package atores.fundo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class NaveJog extends Actor
{
  Movimento pos = new Movimento();
  Texture naveJog;
  Sound somTiro = Gdx.audio.newSound(Gdx.files.internal("tiro.mp3"));
  public NaveJog()
  {
    this.naveJog = new Texture("Nave.png");
  }

  @Override
  public void draw(Batch batch, float parentAlpha)
  {
    super.draw(batch, parentAlpha);
    batch.draw(naveJog, getX(), getY());
  }

  @Override
  public void act(float delta)
  {
    super.act(delta); 
    if (Gdx.input.isKeyPressed(Keys.UP))
    {
      setY(pos.sobeNave(naveJog, (int) getY()));
    }
    if (Gdx.input.isKeyPressed(Keys.DOWN))
    {
      setY(pos.desceNave(naveJog, (int) getY()));
    }
    if (Gdx.input.isKeyPressed(Keys.RIGHT))
    {
      setX(pos.dirNave(naveJog, (int) getX()));
    }
    if (Gdx.input.isKeyPressed(Keys.LEFT))
    {      
      setX(pos.esqNave(naveJog, (int) getX()));
    }
    if (Gdx.input.isKeyJustPressed(Keys.SPACE))
    {
      TiroJog tiroJog = new TiroJog();
      tiroJog.setX(this.getX()+ 75);
      tiroJog.setY(this.getY()+ 22);
      this.getStage().addActor(tiroJog);
      somTiro.play();
    }
  }
}
