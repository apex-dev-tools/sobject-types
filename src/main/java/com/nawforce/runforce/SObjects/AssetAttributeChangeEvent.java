/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AssetAttributeChangeEvent extends SObject {
	public static SObjectType$<AssetAttributeChangeEvent> SObjectType;
	public static SObjectFields$<AssetAttributeChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeName;
	public Id AttributePicklistValueId;
	public AttributePicklistValue AttributePicklistValue;
	public String AttributeValue;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalId;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;

	public AssetAttributeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetAttributeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetAttributeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetAttributeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetAttributeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
