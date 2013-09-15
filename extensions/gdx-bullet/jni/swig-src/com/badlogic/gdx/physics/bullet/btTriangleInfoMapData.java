/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleInfoMapData extends BulletBase {
	private long swigCPtr;
	
	protected btTriangleInfoMapData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btTriangleInfoMapData(long cPtr, boolean cMemoryOwn) {
		this("btTriangleInfoMapData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btTriangleInfoMapData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTriangleInfoMapData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setHashTablePtr(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btTriangleInfoMapData_hashTablePtr_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getHashTablePtr() {
    return gdxBulletJNI.btTriangleInfoMapData_hashTablePtr_get(swigCPtr, this);
}

  public void setNextPtr(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btTriangleInfoMapData_nextPtr_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getNextPtr() {
    return gdxBulletJNI.btTriangleInfoMapData_nextPtr_get(swigCPtr, this);
}

  public void setValueArrayPtr(btTriangleInfoData value) {
    gdxBulletJNI.btTriangleInfoMapData_valueArrayPtr_set(swigCPtr, this, btTriangleInfoData.getCPtr(value), value);
  }

  public btTriangleInfoData getValueArrayPtr() {
    long cPtr = gdxBulletJNI.btTriangleInfoMapData_valueArrayPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTriangleInfoData(cPtr, false);
  }

  public void setKeyArrayPtr(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btTriangleInfoMapData_keyArrayPtr_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getKeyArrayPtr() {
    return gdxBulletJNI.btTriangleInfoMapData_keyArrayPtr_get(swigCPtr, this);
}

  public void setConvexEpsilon(float value) {
    gdxBulletJNI.btTriangleInfoMapData_convexEpsilon_set(swigCPtr, this, value);
  }

  public float getConvexEpsilon() {
    return gdxBulletJNI.btTriangleInfoMapData_convexEpsilon_get(swigCPtr, this);
  }

  public void setPlanarEpsilon(float value) {
    gdxBulletJNI.btTriangleInfoMapData_planarEpsilon_set(swigCPtr, this, value);
  }

  public float getPlanarEpsilon() {
    return gdxBulletJNI.btTriangleInfoMapData_planarEpsilon_get(swigCPtr, this);
  }

  public void setEqualVertexThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMapData_equalVertexThreshold_set(swigCPtr, this, value);
  }

  public float getEqualVertexThreshold() {
    return gdxBulletJNI.btTriangleInfoMapData_equalVertexThreshold_get(swigCPtr, this);
  }

  public void setEdgeDistanceThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMapData_edgeDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getEdgeDistanceThreshold() {
    return gdxBulletJNI.btTriangleInfoMapData_edgeDistanceThreshold_get(swigCPtr, this);
  }

  public void setZeroAreaThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMapData_zeroAreaThreshold_set(swigCPtr, this, value);
  }

  public float getZeroAreaThreshold() {
    return gdxBulletJNI.btTriangleInfoMapData_zeroAreaThreshold_get(swigCPtr, this);
  }

  public void setNextSize(int value) {
    gdxBulletJNI.btTriangleInfoMapData_nextSize_set(swigCPtr, this, value);
  }

  public int getNextSize() {
    return gdxBulletJNI.btTriangleInfoMapData_nextSize_get(swigCPtr, this);
  }

  public void setHashTableSize(int value) {
    gdxBulletJNI.btTriangleInfoMapData_hashTableSize_set(swigCPtr, this, value);
  }

  public int getHashTableSize() {
    return gdxBulletJNI.btTriangleInfoMapData_hashTableSize_get(swigCPtr, this);
  }

  public void setNumValues(int value) {
    gdxBulletJNI.btTriangleInfoMapData_numValues_set(swigCPtr, this, value);
  }

  public int getNumValues() {
    return gdxBulletJNI.btTriangleInfoMapData_numValues_get(swigCPtr, this);
  }

  public void setNumKeys(int value) {
    gdxBulletJNI.btTriangleInfoMapData_numKeys_set(swigCPtr, this, value);
  }

  public int getNumKeys() {
    return gdxBulletJNI.btTriangleInfoMapData_numKeys_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    gdxBulletJNI.btTriangleInfoMapData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return gdxBulletJNI.btTriangleInfoMapData_padding_get(swigCPtr, this);
  }

  public btTriangleInfoMapData() {
    this(gdxBulletJNI.new_btTriangleInfoMapData(), true);
  }

}
