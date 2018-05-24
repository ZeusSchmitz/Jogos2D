package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

class Tela3 implements Screen
{
  Main game = null;
  Texture telaFundo, botaoTa, botaoTb, botaoTbClick, botaoTaClick;
  //Botao A
  int botaoTaLar = 111;
  int botaoTaAlt = 49;
  int botaoTaX = 500;
  int botaoTaY = 240;
  //Botao B
  int botaoTbLar = 111;
  int botaoTbAlt = 49;
  int botaoTbX = 500;
  int botaoTbY = 175;

  public Tela3(final Main game)
  {
    this.game = game;
    telaFundo = new Texture(Gdx.files.internal("TelaC.jpg"));
    botaoTa = new Texture(Gdx.files.internal("btn_telaA.png"));
    botaoTaClick = new Texture(Gdx.files.internal("btn_telaA_click.png"));
    botaoTb = new Texture(Gdx.files.internal("btn_telaB.png"));
    botaoTbClick = new Texture(Gdx.files.internal("btn_telaB_click.png"));

    final Tela3 telaC = this;

    Gdx.input.setInputProcessor(new InputAdapter()
    {
      @Override
      public boolean touchDown(int screenX, int screenY, int pointer, int button)
      {
        if (testaBotaoTelaA(screenX, screenY))
        {
          telaC.dispose();
          game.setScreen(new Tela1(game));
        }
        if (testaBotaoTelaB(screenX, screenY))
        {
          telaC.dispose();
          game.setScreen(new Tela2(game));
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
  
  public boolean testaBotaoTelaB(float x, float y)
  {
    return x > botaoTbX
            && x < botaoTbX + botaoTbLar
            && y < game.ALTURA - botaoTbY
            && y > game.ALTURA - (botaoTbY + botaoTbAlt);
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
    if (testaBotaoTelaB(Gdx.input.getX(), Gdx.input.getY()))
    {
      game.batch.draw(botaoTbClick, botaoTbX, botaoTbY);
    }
    else
    {
      game.batch.draw(botaoTb, botaoTbX, botaoTbY);
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
    botaoTb.dispose();
    botaoTbClick.dispose();
  }
}
