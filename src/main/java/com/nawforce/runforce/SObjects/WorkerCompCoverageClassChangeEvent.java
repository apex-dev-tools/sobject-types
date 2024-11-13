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
public class WorkerCompCoverageClassChangeEvent extends SObject {
	public static SObjectType$<WorkerCompCoverageClassChangeEvent> SObjectType;
	public static SObjectFields$<WorkerCompCoverageClassChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal Premium;
	public String ReplayId;
	public Decimal TotalExposure;
	public String WorkerClass;
	public Integer WorkerCount;
	public Id WorkerLocationId;
	public AssociatedLocation WorkerLocation;

	public WorkerCompCoverageClassChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
