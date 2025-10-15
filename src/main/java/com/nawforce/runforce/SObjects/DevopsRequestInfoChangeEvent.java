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
public class DevopsRequestInfoChangeEvent extends SObject {
	public static SObjectType$<DevopsRequestInfoChangeEvent> SObjectType;
	public static SObjectFields$<DevopsRequestInfoChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorDetails;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Message;
	public String Name;
	public String OperationType;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Datetime RequestCompletionDate;
	public String RequestToken;
	public String Status;

	public DevopsRequestInfoChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
