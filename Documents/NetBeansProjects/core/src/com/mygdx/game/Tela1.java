package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

class Tela1 implements Screen
{
  Main game = null;
  Texture telaFundo, botaoTb, botaoSair, botaoTc, botaoSairClick, botaoTcClick, botaoTbClick;
  //Botao B
  int botaoTbLar = 111;
  int botaoTbAlt = 49;
  int botaoTbX = 500;
  int botaoTbY = 240;
  //Botao C
  int botaoTcAlt = 49;
  int botaoTcLar = 111;
  int botaoTcX = 500;
  int botaoTcY = 175;
  //Botao Sair
  int botaoSairAlt = 49;
  int botaoSairLar = 111;
  int botaoSairX = 500;
  int botaoSairY = 110;
  

  public Tela1(final Main game)
  {
    this.game = game;
    telaFundo = new Texture(Gdx.files.internal("TelaA.jpg"));
    botaoSair = new Texture(Gdx.files.internal("btn_sair.png"));
    botaoSairClick = new Texture(Gdx.files.internal("btn_sair_click.png"));
    botaoTb = new Texture(Gdx.files.internal("btn_telaB.png"));
    botaoTbClick = new Texture(Gdx.files.internal("btn_telaB_click.png"));
    botaoTc = new Texture(Gdx.files.internal("btn_telaC.png"));
    botaoTcClick = new Texture(Gdx.files.internal("btn_telaC_click.png"));

    final Tela1 telaA = this;

    Gdx.input.setInputProcessor(new InputAdapter()
    {
      @Override
      public boolean touchDown(int screenX, int screenY, int pointer, int button)
      {
        if (testaBotaoTelaB(screenX, screenY))
        {
          telaA.dispose();
          game.setScreen(new Tela2(game));
        }
        if (testaBotaoTelaC(screenX, screenY))
        {
          telaA.dispose();
          game.setScreen(new Tela3(game));
        }
        if (testaBotaoSair(screenX, screenY))
        {
          telaA.dispose();
          Gdx.app.exit();
        }
        return true;
      }
    });
  }

  public boolean testaBotaoSair(float x, float y)
  {
    return x > botaoSairX
            && x < botaoSairX + botaoSairLar
            && y < game.ALTURA - botaoSairY
            && y > game.ALTURA - (botaoSairY + botaoSairAlt);
  }
  
  public boolean testaBotaoTelaB(float x, float y)
  {
    return x > botaoTbX
            && x < botaoTbX + botaoTbLar
            && y < game.ALTURA - botaoTbY
            && y > game.ALTURA - (botaoTbY + botaoTbAlt);
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

    if (testaBotaoSair(Gdx.input.getX(), Gdx.input.getY()))
    {
      game.batch.draw(botaoSairClick, botaoSairX, botaoSairY);
    }
    else
    {
      game.batch.draw(botaoSair, botaoSairX, botaoSairY);
    }
    
    if (testaBotaoTelaB(Gdx.input.getX(), Gdx.input.getY()))
    {
      game.batch.draw(botaoTbClick, botaoTbX, botaoTbY);
    }
    else
    {
      game.batch.draw(botaoTb, botaoTbX, botaoTbY);
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
    botaoSair.dispose();
    botaoSairClick.dispose();
    botaoTb.dispose();
    botaoTbClick.dispose();
  }

}
