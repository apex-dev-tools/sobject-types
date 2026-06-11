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
public class DataMultiOrgServiceEvent extends SObject {
	public static SObjectType$<DataMultiOrgServiceEvent> SObjectType;
	public static SObjectFields$<DataMultiOrgServiceEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDateTime;
	public Datetime EventPublishDateTime;
	public String EventSchemaVersion;
	public String EventType;
	public String EventUuid;
	public String MultiOrgEventType;
	public String Payload;
	public String ReplayId;

	public DataMultiOrgServiceEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgServiceEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgServiceEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgServiceEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgServiceEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
