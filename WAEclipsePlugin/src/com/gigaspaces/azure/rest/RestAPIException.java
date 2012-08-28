/*******************************************************************************
 * Copyright (c) 2012 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.gigaspaces.azure.rest;

import com.gigaspaces.azure.model.Response;


public class RestAPIException extends Exception {

	private static final long serialVersionUID = -9138753688813724122L;
	
	protected String status;
	protected String description;

	public RestAPIException(Response<?> response) {
		super(String.format(Messages.RestAPIException,
				response.getStatus(), response.getDescription()));
	}
	
	public RestAPIException(Response<?> response, String desc) {
		super(String.format(Messages.RestAPIException,
				response.getStatus(), desc));		
	}
	
	public RestAPIException(String errorCode, String errorMessage) {
		super(String.format(Messages.RestAPIException,
				errorCode, errorMessage));		
	}

	public RestAPIException(String message) {
		super(message);
	}
}