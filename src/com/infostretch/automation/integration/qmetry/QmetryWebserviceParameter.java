/*******************************************************************************
* QMetry Automation Framework provides a powerful and versatile platform to author Test Cases in 
*                Behavior Driven, Keyword Driven or Code Driven approach
*               
*    Copyright 2016 Infostretch Corporation
*
*    This program is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    any later version.
*
*               See the NOTICE file in root folder of distributed with this work for
*               additional information regarding copyright ownership
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*   You should have received a copy of the GNU General Public License
*    along with this program in the name of LICENSE. 
*    
*    It is located at the root folder of the distribution.
*                If not, see https://opensource.org/licenses/gpl-3.0.html
********************************************************************************/

package com.infostretch.automation.integration.qmetry;

import com.infostretch.automation.core.ConfigurationManager;

public class QmetryWebserviceParameter {
	public enum QmetryWSParameters {
		Project("integration.param.qmetry.project"), Release("integration.param.qmetry.release"), Build(
				"integration.param.qmetry.build"), Cycle("integration.param.qmetry.cycle"), SuiteId(
						"integration.param.qmetry.suitid"), Platform("integration.param.qmetry.platform"), Drop(
								"integration.param.qmetry.drop"), Attachments("");
		private String defaultVal;

		private QmetryWSParameters(String def) {
			defaultVal = def;
		}

		public String getDefaultVal() {

			if (defaultVal == "") {
				return "";
			}
			return ConfigurationManager.getBundle().getString(defaultVal, "");
		}
	}

}
