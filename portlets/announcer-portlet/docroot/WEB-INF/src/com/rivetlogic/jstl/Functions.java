/**
 * Copyright (C) 2005-2014 Rivet Logic Corporation.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; version 2
 * of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301, USA.
 */

package com.rivetlogic.jstl;

import java.util.Arrays;

/**
 * The Class Functions.
 */
public class Functions {

	/**
	 * Arr contains.
	 *
	 * @param strArray the str array
	 * @param value the value
	 * @return true, if successful
	 */
	public static boolean arrContains(String[] strArray, String value){
		if((strArray != null) && (value != null))
			return Arrays.asList(strArray).contains(value);
		return false;
	}
}
