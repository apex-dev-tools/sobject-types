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
public class Pricebook2ChangeEvent extends SObject {
	public static SObjectType$<Pricebook2ChangeEvent> SObjectType;
	public static SObjectFields$<Pricebook2ChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsStandard;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Datetime ValidFrom;
	public Datetime ValidTo;

	public Pricebook2ChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2ChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
