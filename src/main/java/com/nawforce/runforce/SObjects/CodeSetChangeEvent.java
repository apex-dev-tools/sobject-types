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
public class CodeSetChangeEvent extends SObject {
	public static SObjectType$<CodeSetChangeEvent> SObjectType;
	public static SObjectFields$<CodeSetChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Code;
	public String CodeDescription;
	public String CodeSetKey;
	public String CodeSetType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCustomCode;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceSystem;
	public Date StartDate;
	public String SystemVersion;

	public CodeSetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CodeSetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
