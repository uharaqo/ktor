/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.client.call

import kotlin.reflect.*

/**
 * Information about type.
 */
@Deprecated(
    "Ktor Type deprecated. Consider using [KType] instead.",
    ReplaceWith("KType"),
    DeprecationLevel.ERROR
)
typealias Type = KType

/**
 * Ktor type information.
 * @param type: source KClass<*>
 * @param reifiedType: type with substituted generics
 */
@Deprecated(
    "[TypeInfo] deprecated. Consider using [KType] instead.",
    ReplaceWith("typeOf<>()"),
    DeprecationLevel.ERROR
)
data class TypeInfo(val type: KClass<*>, val reifiedType: KType)

/**
 * Returns [TypeInfo] for the specified type [T]
 */
@UseExperimental(ExperimentalStdlibApi::class)
@Deprecated(
    "[typeInfo] deprecated. Consider using [typeOf] instead.",
    ReplaceWith("typeOf<>()"),
    DeprecationLevel.ERROR
)
@Suppress("DEPRECATION_ERROR")
inline fun <reified T> typeInfo(): TypeInfo = error("[typeInfo] deprecated. Consider using [typeOf] instead.")

/**
 * Check [this] is instance of [type].
 */
internal expect fun Any.instanceOf(type: KClassifier): Boolean
