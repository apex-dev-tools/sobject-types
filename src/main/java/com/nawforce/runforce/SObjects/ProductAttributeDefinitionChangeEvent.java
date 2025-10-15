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
public class ProductAttributeDefinitionChangeEvent extends SObject {
	public static SObjectType$<ProductAttributeDefinitionChangeEvent> SObjectType;
	public static SObjectFields$<ProductAttributeDefinitionChangeEvent> Fields;

	public Id AttributeCategoryId;
	public AttributeCategory AttributeCategory;
	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeNameOverride;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String Description;
	public String DisplayType;
	public String HelpText;
	public Id Id;
	public Boolean IsHidden;
	public Boolean IsPriceImpacting;
	public Boolean IsReadOnly;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaximumCharacterCount;
	public String MaximumValue;
	public Integer MinimumCharacterCount;
	public String MinimumValue;
	public String Name;
	public Id OverriddenProductAttributeDefinitionId;
	public ProductAttributeDefinition OverriddenProductAttributeDefinition;
	public Id OverrideContextId;
	public SObject OverrideContext;
	public Id OwnerId;
	public User Owner;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductClassificationAttributeId;
	public ProductClassificationAttr ProductClassificationAttribute;
	public String ReplayId;
	public Integer Sequence;
	public String Status;
	public String StepValue;
	public String ValueDescription;

	public ProductAttributeDefinitionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinitionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
