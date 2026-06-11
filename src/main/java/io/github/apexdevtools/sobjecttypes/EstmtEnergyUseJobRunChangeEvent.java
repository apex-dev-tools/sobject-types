/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EstmtEnergyUseJobRunChangeEvent extends SObject {
	public static SObjectType$<EstmtEnergyUseJobRunChangeEvent> SObjectType;
	public static SObjectFields$<EstmtEnergyUseJobRunChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EstmtEnergyUseCriteriaId;
	public EstmtEnergyUseCriteria EstmtEnergyUseCriteria;
	public Integer FailedRecords;
	public Date FromDate;
	public Id Id;
	public Id JobId;
	public BatchJob Job;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Integer SuccessRecords;
	public Date ToDate;

	public EstmtEnergyUseJobRunChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
