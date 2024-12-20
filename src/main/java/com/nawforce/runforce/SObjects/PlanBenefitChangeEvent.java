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
public class PlanBenefitChangeEvent extends SObject {
	public static SObjectType$<PlanBenefitChangeEvent> SObjectType;
	public static SObjectFields$<PlanBenefitChangeEvent> Fields;

	public String BenefitNotes;
	public Object ChangeEventHeader;
	public String CoinsuranceNotes;
	public String CopayNotes;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeductibleNotes;
	public String DocumentLocation;
	public Date EffectiveDate;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Decimal EmergencyDepartmentCopay;
	public Decimal FamilyInNetworkDeductible;
	public Decimal FamilyInNetworkOutofPocket;
	public Decimal FamilyOutofNetworkDeductible;
	public Decimal FamilyOutofNetworkOutofPocket;
	public Id Id;
	public Decimal InNetworkCoinsuranceAmount;
	public Decimal InNetworkCoinsurancePercentage;
	public Decimal InNetworkLifetimeMaximum;
	public Decimal IndividualInNetworkDeductible;
	public Decimal IndividualInNetworkOutofPocket;
	public Decimal IndividualOutofNetworkDeductible;
	public Decimal IndividualOutofNetworkOutofPocket;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LifetimeMaximumNotes;
	public String Name;
	public Decimal OutofNetworkCoinsuranceAmount;
	public Decimal OutofNetworkCoinsurancePercentage;
	public Decimal OutofNetworkLifetimeMaximum;
	public String OutofPocketNotes;
	public Id OwnerId;
	public User Owner;
	public Decimal PrimaryCareCopay;
	public Id PurchaserPlanId;
	public PurchaserPlan PurchaserPlan;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Decimal SpecialistCopay;
	public String Status;
	public Decimal UrgentCareCopay;

	public PlanBenefitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
