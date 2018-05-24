package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

class Tela2 implements Screen
{
  Main game = null;
  Texture telaFundo, botaoTa, botaoTc, botaoTcClick, botaoTaClick;
  //Botao A
  int botaoTaLar = 111;
  int botaoTaAlt = 49;
  int botaoTaX = 500;
  int botaoTaY = 240;
  //Botao C
  int botaoTcAlt = 49;
  int botaoTcLar = 111;
  int botaoTcX = 500;
  int botaoTcY = 175;

  public Tela2(final Main game)
  {
    this.game = game;
    telaFundo = new Texture(Gdx.files.internal("TelaB.jpg"));
    botaoTa = new Texture(Gdx.files.internal("btn_telaA.png"));
    botaoTaClick = new Texture(Gdx.files.internal("btn_telaA_click.png"));
    botaoTc = new Texture(Gdx.files.internal("btn_telaC.png"));
    botaoTcClick = new Texture(Gdx.files.internal("btn_telaC_click.png"));

    final Tela2 telaB = this;

    Gdx.input.setInputProcessor(new InputAdapter()
    {
      @Override
      public boolean touchDown(int screenX, int screenY, int pointer, int button)
      {
        if (testaBotaoTelaA(screenX, screenY))
        {
          telaB.dispose();
          game.setScreen(new Tela1(game));
        }
        if (testaBotaoTelaC(screenX, screenY))
        {
          telaB.dispose();
          game.setScreen(new Tela3(game));
        }
        return true;
      }
    });
  }
  
  public boolean testaBotaoTelaA(float x, float y)
  {
    return x > botaoTaX
            && x < botaoTaX + botaoTaLar
            && y < game.ALTURA - botaoTaY
            && y > game.ALTURA - (botaoTaY + botaoTaAlt);
  }
  
  public boolean testaBotaoTelaC(float x, float y)
  {
    return x > botaoTcX
            && x < botaoTcX + botaoTcLar
            && y < game.ALTURA - botaoTcY
            && y > game.ALTURA - (botaoTcY + botaoTcAlt);
  }
  
    @Override
  public void show()
  {

  }

  @Override
  public void render(float f)
  {
    Gdx.gl.glClearColor(1, 1, 1, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    game.batch.begin();
    game.batch.draw(telaFundo, 0, 0);

    if (testaBotaoTelaA(Gdx.input.getX(), Gdx.input.getY()))
    {
      game.batch.draw(botaoTaClick, botaoTaX, botaoTaY);
    }
    else
    {
      game.batch.draw(botaoTa, botaoTaX, botaoTaY);
    }
    if (testaBotaoTelaC(Gdx.input.getX(), Gdx.input.getY()))
    {
      game.batch.draw(botaoTcClick, botaoTcX, botaoTcY);
    }
    else
    {
      game.batch.draw(botaoTc, botaoTcX, botaoTcY);
    }
    game.batch.end();
  }

  @Override
  public void resize(int i, int i1)
  {

  }

  @Override
  public void pause()
  {

  }

  @Override
  public void resume()
  {

  }

  @Override
  public void hide()
  {

  }

  @Override
  public void dispose()
  {
    telaFundo.dispose();
    botaoTa.dispose();
    botaoTaClick.dispose();
  }
}
