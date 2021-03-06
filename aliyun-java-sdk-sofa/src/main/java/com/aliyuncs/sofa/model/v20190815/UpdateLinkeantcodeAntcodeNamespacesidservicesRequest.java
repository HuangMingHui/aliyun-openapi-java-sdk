/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeNamespacesidservicesRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeNamespacesidservicesResponse> {
	   

	private String id;

	private String requestGitOperate;

	private String updateDTOJsonStr;

	private String serviceId;
	public UpdateLinkeantcodeAntcodeNamespacesidservicesRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeNamespacesidservices", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getUpdateDTOJsonStr() {
		return this.updateDTOJsonStr;
	}

	public void setUpdateDTOJsonStr(String updateDTOJsonStr) {
		this.updateDTOJsonStr = updateDTOJsonStr;
		if(updateDTOJsonStr != null){
			putBodyParameter("UpdateDTOJsonStr", updateDTOJsonStr);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putBodyParameter("ServiceId", serviceId);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeNamespacesidservicesResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.class;
	}

}
