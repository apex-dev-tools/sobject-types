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
public class FinancialGoalChangeEvent extends SObject {
	public static SObjectType$<FinancialGoalChangeEvent> SObjectType;
	public static SObjectFields$<FinancialGoalChangeEvent> Fields;

	public Decimal ActualAmount;
	public String Category;
	public Object ChangeEventHeader;
	public Date CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal EstimatedSuccessPercent;
	public Id FinancialPlanId;
	public FinancialPlan FinancialPlan;
	public String Frequency;
	public Id Id;
	public Decimal InitialAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public String ReplayId;
	public String SourceSystemIdentifier;
	public Date StartDate;
	public String Status;
	public Decimal TargetAmount;
	public Date TargetDate;
	public String Type;

	public FinancialGoalChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinancialGoalChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinancialGoalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinancialGoalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinancialGoalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
