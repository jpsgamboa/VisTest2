package com.mygdx.vistest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.kotcrab.vis.ui.VisUI;
import com.kotcrab.vis.ui.widget.VisTextArea;

public class Main extends ApplicationAdapter {
	Stage stage;

	String stringThatWontBreak = "Create your UI like always, for extra skin features you have to use Vis widgets instead of standard scene2d.ui";
	String stringThatBreaks = "Create your UI like always, \n for extra skin features you have to use Vis widgets instead of standard scene2d.ui";

	@Override
	public void create () {

		//VisUI.load();
		VisUI.load(Gdx.files.internal("skin/dark.json"));

		VisTextArea textArea = new VisTextArea();
		textArea.setSize(200, 300);
		textArea.setPosition(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2, Align.center);

		textArea.setText(stringThatWontBreak);
		//textArea.setText(stringThatBreaks);

		stage = new Stage(new ScreenViewport());

		stage.addActor(textArea);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}
}
