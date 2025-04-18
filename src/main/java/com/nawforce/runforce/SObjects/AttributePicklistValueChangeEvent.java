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
public class AttributePicklistValueChangeEvent extends SObject {
	public static SObjectType$<AttributePicklistValueChangeEvent> SObjectType;
	public static SObjectFields$<AttributePicklistValueChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PicklistId;
	public AttributePicklist Picklist;
	public String ReplayId;
	public String Value;

	public AttributePicklistValueChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttributePicklistValueChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttributePicklistValueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttributePicklistValueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttributePicklistValueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
