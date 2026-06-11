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
