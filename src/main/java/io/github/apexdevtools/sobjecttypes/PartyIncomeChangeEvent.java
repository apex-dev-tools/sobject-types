/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PartyIncomeChangeEvent extends SObject {
	public static SObjectType$<PartyIncomeChangeEvent> SObjectType;
	public static SObjectFields$<PartyIncomeChangeEvent> Fields;

	public Integer CalendarYear;
	public Object ChangeEventHeader;
	public Id ClaimId;
	public Claim Claim;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmployerAddress;
	public Id EmployerId;
	public Account Employer;
	public String EmployerName;
	public String EmployerPhone;
	public Datetime EndDate;
	public Id Id;
	public Decimal IncomeAmount;
	public String IncomeFrequency;
	public Decimal IncomeLossPercent;
	public String IncomeStatus;
	public String IncomeType;
	public String JobTitle;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ModificationReason;
	public String Name;
	public Decimal NetIncome;
	public Id OwnerId;
	public User Owner;
	public Id PartyId;
	public SObject Party;
	public String ReplayId;
	public Datetime StartDate;
	public String UsageType;

	public PartyIncomeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyIncomeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyIncomeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyIncomeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyIncomeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
