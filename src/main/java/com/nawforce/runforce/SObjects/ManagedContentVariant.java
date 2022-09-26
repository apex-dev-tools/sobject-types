/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ManagedContentVariant extends SObject {
	public static SObjectType$<ManagedContentVariant> SObjectType;
	public static SObjectFields$<ManagedContentVariant> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPublished;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ManagedContentId;
	public ManagedContent ManagedContent;
	public String ManagedContentKey;
	public String ManagedContentVariantStatus;
	public String Name;
	public Datetime SystemModstamp;
	public String UrlName;
	public String VariantType;

	public ManagedContentVariant clone$() {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentVariant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
