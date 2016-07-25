/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGImpactCollisionAlgorithm extends btActivatingCollisionAlgorithm {
	private long swigCPtr;
	
	protected btGImpactCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btGImpactCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGImpactCollisionAlgorithm, normally you should not need this constructor it's intended for low-level usage. */
	public btGImpactCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
		this("btGImpactCollisionAlgorithm", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btGImpactCollisionAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGImpactCollisionAlgorithm obj) {
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
				CollisionJNI.delete_btGImpactCollisionAlgorithm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGImpactCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
    this(CollisionJNI.new_btGImpactCollisionAlgorithm(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap), true);
  }

  public btManifoldResult internalGetResultOut() {
    long cPtr = CollisionJNI.btGImpactCollisionAlgorithm_internalGetResultOut(swigCPtr, this);
    return (cPtr == 0) ? null : new btManifoldResult(cPtr, false);
  }

  static public class CreateFunc extends btCollisionAlgorithmCreateFunc {
  	private long swigCPtr;
  	
  	protected CreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btGImpactCollisionAlgorithm_CreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CreateFunc, normally you should not need this constructor it's intended for low-level usage. */
  	public CreateFunc(long cPtr, boolean cMemoryOwn) {
  		this("CreateFunc", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btGImpactCollisionAlgorithm_CreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CreateFunc obj) {
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
  				CollisionJNI.delete_btGImpactCollisionAlgorithm_CreateFunc(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public CreateFunc() {
      this(CollisionJNI.new_btGImpactCollisionAlgorithm_CreateFunc(), true);
    }
  
  }

  public static void registerAlgorithm(btCollisionDispatcher dispatcher) {
    CollisionJNI.btGImpactCollisionAlgorithm_registerAlgorithm(btCollisionDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void gimpact_vs_gimpact(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btGImpactShapeInterface shape0, btGImpactShapeInterface shape1) {
    CollisionJNI.btGImpactCollisionAlgorithm_gimpact_vs_gimpact(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btGImpactShapeInterface.getCPtr(shape0), shape0, btGImpactShapeInterface.getCPtr(shape1), shape1);
  }

  public void gimpact_vs_shape(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btGImpactShapeInterface shape0, btCollisionShape shape1, boolean swapped) {
    CollisionJNI.btGImpactCollisionAlgorithm_gimpact_vs_shape(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btGImpactShapeInterface.getCPtr(shape0), shape0, btCollisionShape.getCPtr(shape1), shape1, swapped);
  }

  public void gimpact_vs_compoundshape(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btGImpactShapeInterface shape0, btCompoundShape shape1, boolean swapped) {
    CollisionJNI.btGImpactCollisionAlgorithm_gimpact_vs_compoundshape(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btGImpactShapeInterface.getCPtr(shape0), shape0, btCompoundShape.getCPtr(shape1), shape1, swapped);
  }

  public void gimpact_vs_concave(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btGImpactShapeInterface shape0, btConcaveShape shape1, boolean swapped) {
    CollisionJNI.btGImpactCollisionAlgorithm_gimpact_vs_concave(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btGImpactShapeInterface.getCPtr(shape0), shape0, btConcaveShape.getCPtr(shape1), shape1, swapped);
  }

  public void setFace0(int value) {
    CollisionJNI.btGImpactCollisionAlgorithm_setFace0(swigCPtr, this, value);
  }

  public int getFace0() {
    return CollisionJNI.btGImpactCollisionAlgorithm_getFace0(swigCPtr, this);
  }

  public void setFace1(int value) {
    CollisionJNI.btGImpactCollisionAlgorithm_setFace1(swigCPtr, this, value);
  }

  public int getFace1() {
    return CollisionJNI.btGImpactCollisionAlgorithm_getFace1(swigCPtr, this);
  }

  public void setPart0(int value) {
    CollisionJNI.btGImpactCollisionAlgorithm_setPart0(swigCPtr, this, value);
  }

  public int getPart0() {
    return CollisionJNI.btGImpactCollisionAlgorithm_getPart0(swigCPtr, this);
  }

  public void setPart1(int value) {
    CollisionJNI.btGImpactCollisionAlgorithm_setPart1(swigCPtr, this, value);
  }

  public int getPart1() {
    return CollisionJNI.btGImpactCollisionAlgorithm_getPart1(swigCPtr, this);
  }

}
