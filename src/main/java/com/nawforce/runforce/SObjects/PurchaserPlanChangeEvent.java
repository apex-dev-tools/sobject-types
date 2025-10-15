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
public class PurchaserPlanChangeEvent extends SObject {
	public static SObjectType$<PurchaserPlanChangeEvent> SObjectType;
	public static SObjectFields$<PurchaserPlanChangeEvent> Fields;

	public String Affiliation;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Boolean IsVerifiable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LineOfBusiness;
	public String Name;
	public String Notes;
	public Id OwnerId;
	public User Owner;
	public Id PayerId;
	public Account Payer;
	public String PlanNumber;
	public String PlanStatus;
	public String PlanType;
	public String ReplayId;
	public String ServiceType;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String SponsorType;

	public PurchaserPlanChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
