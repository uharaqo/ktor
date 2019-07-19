/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.client.call

import kotlin.reflect.*

/**
 * Check [this] is instance of [type].
 */
internal actual fun Any.instanceOf(type: KClassifier): Boolean =
    (type as? KClass<*>)?.java?.isInstance(this) == true
