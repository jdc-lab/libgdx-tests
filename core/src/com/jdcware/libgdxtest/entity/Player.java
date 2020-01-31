package com.jdcware.libgdxtest.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jdcware.libgdxtest.basic.Entity;
import com.jdcware.libgdxtest.basic.Point;

public class Player implements Entity {

    private Point position;
    private SpriteBatch batch;
    private Texture img;

    public Player() {
        batch = new SpriteBatch();
        position = new Point();
        img = new Texture("badlogic.jpg");
    }

    @Override
    public void update(float delta) {
        int movingSpeed = 2;

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            position.y += movingSpeed;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            position.y -= movingSpeed;
        }

        if (position.y < 0) {
            position.y = 0;
        }

        if (position.y > Gdx.graphics.getHeight() - img.getHeight()) {
            position.y = Gdx.graphics.getHeight() - img.getHeight();
        }
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(img, position.x, position.y);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
