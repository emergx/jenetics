/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics.internal.collection;

import java.io.Serializable;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version !__version__! &mdash; <em>$Date: 2014-06-25 $</em>
 * @since !__version__!
 */
public class Array {

	@FunctionalInterface
	public static interface Getter<T> {
		public T get(final int index);
	}

	@FunctionalInterface
	public static interface Setter<T> {
		public void set(final int index, final T value);
	}

	@FunctionalInterface
	public static interface Copier<A> {
		public A copy(final A array, final int from, final int to);
	}

}
