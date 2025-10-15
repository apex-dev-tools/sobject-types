/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataCustomCodeStatEvent extends SObject {
	public static SObjectType$<DataCustomCodeStatEvent> SObjectType;
	public static SObjectFields$<DataCustomCodeStatEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataCustomCodeDefDeveloperName;
	public Integer DeploymentFailureCode;
	public String DeploymentFailureReason;
	public String DeploymentStatus;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String ReplayId;
	public String SchemaVersion;

	public DataCustomCodeStatEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataCustomCodeStatEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataCustomCodeStatEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataCustomCodeStatEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataCustomCodeStatEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
