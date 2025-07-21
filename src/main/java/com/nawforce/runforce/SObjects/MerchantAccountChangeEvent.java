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
public class MerchantAccountChangeEvent extends SObject {
	public static SObjectType$<MerchantAccountChangeEvent> SObjectType;
	public static SObjectFields$<MerchantAccountChangeEvent> Fields;

	public String AccountDescription;
	public Object ChangeEventHeader;
	public String CountryIsoCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultTapToPayLocation;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Mode;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PaymentStatus;
	public String PayoutStatus;
	public String ReplayId;
	public String Status;

	public MerchantAccountChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MerchantAccountChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MerchantAccountChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MerchantAccountChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MerchantAccountChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
