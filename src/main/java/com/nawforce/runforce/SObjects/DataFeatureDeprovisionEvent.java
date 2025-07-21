/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataFeatureDeprovisionEvent extends SObject {
	public static SObjectType$<DataFeatureDeprovisionEvent> SObjectType;
	public static SObjectFields$<DataFeatureDeprovisionEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Error;
	public String EventUuid;
	public String FeatureIdentifierList;
	public String ReplayId;
	public String Status;

	public DataFeatureDeprovisionEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataFeatureDeprovisionEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataFeatureDeprovisionEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataFeatureDeprovisionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataFeatureDeprovisionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
