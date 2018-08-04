#include <lyf_ndkstudy2_MyNDK.h>

JNIEXPORT jint JNICALL Java_lyf_ndkstudy2_MyNDK_add
  (JNIEnv *, jclass, jint a, jint b){

  return a+b;
}

