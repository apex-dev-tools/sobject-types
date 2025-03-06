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
public class CdpFeatureCleanupEvent extends SObject {
	public static SObjectType$<CdpFeatureCleanupEvent> SObjectType;
	public static SObjectFields$<CdpFeatureCleanupEvent> Fields;

	public String CleanupStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Error;
	public String EventUuid;
	public String FeatureIdentifierList;
	public String ReplayId;

	public CdpFeatureCleanupEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CdpFeatureCleanupEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CdpFeatureCleanupEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CdpFeatureCleanupEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CdpFeatureCleanupEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
