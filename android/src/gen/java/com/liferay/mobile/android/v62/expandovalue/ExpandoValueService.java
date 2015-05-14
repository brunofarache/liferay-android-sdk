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

package com.liferay.mobile.android.v62.expandovalue;

import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ExpandoValueService extends BaseService {

	public ExpandoValueService(Session session) {
		super(session);
	}

	public JSONObject addValue(long companyId, String className, String tableName, String columnName, long classPK, String data) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", checkNull(className));
			_params.put("tableName", checkNull(tableName));
			_params.put("columnName", checkNull(columnName));
			_params.put("classPK", classPK);
			_params.put("data", checkNull(data));

			_command.put("/expandovalue/add-value", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void addValues(long companyId, String className, String tableName, long classPK, JSONObject attributeValues) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", checkNull(className));
			_params.put("tableName", checkNull(tableName));
			_params.put("classPK", classPK);
			_params.put("attributeValues", checkNull(attributeValues));

			_command.put("/expandovalue/add-values", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getData(long companyId, String className, String tableName, String columnName, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", checkNull(className));
			_params.put("tableName", checkNull(tableName));
			_params.put("columnName", checkNull(columnName));
			_params.put("classPK", classPK);

			_command.put("/expandovalue/get-data", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getData(long companyId, String className, String tableName, JSONObject columnNames, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", checkNull(className));
			_params.put("tableName", checkNull(tableName));
			_params.put("columnNames", checkNull(columnNames));
			_params.put("classPK", classPK);

			_command.put("/expandovalue/get-data", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getJsonData(long companyId, String className, String tableName, String columnName, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", checkNull(className));
			_params.put("tableName", checkNull(tableName));
			_params.put("columnName", checkNull(columnName));
			_params.put("classPK", classPK);

			_command.put("/expandovalue/get-json-data", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}