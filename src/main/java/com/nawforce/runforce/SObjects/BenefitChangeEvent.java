/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BenefitChangeEvent extends SObject {
	public static SObjectType$<BenefitChangeEvent> SObjectType;
	public static SObjectFields$<BenefitChangeEvent> Fields;

	public Id BenefitActionId;
	public BenefitAction BenefitAction;
	public Id BenefitManagerId;
	public User BenefitManager;
	public Id BenefitTypeId;
	public BenefitType BenefitType;
	public String BnftDisbFieldSetApiName;
	public Decimal BudgetAmount;
	public Decimal BudgetAmountUsed;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentMonthDisbursedQty;
	public Decimal CurrentYearAssignedQty;
	public Decimal CurrentYearDisbursedQty;
	public String Description;
	public Datetime EndDateTime;
	public Decimal EnrolleeAmountLimit;
	public String EnrolleeLimitFrequency;
	public Decimal EnrolleeTrxnAmountLimit;
	public Id Id;
	public String ImageUrl;
	public Boolean IsActive;
	public Boolean IsBenefitCalculated;
	public Boolean IsBenefitSelectionAllowed;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaxBenefitAmount;
	public Decimal MinBenefitAmount;
	public String Name;
	public String PayeeType;
	public String PayoutFrequency;
	public Decimal PreviousMonthDisbursedQty;
	public Decimal PreviousYearAssignedQty;
	public Decimal PreviousYearDisbursedQty;
	public Integer PrioritySequence;
	public Id Product2Id;
	public Product2 Product2;
	public Integer RecertificationFrequency;
	public String ReplayId;
	public String Rule;
	public Datetime StartDateTime;
	public Integer StartRecertificationFrom;
	public Id UnitId;
	public UnitOfMeasure Unit;
	public Decimal Value;

	public BenefitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BenefitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
