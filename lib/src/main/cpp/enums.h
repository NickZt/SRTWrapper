#include <jni.h>

#include "srt/srt.h"

#ifdef __cplusplus
extern "C" {
#endif

#define ENUM_PACKAGE "com.github.thibaultbee.srtwrapper.enums"

#define ERRORTYPE_CLASS "com/github/thibaultbee/srtwrapper/enums/ErrorType"
#define SOCKOPT_CLASS "com/github/thibaultbee/srtwrapper/enums/SockOpt"
#define SOCKSTATUS_CLASS "com/github/thibaultbee/srtwrapper/enums/SockStatus"

/**
 * @brief Convert Java address family to native value
 *
 * @param env Java environment
 * @param addressFamily Java address family enumeration member
 * @return return corresponding native address family value
 */
int address_family_j2n(JNIEnv *env, jobject addressFamily);

/**
 * @brief Convert Java SRT Option to native value
 *
 * @param env Java environment
 * @param sockOpt Java SRT Option enumeration member
 * @return return corresponding native SRT option value
 */
int srt_sockopt_j2n(JNIEnv *env, jobject sockOpt);

/**
 * @brief Convert Java SRT Transtype to native value
 *
 * @param env Java environment
 * @param transType Java SRT TransType enumeration member
 * @return return corresponding native SRT option value
 */
SRT_TRANSTYPE srt_transtype_j2n(JNIEnv *env, jobject transType);

/**
 * @brief Convert Java SRT KMState to native value
 *
 * @param env Java environment
 * @param kmState Java SRT KMState enumeration member
 * @return return corresponding native SRT option value
 */
SRT_KM_STATE srt_kmstate_j2n(JNIEnv *env, jobject kmState);

/**
 * @brief Convert native SRT_SOCKSTATUS to Java SRT SockStatus
 *
 * @param env Java environment
 * @param sockstatus Native SRT_SOCKSTATUS
 * @return return corresponding Java SRT SockStatus
 */
jobject srt_sockstatus_n2j(JNIEnv *env, SRT_SOCKSTATUS sockstatus);

/**
 * @brief Convert Java SRT error to native SRT error
 *
 * @param env Java environment
 * @param errorType Java SRT error
 * @return return corresponding Java SRT error
 */
int srt_error_j2n(JNIEnv *env, jobject errorType);

/**
 * @brief Convert native SRT error to Java SRT error
 *
 * @param env Java environment
 * @param error_type Native SRT error
 * @return return corresponding Java SRT error
 */
jobject srt_error_n2j(JNIEnv *env, int error_type);

#ifdef __cplusplus
}
#endif