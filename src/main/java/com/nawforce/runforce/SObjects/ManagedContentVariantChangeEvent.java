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
