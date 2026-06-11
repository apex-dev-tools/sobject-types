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
public class RevenueAsyncOperation extends SObject {
	public static SObjectType$<RevenueAsyncOperation> SObjectType;
	public static SObjectFields$<RevenueAsyncOperation> Fields;

	public String AsyncOperationNumber;
	public String CorrelationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime ExpiresAt;
	public Integer FailedJobItems;
	public Datetime FinishedAt;
	public Id Id;
	public Boolean IsDeleted;
	public String JobType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id ParentOperationId;
	public RevenueAsyncOperation ParentOperation;
	public Id ReferenceEntityId;
	public Name ReferenceEntity;
	public String Response;
	public Datetime StartedAt;
	public String Status;
	public Datetime SubmittedAt;
	public Integer SuccessfulJobItems;
	public Datetime SystemModstamp;
	public Integer TotalJobItems;

	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public RevenueAsyncOperation[] RevenueAsyncOperations;

	public RevenueAsyncOperation clone$() {throw new java.lang.UnsupportedOperationException();}
	public RevenueAsyncOperation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RevenueAsyncOperation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RevenueAsyncOperation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RevenueAsyncOperation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
