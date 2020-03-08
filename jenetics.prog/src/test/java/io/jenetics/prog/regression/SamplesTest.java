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
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmail.com)
 */
package io.jenetics.prog.regression;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmail.com">Franz Wilhelmstötter</a>
 */
public class SamplesTest {

	@Test
	public void create() {
		final List<Sample<Double>> points = List.of(
			Sample.ofDouble(1, 2, 3, 4),
			Sample.ofDouble(1, 2, 3, 4),
			Sample.ofDouble(1, 2, 3, 4),
			Sample.ofDouble(1, 2, 3, 4)
		);

		final Samples<Double> samples = new Samples<>(points);
		Assert.assertEquals(samples.arguments().getClass(), Double[][].class);
		Assert.assertEquals(samples.results().getClass(), Double[].class);
	}

}
