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
public class CareBenefitVerifyRequestChangeEvent extends SObject {
	public static SObjectType$<CareBenefitVerifyRequestChangeEvent> SObjectType;
	public static SObjectFields$<CareBenefitVerifyRequestChangeEvent> Fields;

	public Id AuthorizedPrescriptionId;
	public MedicationRequest AuthorizedPrescription;
	public Id BenefitCategoryCodeId;
	public CodeSet BenefitCategoryCode;
	public Datetime BillablePrdEndDateTime;
	public Datetime BillablePrdStartDateTime;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id CoverageBenefitId;
	public CoverageBenefit CoverageBenefit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberPlanId;
	public MemberPlan MemberPlan;
	public String Name;
	public Id OriginalPrescriptionId;
	public MedicationRequest OriginalPrescription;
	public Id PayerId;
	public Account Payer;
	public Id PrescriberId;
	public HealthcareProvider Prescriber;
	public Id PriorityCodeId;
	public CodeSet PriorityCode;
	public Id ProviderId;
	public SObject Provider;
	public String ReplayId;
	public Datetime RequestDate;
	public Id RequestedById;
	public User RequestedBy;
	public Id RequesterId;
	public SObject Requester;
	public String Response;
	public String Status;
	public String StatusReason;

	public CareBenefitVerifyRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifyRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
