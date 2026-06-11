/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public String EventType;
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
