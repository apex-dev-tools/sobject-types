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
public class AnlytDataAssetEventStore extends SObject {
	public static SObjectType$<AnlytDataAssetEventStore> SObjectType;
	public static SObjectFields$<AnlytDataAssetEventStore> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataAsset;
	public String DataAssetType;
	public Datetime EventDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Source;
	public Datetime SystemModstamp;
	public String UserIdentifier;

	public AnlytDataAssetEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnlytDataAssetEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
