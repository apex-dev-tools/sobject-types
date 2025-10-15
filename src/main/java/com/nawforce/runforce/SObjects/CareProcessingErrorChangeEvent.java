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
public class CareProcessingErrorChangeEvent extends SObject {
	public static SObjectType$<CareProcessingErrorChangeEvent> SObjectType;
	public static SObjectFields$<CareProcessingErrorChangeEvent> Fields;

	public Id ActionCodeId;
	public SObject ActionCode;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id ErrorCodeId;
	public SObject ErrorCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ReferenceObjectId;
	public SObject ReferenceObject;
	public String ReplayId;

	public CareProcessingErrorChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProcessingErrorChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProcessingErrorChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProcessingErrorChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProcessingErrorChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
