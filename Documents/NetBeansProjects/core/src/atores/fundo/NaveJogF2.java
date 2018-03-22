package atores.fundo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class NaveJogF2 extends Actor
{
  Movimento pos = new Movimento();
  Texture naveJog;
  Sound somTiro = Gdx.audio.newSound(Gdx.files.internal("tiro.mp3"));
  public NaveJogF2()
  {
    this.naveJog = new Texture("nave_fase2.png");
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
    if (Gdx.input.isKeyPressed(Input.Keys.UP))
    {
      setY(pos.sobeNave(naveJog, (int) getY()));
    }
    if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
    {
      setY(pos.desceNave(naveJog, (int) getY()));
    }
    if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
    {
      setX(pos.dirNave(naveJog, (int) getX()));
    }
    if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
    {      
      setX(pos.esqNave(naveJog, (int) getX()));
    }
    if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
    {
      TiroJog tiroJog = new TiroJog();
      tiroJog.setX(this.getX()+ 75);
      tiroJog.setY(this.getY()+ 22);
      this.getStage().addActor(tiroJog);
      somTiro.play();
    }
  }
  
}
