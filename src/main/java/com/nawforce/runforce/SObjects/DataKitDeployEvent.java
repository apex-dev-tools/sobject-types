/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataKitDeployEvent extends SObject {
	public static SObjectType$<DataKitDeployEvent> SObjectType;
	public static SObjectFields$<DataKitDeployEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataKitDeployStatus;
	public String DataKitName;
	public String DataspaceName;
	public Datetime DeployStartTime;
	public String ErrorDetails;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventUuid;
	public String IsDataKitDeployStatusSuccess;
	public String JobIdentifier;
	public String ReplayId;
	public String TemplateName;

	public DataKitDeployEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeployEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeployEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeployEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeployEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
