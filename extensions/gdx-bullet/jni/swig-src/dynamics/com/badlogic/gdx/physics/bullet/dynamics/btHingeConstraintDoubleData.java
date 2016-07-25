/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btHingeConstraintDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btHingeConstraintDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHingeConstraintDoubleData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btHingeConstraintDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btHingeConstraintDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btHingeConstraintDoubleData obj) {
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
				DynamicsJNI.delete_btHingeConstraintDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintData value) {
    DynamicsJNI.btHingeConstraintDoubleData_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getTypeConstraintData() {
    long cPtr = DynamicsJNI.btHingeConstraintDoubleData_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setRbAFrame(btTransformDoubleData value) {
    DynamicsJNI.btHingeConstraintDoubleData_rbAFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbAFrame() {
    long cPtr = DynamicsJNI.btHingeConstraintDoubleData_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setRbBFrame(btTransformDoubleData value) {
    DynamicsJNI.btHingeConstraintDoubleData_rbBFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbBFrame() {
    long cPtr = DynamicsJNI.btHingeConstraintDoubleData_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setUseReferenceFrameA(int value) {
    DynamicsJNI.btHingeConstraintDoubleData_useReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getUseReferenceFrameA() {
    return DynamicsJNI.btHingeConstraintDoubleData_useReferenceFrameA_get(swigCPtr, this);
  }

  public void setAngularOnly(int value) {
    DynamicsJNI.btHingeConstraintDoubleData_angularOnly_set(swigCPtr, this, value);
  }

  public int getAngularOnly() {
    return DynamicsJNI.btHingeConstraintDoubleData_angularOnly_get(swigCPtr, this);
  }

  public void setEnableAngularMotor(int value) {
    DynamicsJNI.btHingeConstraintDoubleData_enableAngularMotor_set(swigCPtr, this, value);
  }

  public int getEnableAngularMotor() {
    return DynamicsJNI.btHingeConstraintDoubleData_enableAngularMotor_get(swigCPtr, this);
  }

  public void setMotorTargetVelocity(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_motorTargetVelocity_set(swigCPtr, this, value);
  }

  public float getMotorTargetVelocity() {
    return DynamicsJNI.btHingeConstraintDoubleData_motorTargetVelocity_get(swigCPtr, this);
  }

  public void setMaxMotorImpulse(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_maxMotorImpulse_set(swigCPtr, this, value);
  }

  public float getMaxMotorImpulse() {
    return DynamicsJNI.btHingeConstraintDoubleData_maxMotorImpulse_get(swigCPtr, this);
  }

  public void setLowerLimit(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_lowerLimit_set(swigCPtr, this, value);
  }

  public float getLowerLimit() {
    return DynamicsJNI.btHingeConstraintDoubleData_lowerLimit_get(swigCPtr, this);
  }

  public void setUpperLimit(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_upperLimit_set(swigCPtr, this, value);
  }

  public float getUpperLimit() {
    return DynamicsJNI.btHingeConstraintDoubleData_upperLimit_get(swigCPtr, this);
  }

  public void setLimitSoftness(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_limitSoftness_set(swigCPtr, this, value);
  }

  public float getLimitSoftness() {
    return DynamicsJNI.btHingeConstraintDoubleData_limitSoftness_get(swigCPtr, this);
  }

  public void setBiasFactor(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_biasFactor_set(swigCPtr, this, value);
  }

  public float getBiasFactor() {
    return DynamicsJNI.btHingeConstraintDoubleData_biasFactor_get(swigCPtr, this);
  }

  public void setRelaxationFactor(float value) {
    DynamicsJNI.btHingeConstraintDoubleData_relaxationFactor_set(swigCPtr, this, value);
  }

  public float getRelaxationFactor() {
    return DynamicsJNI.btHingeConstraintDoubleData_relaxationFactor_get(swigCPtr, this);
  }

  public btHingeConstraintDoubleData() {
    this(DynamicsJNI.new_btHingeConstraintDoubleData(), true);
  }

}
