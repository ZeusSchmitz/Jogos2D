package atores.fundo;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class FundoFase1 extends Actor
{
  Texture fase1;

  public FundoFase1()
  {
    this.fase1 = new Texture("fase_1.jpg");
  }


  @Override
  public void draw(Batch batch, float parentAlpha)
  {
    super.draw(batch, parentAlpha); 
    batch.draw(fase1, 0, 0);
  }
  
}
