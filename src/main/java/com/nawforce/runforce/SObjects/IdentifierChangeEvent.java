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
public class IdentifierChangeEvent extends SObject {
	public static SObjectType$<IdentifierChangeEvent> SObjectType;
	public static SObjectFields$<IdentifierChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveDate;
	public Datetime EndDate;
	public Id Id;
	public Id IdTypeId;
	public SObject IdType;
	public String IdUsageType;
	public String IdValue;
	public String IdentifierKey;
	public Id IssuingAuthorityId;
	public Account IssuingAuthority;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;

	public IdentifierChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentifierChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentifierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentifierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentifierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
