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
public class ManagedContentVariantChangeEvent extends SObject {
	public static SObjectType$<ManagedContentVariantChangeEvent> SObjectType;
	public static SObjectFields$<ManagedContentVariantChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String ContentTypeFullyQualifiedName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsReady;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ManagedContentId;
	public ManagedContent ManagedContent;
	public String ManagedContentKey;
	public String ManagedContentVariantStatus;
	public String Name;
	public String ReplayId;
	public String UrlName;
	public String VariantType;

	public ManagedContentVariantChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariantChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
