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
public class PurchaserPlanAssnChangeEvent extends SObject {
	public static SObjectType$<PurchaserPlanAssnChangeEvent> SObjectType;
	public static SObjectFields$<PurchaserPlanAssnChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PurchaserId;
	public Account Purchaser;
	public Id PurchaserPlanId;
	public PurchaserPlan PurchaserPlan;
	public String ReplayId;
	public String Role;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;

	public PurchaserPlanAssnChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanAssnChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanAssnChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanAssnChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanAssnChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
