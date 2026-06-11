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
public class AccountingModelConfig extends SObject {
	public static SObjectType$<AccountingModelConfig> SObjectType;
	public static SObjectFields$<AccountingModelConfig> Fields;

	public String AccountingType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultAccrualAccountCode;
	public String DefaultWriteOffAccountCode;
	public String DeveloperName;
	public Datetime EarliestCreatedDate;
	public String ExpectedCashFlowGrouping;
	public String FinanceBook;
	public String FullName;
	public Id Id;
	public String InternalMappingDetails;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsGroupedByFundAccount;
	public Boolean IsUsed;
	public String JobFilterCriteria;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String PaidCashFlowGrouping;
	public String RecordTypeFilter;
	public Integer RunOrder;
	public Datetime SystemModstamp;

	public AccountingModelConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountingModelConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountingModelConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountingModelConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountingModelConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
