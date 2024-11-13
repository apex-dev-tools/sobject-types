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
public class AssetRelationshipChangeEvent extends SObject {
	public static SObjectType$<AssetRelationshipChangeEvent> SObjectType;
	public static SObjectFields$<AssetRelationshipChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public String AssetRelationshipNumber;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime FromDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RelatedAssetId;
	public Asset RelatedAsset;
	public String RelationshipType;
	public String ReplayId;
	public Datetime ToDate;

	public AssetRelationshipChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetRelationshipChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetRelationshipChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetRelationshipChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetRelationshipChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
