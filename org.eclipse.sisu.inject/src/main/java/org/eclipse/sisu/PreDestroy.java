/********************************************************************************
 * Copyright (c) 2023-present Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package org.eclipse.sisu;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The PreDestroy annotation is used on methods as a callback notification to 
 * signal that the instance is in the process of being removed by the 
 * container. The method annotated with PreDestroy is typically used to 
 * release resources that it has been holding.
 * <p>
 * This annotation is Sisu specific annotation, that has same semantics as
 * {@link jakarta.annotation.PreDestroy} annotation has, and may be used
 * interchangeably.
 * <p>
 * To use annotation {@link org.eclipse.sisu.bean.LifecycleModule} needs to be
 * installed.
 *
 * @since TBD
 */

@Target( value = { ElementType.METHOD } )
@Retention( RetentionPolicy.RUNTIME )
@Documented
public @interface PreDestroy {
}
