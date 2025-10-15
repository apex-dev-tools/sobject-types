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
public class InsPolicyAssetAttribute extends SObject {
	public static SObjectType$<InsPolicyAssetAttribute> SObjectType;
	public static SObjectFields$<InsPolicyAssetAttribute> Fields;

	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeName;
	public Id AttributePicklistValueId;
	public AttributePicklistValue AttributePicklistValue;
	public String AttributeValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalId;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;

	public InsPolicyAssetAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyAssetAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyAssetAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyAssetAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsPolicyAssetAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
