package atores.fundo;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class TiroJog extends Actor
{
  Texture tiroJog;

  public TiroJog()
  {
    this.tiroJog = new Texture("tiro.png");
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
    if(this.getX()>=800)
      tiroJog.dispose();
  }
}
