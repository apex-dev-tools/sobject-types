/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class TestSuiteMembership extends SObject {
	public static SObjectType$<TestSuiteMembership> SObjectType;
	public static SObjectFields$<TestSuiteMembership> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Id ApexTestSuiteId;
	public ApexTestSuite ApexTestSuite;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public TestSuiteMembership clone$() {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
