/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package OpenIGTLink.swig;

public class IGTLndarrayJNI {
  public final static native int IGTL_SIZEOF_CHAR_get();
  public final static native int IGTL_SIZEOF_INT_get();
  public final static native int IGTL_SIZEOF_SHORT_get();
  public final static native int IGTL_SIZEOF_LONG_get();
  public final static native int IGTL_SIZEOF_FLOAT_get();
  public final static native int IGTL_SIZEOF_DOUBLE_get();
  public final static native int IGTL_TYPE_USE_LONG_LONG_get();
  public final static native int IGTL_SIZEOF_LONG_LONG_get();
  public final static native long new_ByteArr(int jarg1);
  public final static native void delete_ByteArr(long jarg1);
  public final static native short ByteArr_getitem(long jarg1, ByteArr jarg1_, int jarg2);
  public final static native void ByteArr_setitem(long jarg1, ByteArr jarg1_, int jarg2, short jarg3);
  public final static native long ByteArr_cast(long jarg1, ByteArr jarg1_);
  public final static native long ByteArr_frompointer(long jarg1);
  public final static native int IGTL_NDARRAY_HEADER_SIZE_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_INT8_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_UINT8_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_INT16_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_UINT16_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_INT32_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_UINT32_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_FLOAT32_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_FLOAT64_get();
  public final static native int IGTL_NDARRAY_STYPE_TYPE_COMPLEX_get();
  public final static native int IGTL_NDARRAY_HOST_TO_NETWORK_get();
  public final static native int IGTL_NDARRAY_NETWORK_TO_HOST_get();
  public final static native void igtl_ndarray_info_type_set(long jarg1, igtl_ndarray_info jarg1_, short jarg2);
  public final static native short igtl_ndarray_info_type_get(long jarg1, igtl_ndarray_info jarg1_);
  public final static native void igtl_ndarray_info_dim_set(long jarg1, igtl_ndarray_info jarg1_, short jarg2);
  public final static native short igtl_ndarray_info_dim_get(long jarg1, igtl_ndarray_info jarg1_);
  public final static native void igtl_ndarray_info_size_set(long jarg1, igtl_ndarray_info jarg1_, long jarg2);
  public final static native long igtl_ndarray_info_size_get(long jarg1, igtl_ndarray_info jarg1_);
  public final static native void igtl_ndarray_info_array_set(long jarg1, igtl_ndarray_info jarg1_, long jarg2);
  public final static native long igtl_ndarray_info_array_get(long jarg1, igtl_ndarray_info jarg1_);
  public final static native long new_igtl_ndarray_info();
  public final static native void delete_igtl_ndarray_info(long jarg1);
  public final static native void igtl_ndarray_init_info(long jarg1, igtl_ndarray_info jarg1_);
  public final static native int igtl_ndarray_alloc_info(long jarg1, igtl_ndarray_info jarg1_, long jarg2);
  public final static native int igtl_ndarray_free_info(long jarg1, igtl_ndarray_info jarg1_);
  public final static native int igtl_ndarray_unpack(int jarg1, long jarg2, long jarg3, igtl_ndarray_info jarg3_, java.math.BigInteger jarg4);
  public final static native int igtl_ndarray_pack(long jarg1, igtl_ndarray_info jarg1_, long jarg2, int jarg3);
  public final static native java.math.BigInteger igtl_ndarray_get_size(long jarg1, igtl_ndarray_info jarg1_, int jarg2);
  public final static native java.math.BigInteger igtl_ndarray_get_crc(long jarg1, igtl_ndarray_info jarg1_, int jarg2, long jarg3);
}
