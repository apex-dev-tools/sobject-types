/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ApexTestRunResult extends SObject {
	public static SObjectType$<ApexTestRunResult> SObjectType;
	public static SObjectFields$<ApexTestRunResult> Fields;

	public Id AsyncApexJobId;
	public AsyncApexJob AsyncApexJob;
	public Integer ClassesCompleted;
	public Integer ClassesEnqueued;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsAllTests;
	public Boolean IsDeleted;
	public String JobName;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MethodsCompleted;
	public Integer MethodsEnqueued;
	public Integer MethodsFailed;
	public String Source;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;
	public Integer TestTime;
	public Id UserId;
	public User User;

	public ApexTestRunResult clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTestRunResult clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestRunResult clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestRunResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestRunResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
