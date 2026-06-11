/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BackgroundOperation extends SObject {
	public static SObjectType$<BackgroundOperation> SObjectType;
	public static SObjectFields$<BackgroundOperation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Error;
	public String ExecutionGroup;
	public Datetime ExpiresAt;
	public Datetime FinishedAt;
	public Id GroupLeaderId;
	public BackgroundOperation GroupLeader;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer NumFollowers;
	public String ParentKey;
	public Datetime ProcessAfter;
	public Integer RetryBackoff;
	public Integer RetryCount;
	public Integer RetryLimit;
	public String SequenceGroup;
	public Integer SequenceNumber;
	public Datetime StartedAt;
	public String Status;
	public Datetime SubmittedAt;
	public Datetime SystemModstamp;
	public Integer Timeout;
	public String Type;
	public String WorkerUri;

	public BackgroundOperation[] MergedOperations;

	public BackgroundOperation clone$() {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
