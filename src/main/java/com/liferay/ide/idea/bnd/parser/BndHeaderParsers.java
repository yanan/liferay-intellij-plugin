/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ide.idea.bnd.parser;

import java.util.HashMap;
import java.util.Map;

import org.gradle.internal.impldep.aQute.bnd.osgi.Constants;

/**
 * @author Dominik Marks
 */
public class BndHeaderParsers {

	public static final Map<String, BndHeaderParser> parsersMap = new HashMap<String, BndHeaderParser>() {
		{
			for (String header : Constants.headers) {
				if (!containsKey(header)) {
					put(header, BndHeaderParser.INSTANCE);
				}
			}

			for (String option : Constants.options) {
				if (!containsKey(option)) {
					put(option, BndHeaderParser.INSTANCE);
				}
			}
		}
	};

}