package atores.fundo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class MenuJogo extends Actor
{
  Texture menu;
  Texture titulo;
  Texture btnSair;
  Texture btnJogar;
  Texture btnClickSair;
  Texture btnClickJogar;
  Texture alterJog;

  public MenuJogo()
  {
    this.menu = new Texture("menu_1.jpg");
    this.btnSair = new Texture("button_sair.png");
    this.btnJogar = new Texture("button_jogar.png");
    this.btnClickJogar = new Texture("button_jogar_click.png");
    this.btnClickSair = new Texture("button_sair_click.png");
    this.titulo = new Texture("titulo.png");
  }

  @Override
  public void draw(Batch batch, float parentAlpha)
  {
    super.draw(batch, parentAlpha); 
    batch.draw(menu, 0, 0);
    batch.draw(titulo, 145, this.getY());
    batch.draw(btnJogar, this.getX(), 175);
    if (Gdx.input.getX()< this.getX()+ btnJogar.getWidth() && Gdx.input.getX() > this.getX() && 600 - Gdx.input.getY() < 190 + 40 && 600 - Gdx.input.getY() > 170)
    {
      if (Gdx.input.isTouched())
      {
        this.dispose();
        batch.draw(btnClickJogar, this.getX(), 175);
        FundoFase2 fase1 = new FundoFase2();
        NaveJogF2 naveFase1 = new NaveJogF2();
        this.getStage().addActor(fase1);
        this.getStage().addActor(naveFase1);
      }
    }
    batch.draw(btnSair, this.getX(), 110);
    if (Gdx.input.getX()< this.getX()+ btnJogar.getWidth() && Gdx.input.getX() > this.getX() && 600 - Gdx.input.getY() < 120 + 40 && 600 - Gdx.input.getY() > 110)
    {
      if (Gdx.input.isTouched())
      {
        batch.draw(btnClickSair, this.getX(), 110);
        Gdx.app.exit();
      }
    }
  }

  @Override
  public void act(float delta)
  {
    super.act(delta); 
    if(this.getY() <= 343)
      setY(this.getY()+5);
    if(this.getX() <= 500)
      setX(this.getX()+10);
  }
  
  public void dispose()
  {
    menu.dispose();
    btnClickJogar.dispose();
    btnClickSair.dispose();
    btnJogar.dispose();
    btnSair.dispose();
    titulo.dispose();
  }
  
}
