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
public class AnlytDataAssetUsageEvent extends SObject {
	public static SObjectType$<AnlytDataAssetUsageEvent> SObjectType;
	public static SObjectFields$<AnlytDataAssetUsageEvent> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataAsset;
	public String DataAssetType;
	public Datetime EventDate;
	public String EventUuid;
	public String ReplayId;
	public String Source;
	public String UserIdentifier;

	public AnlytDataAssetUsageEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetUsageEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetUsageEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetUsageEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetUsageEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
