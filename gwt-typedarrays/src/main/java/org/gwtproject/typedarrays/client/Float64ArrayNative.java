/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.typedarrays.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.gwtproject.typedarrays.shared.ArrayBuffer;
import org.gwtproject.typedarrays.shared.Float64Array;

/** JS native implementation of {@link Float64Array}. */
@JsType(isNative = true, name = "Float64Array", namespace = JsPackage.GLOBAL)
public final class Float64ArrayNative extends ArrayBufferViewNative implements Float64Array {

  /**
   * @param buffer
   * @return a {@link Float64Array} instance
   */
  @JsOverlay
  public static Float64ArrayNative create(ArrayBuffer buffer) {
    return new Float64ArrayNative(buffer);
  }
  /**
   * @param buffer
   * @return a {@link Float64Array} instance
   */
  public Float64ArrayNative(ArrayBuffer buffer) {}

  /**
   * @param buffer
   * @param byteOffset
   * @return a {@link Float64Array} instance
   */
  @JsOverlay
  public static Float64ArrayNative create(ArrayBuffer buffer, int byteOffset) {
    return new Float64ArrayNative(buffer, byteOffset);
  }

  /**
   * @param buffer
   * @param byteOffset
   * @return a {@link Float64Array} instance
   */
  public Float64ArrayNative(ArrayBuffer buffer, int byteOffset) {}

  /**
   * @param buffer
   * @param byteOffset
   * @param length
   * @return a {@link Float64Array} instance
   */
  @JsOverlay
  public static Float64ArrayNative create(ArrayBuffer buffer, int byteOffset, int length) {
    return new Float64ArrayNative(buffer, byteOffset, length);
  }

  /**
   * @param buffer
   * @param byteOffset
   * @param length
   * @return a {@link Float64Array} instance
   */
  public Float64ArrayNative(ArrayBuffer buffer, int byteOffset, int length) {}

  /**
   * @param array
   * @return a {@link Float64Array} instance
   */
  @JsOverlay
  public static Float64Array create(double[] array) {
    return new Float64ArrayNative(array);
  }

  /** @param array */
  public Float64ArrayNative(double[] array) {}

  /**
   * @param length
   * @return a {@link Float64Array} instance
   */
  @JsOverlay
  public static Float64ArrayNative create(int length) {
    return new Float64ArrayNative(length);
  }

  /**
   * @param length
   * @return a {@link Float64Array} instance
   */
  public Float64ArrayNative(int length) {}

  //  @Override
  //  @JsOverlay
  //  public double get(int index) {
  //    return Js.<JsArrayLike<Double>>uncheckedCast(this).getAt(index);
  //  }

  @Override
  @JsProperty(name = "length")
  public native int length();

  @Override
  public native void set(double[] array);

  @Override
  public native void set(double[] array, int offset);

  @Override
  public native void set(Float64Array array);

  @Override
  public native void set(Float64Array array, int offset);

  //  @Override
  //  @JsOverlay
  //  public void set(int index, double value) {
  //    Js.<JsArrayLike<Double>>uncheckedCast(this).setAt(index, value);
  //  }

  @Override
  public native Float64Array subarray(int begin);

  @Override
  public native Float64Array subarray(int begin, int end);
}
