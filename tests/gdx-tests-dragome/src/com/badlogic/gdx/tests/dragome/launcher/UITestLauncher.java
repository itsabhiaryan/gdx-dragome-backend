package com.badlogic.gdx.tests.dragome.launcher;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.dragome.DragomeApplication;
import com.badlogic.gdx.backends.dragome.DragomeApplicationConfiguration;
import com.badlogic.gdx.backends.dragome.DragomeWindow;
import com.badlogic.gdx.backends.dragome.preloader.AssetDownloader.AssetLoaderListener;
import com.badlogic.gdx.backends.dragome.preloader.AssetType;
import com.badlogic.gdx.tests.dragome.examples.UITest;
import com.dragome.web.annotations.PageAlias;

@PageAlias(alias= "UITest")
public class UITestLauncher extends DragomeApplication
{
	@Override
	public ApplicationListener createApplicationListener()
	{
		getPreloader().loadAsset("data/uiskin.atlas", AssetType.Text, null, new AssetLoaderListener<>());
		getPreloader().loadAsset("data/uiskin.json", AssetType.Text, null, new AssetLoaderListener<>());
		getPreloader().loadAsset("data/uiskin.png", AssetType.Image, null, new AssetLoaderListener<>());
		getPreloader().loadAsset("data/default.fnt", AssetType.Text, null, new AssetLoaderListener<>());
		getPreloader().loadAsset("data/default.png", AssetType.Image, null, new AssetLoaderListener<>());
		getPreloader().loadAsset("data/badlogicsmall.jpg", AssetType.Image, null, new AssetLoaderListener<>());
		getPreloader().loadAsset("data/badlogic.jpg", AssetType.Image, null, new AssetLoaderListener<>());
		return new UITest();
	}

	@Override
	public DragomeApplicationConfiguration getConfig()
	{
		return null;
	}

	@Override
	protected void onResize()
	{
		int clientWidth= DragomeWindow.getInnerWidth();
		int clientHeight= DragomeWindow.getInnerHeight();
		getCanvas().setWidth(clientWidth);
		getCanvas().setHeight(clientHeight);
		getCanvas().setCoordinateSpaceWidth(clientWidth);
		getCanvas().setCoordinateSpaceHeight(clientHeight);
		super.onResize();
	}
}
