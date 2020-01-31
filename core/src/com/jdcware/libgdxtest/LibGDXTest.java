package com.jdcware.libgdxtest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jdcware.libgdxtest.entity.Player;

public class LibGDXTest extends ApplicationAdapter {

	private Player player;
	
	@Override
	public void create () {
		player = new Player();
	}

	@Override
	public void render () {
		float delta = Gdx.graphics.getDeltaTime();
		player.update(delta);

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		player.render();
	}
	
	@Override
	public void dispose () {
		player.dispose();
	}
}
