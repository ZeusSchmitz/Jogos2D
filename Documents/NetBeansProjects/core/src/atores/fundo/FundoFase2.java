package atores.fundo;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class FundoFase2 extends Actor
{
  Texture fase2;

  public FundoFase2()
  {
    this.fase2 = new Texture("fase_2.jpg");
  }


  @Override
  public void draw(Batch batch, float parentAlpha)
  {
    super.draw(batch, parentAlpha); 
    batch.draw(fase2, 0, 0);
  }
  
}
