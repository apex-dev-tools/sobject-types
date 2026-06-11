/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContractLineOutcomeDataChangeEvent extends SObject {
	public static SObjectType$<ContractLineOutcomeDataChangeEvent> SObjectType;
	public static SObjectFields$<ContractLineOutcomeDataChangeEvent> Fields;

	public Decimal CalculatedValue;
	public Datetime CaptureDate;
	public Object ChangeEventHeader;
	public Id ContractLineOutcomeId;
	public ContractLineOutcome ContractLineOutcome;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public String KeyPerformanceIndicator;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Decimal Value;

	public ContractLineOutcomeDataChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeDataChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeDataChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeDataChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeDataChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
