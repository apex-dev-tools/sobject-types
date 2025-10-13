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
public class CareRequestExchangeInfoChangeEvent extends SObject {
	public static SObjectType$<CareRequestExchangeInfoChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestExchangeInfoChangeEvent> Fields;

	public Id CareRequestId;
	public CareRequest CareRequest;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public String ExchangeMode;
	public String ExchangeTargetType;
	public String ExchangeType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Datetime RequestDateTime;
	public Datetime ResponseDateTime;
	public Integer ResponseStatusCode;

	public CareRequestExchangeInfoChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExchangeInfoChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExchangeInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExchangeInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExchangeInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
