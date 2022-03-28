#include<jni.h>
#include<string.h>

//return_type Java_packageName_ActivityName_functionName
jstring Java_com_demo_ndktest_MainActivity_funName(JNIEnv* env, jobject obj) {

    return(*env)->NewStringUTF(env, "Hello World");
}