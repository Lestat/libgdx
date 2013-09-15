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

public class SoftBodyPoseData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyPoseData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected SoftBodyPoseData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyPoseData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(SoftBodyPoseData obj) {
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
				gdxBulletJNI.delete_SoftBodyPoseData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setRot(SWIGTYPE_p_btMatrix3x3FloatData value) {
    gdxBulletJNI.SoftBodyPoseData_rot_set(swigCPtr, this, SWIGTYPE_p_btMatrix3x3FloatData.getCPtr(value));
  }

  public SWIGTYPE_p_btMatrix3x3FloatData getRot() {
    return new SWIGTYPE_p_btMatrix3x3FloatData(gdxBulletJNI.SoftBodyPoseData_rot_get(swigCPtr, this), true);
  }

  public void setScale(SWIGTYPE_p_btMatrix3x3FloatData value) {
    gdxBulletJNI.SoftBodyPoseData_scale_set(swigCPtr, this, SWIGTYPE_p_btMatrix3x3FloatData.getCPtr(value));
  }

  public SWIGTYPE_p_btMatrix3x3FloatData getScale() {
    return new SWIGTYPE_p_btMatrix3x3FloatData(gdxBulletJNI.SoftBodyPoseData_scale_get(swigCPtr, this), true);
  }

  public void setAqq(SWIGTYPE_p_btMatrix3x3FloatData value) {
    gdxBulletJNI.SoftBodyPoseData_aqq_set(swigCPtr, this, SWIGTYPE_p_btMatrix3x3FloatData.getCPtr(value));
  }

  public SWIGTYPE_p_btMatrix3x3FloatData getAqq() {
    return new SWIGTYPE_p_btMatrix3x3FloatData(gdxBulletJNI.SoftBodyPoseData_aqq_get(swigCPtr, this), true);
  }

  public void setCom(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyPoseData_com_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getCom() {
    long cPtr = gdxBulletJNI.SoftBodyPoseData_com_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setPositions(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyPoseData_positions_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getPositions() {
    long cPtr = gdxBulletJNI.SoftBodyPoseData_positions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setWeights(java.nio.FloatBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.SoftBodyPoseData_weights_set(swigCPtr, this, value);
    }
  }

  public java.nio.FloatBuffer getWeights() {
    return gdxBulletJNI.SoftBodyPoseData_weights_get(swigCPtr, this);
}

  public void setNumPositions(int value) {
    gdxBulletJNI.SoftBodyPoseData_numPositions_set(swigCPtr, this, value);
  }

  public int getNumPositions() {
    return gdxBulletJNI.SoftBodyPoseData_numPositions_get(swigCPtr, this);
  }

  public void setNumWeigts(int value) {
    gdxBulletJNI.SoftBodyPoseData_numWeigts_set(swigCPtr, this, value);
  }

  public int getNumWeigts() {
    return gdxBulletJNI.SoftBodyPoseData_numWeigts_get(swigCPtr, this);
  }

  public void setBvolume(int value) {
    gdxBulletJNI.SoftBodyPoseData_bvolume_set(swigCPtr, this, value);
  }

  public int getBvolume() {
    return gdxBulletJNI.SoftBodyPoseData_bvolume_get(swigCPtr, this);
  }

  public void setBframe(int value) {
    gdxBulletJNI.SoftBodyPoseData_bframe_set(swigCPtr, this, value);
  }

  public int getBframe() {
    return gdxBulletJNI.SoftBodyPoseData_bframe_get(swigCPtr, this);
  }

  public void setRestVolume(float value) {
    gdxBulletJNI.SoftBodyPoseData_restVolume_set(swigCPtr, this, value);
  }

  public float getRestVolume() {
    return gdxBulletJNI.SoftBodyPoseData_restVolume_get(swigCPtr, this);
  }

  public void setPad(int value) {
    gdxBulletJNI.SoftBodyPoseData_pad_set(swigCPtr, this, value);
  }

  public int getPad() {
    return gdxBulletJNI.SoftBodyPoseData_pad_get(swigCPtr, this);
  }

  public SoftBodyPoseData() {
    this(gdxBulletJNI.new_SoftBodyPoseData(), true);
  }

}
