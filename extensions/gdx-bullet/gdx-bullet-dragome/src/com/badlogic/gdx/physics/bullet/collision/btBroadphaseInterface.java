/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

/** @author xpenatan */
public class btBroadphaseInterface extends BulletBase {

    btOverlappingPairCache overlappingPairCache = new btOverlappingPairCache(0, false);

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btBroadphaseInterface);",this);
	}

    public btOverlappingPairCache getOverlappingPairCache() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		if(overlappingPairCache.cPointer == 0) {
			long addr = com.dragome.commons.javascript.ScriptHelper.evalLong("jsObj.getOverlappingPairCache();",this);
			com.dragome.commons.javascript.ScriptHelper.evalNoResult("addr=Bullet.getPointer(addr);",this);
			overlappingPairCache.resetObj(addr,false);
		}
		return overlappingPairCache;
    }
}