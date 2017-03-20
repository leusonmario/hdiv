/**
 * Copyright 2005-2016 hdiv.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hdiv.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultValidationContextFactory implements ValidationContextFactory {

	public ValidationContext newInstance(final HttpServletRequest request, final HttpServletResponse response, final StateRestorer restorer,
			final boolean obfuscation) {
		return new ValidationContextImpl(request, response, restorer, obfuscation);
	}
}
